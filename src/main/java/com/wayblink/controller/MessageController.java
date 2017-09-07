package com.wayblink.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wayblink.entity.Message;
import com.wayblink.service.MessageService;

//@EnableAutoConfiguration  
@RestController  
@RequestMapping("/message")  
public class MessageController {
    protected static Logger logger=LoggerFactory.getLogger(MessageController.class);  
    @Autowired
    private MessageService messageService; 
    
    @RequestMapping(value = "/insert/{content}")  
    String insert(@PathVariable String content) {  
        logger.info("Insert Message: {}",content); 
        messageService.addMessage(content);
        return "Insert Message: "+content;  
    }
    
    @RequestMapping(value = "/get/{id}")  
    String get(@PathVariable int id) {  
        logger.info("Get Message Where id is: {}",id); 
        Message message = messageService.getMessage(id);
        return message.getContent();  
    }
    
    @RequestMapping(value = "/delete/{id}")  
    String delete(@PathVariable int id) {  
        logger.info("Delete Message Where id is: {}",id); 
        messageService.deleteMessage(id);
        return "Delete Message Where id is:" + id;  
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST) 
    String update(@RequestParam(value="id")int id, @RequestParam(value="content")String content)
    {
        messageService.updateMessage(id, content);
        return "Update Message Set content = " + content + "Where id is:" + id;
    }
}
