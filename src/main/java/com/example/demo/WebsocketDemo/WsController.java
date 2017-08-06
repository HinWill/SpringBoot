package com.example.demo.WebsocketDemo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by gray- on 2017/8/2.
 *
 * 演示控制器
 */
@Controller
public class WsController {

    //当浏览器向服务端发送请求的时候，通过映射地址
    @MessageMapping("/welcome")
    //当服务端有消息的时候，会向路径中的浏览器发送消息
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception{
        Thread.sleep(3000);
        return new WiselyResponse("Welcome, "+message.getName()+"!");
    }
}
