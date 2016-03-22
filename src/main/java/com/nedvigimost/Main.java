package com.nedvigimost;

import com.nedvigimost.services.interfaces.IBuildingService;
import com.nedvigimost.services.interfaces.IPersonService;
import com.nedvigimost.vo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ������� on 07.02.2016.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBean.xml");
        //Performer p = ctx.getBean("kenny", Performer.class);
        //p.perform();
        IBuildingService buildingService = ctx.getBean("buildingService", IBuildingService.class);
        IPersonService personService = ctx.getBean("personService", IPersonService.class);

        //create person
        Person person = new Person("Ivan", "Ivanov", "Ivanovich", "050-243-54-45");
        personService.addPerson(person);
        System.out.println("Created person, generated id = " + person.getIdPerson());

    }
}
