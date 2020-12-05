package com.kharitonov.di.impl;

import com.kharitonov.di.Material;

public class Wood implements Material {
    @Override
    public void cover() {
        System.out.println("Класть бревна");
    }
}
