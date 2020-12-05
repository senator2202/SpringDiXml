package com.kharitonov.di.impl;

import com.kharitonov.di.Material;

public class Brick implements Material {
    @Override
    public void cover() {
        System.out.println("Класть кирпичи");
    }
}
