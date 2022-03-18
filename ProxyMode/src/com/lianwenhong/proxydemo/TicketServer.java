package com.lianwenhong.proxydemo;

/**
 * 抽象出来的买票服务接口，大家想做的事都是买票这么个事
 */
public interface TicketServer {
    float buyTicket(String dest);
}