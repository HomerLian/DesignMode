package com.lianwenhong.proxydemo;

public class Father {

    public static void main(String[] args) {
        // 这段代码可以在ide中输出用户为我们生成的临时类
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        /**
         * 静态代理方式
         */
//        TicketServer son = TicketUtils.staticTicket();
//        System.out.println("票价为：" + son.buyTicket("北京") + "元");

        /**
         * 动态代理方式
         */
        TicketServer son = TicketUtils.dynamicTicket();
        System.out.println("票价为：" + son.buyTicket("北京") + "元");
    }
}
