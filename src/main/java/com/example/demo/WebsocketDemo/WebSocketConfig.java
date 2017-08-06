package com.example.demo.WebsocketDemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by gray- on 2017/8/2.
 *
 * 广播式
 */
@Configuration
@EnableWebSocketMessageBroker //开启使用STOMP 协议来传输基于代理的消息
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {


    //注册协议节点，并映射指定的URL
    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {

        //注册一个STOMP的endpoint，并指定使用SockJS协议
        stompEndpointRegistry.addEndpoint("/endpointWisely").withSockJS();
    }


    //配置消息代理
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //广播式的应配置一个/topic消息代理
        registry.enableSimpleBroker("/topic");
    }
}
