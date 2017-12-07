package com.bootdo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	@Autowired
    private SimpMessagingTemplate simpMessagingTemplate;    
    @RequestMapping("/helloSocket")    
    public String index(){        
        return "index";    
    }    
    @MessageMapping("/change-notice")
    @SendTo("/topic/notice")
    public String greeting(String value) {    
        return value;
    }
}
