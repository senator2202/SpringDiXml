package com.kharitonov.di;

import com.kharitonov.di.impl.MetalDoor;

public class KeySelector {

    public String getKey(Door door) {
        if (door.getClass().equals(MetalDoor.class)) {
            return "a";
        } else {
            return "b";
        }
    }
}
