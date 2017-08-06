package com.example.demo.WebsocketDemo;

/**
 * Created by gray- on 2017/8/2.
 *
 * 服务端向浏览器发送消息
 */
public class WiselyResponse {
    private String reponseMessage;

    public WiselyResponse(String reponseMessage){
        this.reponseMessage = reponseMessage;
    }
    public String getReponseMessage(){
        return reponseMessage;
    }
}
