package com.kharitonov.di.impl;

import com.kharitonov.di.Window;

public class PlasticWindow  implements Window {
    @Override
    public void open() {
        System.out.println("plastic window is opened");
    }
}
