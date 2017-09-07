package com.wayblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wayblink.Dao.MessageMapper;
import com.wayblink.entity.Message;

@Service
public class MessageService {
    @Autowired
    private MessageMapper mapper;
    
    public Message getMessage(int id) {
        return mapper.get(id);
    }

    public void addMessage(String content) {
        mapper.add(content);
    }

    public void deleteMessage(int id) {
        mapper.delete(id);
    }

    public void updateMessage(int id, String content) {
        mapper.update(id, content);
    }
}
