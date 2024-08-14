package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Using Application Context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //get the bean
        Sim sim = applicationContext.getBean("sim", Sim.class);

        // Calling the methods
        sim.calling();
        sim.data();

    }
}