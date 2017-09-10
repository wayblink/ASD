package com.wayblink.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wayblink.entity.Message;
import com.wayblink.service.MessageService;
import com.wayblink.util.DateUtil;
import com.wayblink.util.DecodeUtil;

//@EnableAutoConfiguration  
@RestController  
@RequestMapping("/message")  
public class MessageController {
    protected static Logger logger=LoggerFactory.getLogger(MessageController.class);  
    @Autowired
    private MessageService messageService;
    @Autowired
    private ObjectMapper mapper; 
    
    @RequestMapping(value = "/insert/{content}")  
    String insert(@PathVariable String content) {  
        logger.info("Insert Message: {}",content); 
        int oid = (int) (DateUtil.currentDate()%1000000);
        messageService.addMessage(oid,content);
        return "Insert Message: "+content;  
    }
    
    @RequestMapping(value = "/get/{oid}")  
    String get(@PathVariable int oid) {  
        logger.info("Get Message Where oid is: {}",oid); 
        Message message = messageService.getMessage(oid);
        return message.getContent();  
    }
    
    @RequestMapping(value = "/get/json/{oid}")  
    String getJson(@PathVariable int oid) throws JsonProcessingException {  
        logger.info("Get Message Where oid is: {}",oid); 
        Message message = messageService.getMessage(oid);
        return mapper.writeValueAsString(message); 
    }
    
    @RequestMapping(value = "/delete/{oid}")  
    String delete(@PathVariable int oid) {  
        logger.info("Delete Message Where oid is: {}",oid); 
        messageService.deleteMessage(oid);
        return "Delete Message Where oid is:" + oid;  
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST) 
    String update(@RequestParam(value="oid")int oid, @RequestParam(value="content")String content)
    {
        messageService.updateMessage(oid, content);
        return "Update Message Set content = " + content + "Where id is:" + oid;
    }
    
    @RequestMapping(value = "/request",produces="application/json;charset=UTF-8") 
    String getRequest(HttpServletRequest request)
    {     
        String data = DecodeUtil.filter(request.getQueryString());
        logger.info("Insert Message: {}", data); 
        int oid = (int) (DateUtil.currentDate()%1000000);
        messageService.addMessage(oid,data);
        return Integer.toString(oid);  
    }
    
}
