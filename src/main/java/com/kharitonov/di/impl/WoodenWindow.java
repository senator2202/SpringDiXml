package com.kharitonov.di.impl;

import com.kharitonov.di.Window;

public class WoodenWindow implements Window {
    @Override
    public void open() {
        System.out.println("wooden window is opened");
    }
}
