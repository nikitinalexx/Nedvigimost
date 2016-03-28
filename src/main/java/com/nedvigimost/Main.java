package com.nedvigimost;

import com.nedvigimost.dao.interfaces.IWaitingHistoryDAO;
import com.nedvigimost.services.interfaces.*;
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
        IBuildingService buildingService = ctx.getBean("buildingService", IBuildingService.class);
        Building b = buildingService.getById(1);
        if (b != null) {
            IWaitingHistoryService waitingHistoryService = ctx.getBean("waitingHistoryService", IWaitingHistoryService.class);
            waitingHistoryService.getWaitingHistoryForBuilding(b);
            System.out.println("Found");
        }
    }
}
