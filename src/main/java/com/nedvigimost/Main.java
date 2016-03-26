package com.nedvigimost;

import com.nedvigimost.services.interfaces.IBuildingService;
import com.nedvigimost.services.interfaces.IPersonService;
import com.nedvigimost.services.interfaces.IUserService;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ������� on 07.02.2016.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBean.xml");
        //Performer p = ctx.getBean("kenny", Performer.class);
        //p.perform();
        IBuildingService buildingService = ctx.getBean("buildingService", IBuildingService.class);
        IUserService userService = ctx.getBean("userService", IUserService.class);
        List<User> users = userService.getAllUsers();
        for (User u : users) {
            System.out.println("Found user " + u);
        }

    }
}
