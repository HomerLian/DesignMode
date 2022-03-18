package com.lianwenhong.proxydemo;

public class Son implements TicketServer {

    TicketServer server = new XC();

    public Son() {
    }

    @Override
    public float buyTicket(String dest) {
        float fares = server.buyTicket(dest);
        fares += 500;
        return fares;
    }
}
