package com.kharitonov.di.impl;

import com.kharitonov.di.Door;

public class MetalDoor implements Door {
    @Override
    public void install() {
        System.out.println("metal door is installed");
    }
}
