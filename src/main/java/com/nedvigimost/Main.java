package com.nedvigimost;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ������� on 07.02.2016.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBean.xml");
        Performer p = ctx.getBean("kenny", Performer.class);
        p.perform();
    }
}
