package com.kharitonov.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        House house = context.getBean("houseBean", House.class);
        house.buildWall();
        house.installDoors();
        house.view();
        System.out.println(house);
        MainWindow mainWindow = context.getBean(MainWindow.class);
        mainWindow.show();
        context.close();
    }
}
