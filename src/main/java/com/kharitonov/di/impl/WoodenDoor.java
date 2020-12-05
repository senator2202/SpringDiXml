package com.kharitonov.di.impl;

import com.kharitonov.di.Door;

public class WoodenDoor implements Door {
    @Override
    public void install() {
        System.out.println("wooden door is installed");
    }
}
