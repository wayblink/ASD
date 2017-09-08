package com.wayblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wayblink.Dao.MessageMapper;
import com.wayblink.entity.Message;

@Service
public class MessageService {
    @Autowired
    private MessageMapper mapper;
    
    public Message getMessage(int oid) {
        return mapper.get(oid);
    }

    public void addMessage(int oid, String content) {
        mapper.add(oid, content);
    }

    public void deleteMessage(int oid) {
        mapper.delete(oid);
    }

    public void updateMessage(int oid, String content) {
        mapper.update(oid, content);
    }
}
