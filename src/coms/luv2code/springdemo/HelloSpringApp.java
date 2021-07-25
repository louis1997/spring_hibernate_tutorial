package coms.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){

        //Sec4 Spring IOC - XML Configuration
        //ch23

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the application context
        context.close();
    }
}
