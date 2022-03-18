package com.lianwenhong.proxydemo;

public class XC implements TicketServer {
    @Override
    public float buyTicket(String dest) {
        System.out.println("出票成功 机票 To " + dest + " No:" + (int) (Math.random() * 1000));
        return 1000;
    }
}
