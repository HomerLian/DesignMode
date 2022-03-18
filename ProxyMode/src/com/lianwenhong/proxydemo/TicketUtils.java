package com.lianwenhong.proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TicketUtils {

    /**
     * 静态代理方式
     *
     * @return
     */
    public static TicketServer staticTicket() {
        return new Son();
    }

    /**
     * 动态代理方式
     *
     * @return
     */
    public static TicketServer dynamicTicket() {
        TicketServer server = new XC();

        return (TicketServer) Proxy.newProxyInstance(server.getClass().getClassLoader(), server.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                float fares = (float) method.invoke(server, args);
                fares += 500;
                return fares;
            }
        });
    }
}
