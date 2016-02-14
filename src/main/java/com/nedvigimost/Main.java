package com.nedvigimost;

import com.zviyazyvannya.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.logging.FileHandler;

/**
 * Created by Алексей on 07.02.2016.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBean.xml");
        Performer p = ctx.getBean("kenny", Performer.class);
        p.perform();
    }
}
