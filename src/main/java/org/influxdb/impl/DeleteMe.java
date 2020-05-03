package org.influxdb.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DeleteMe {
    public static void main(String[] args) {
        B aInstance = new B();
        aInstance.setName("");
        try {
            Method setter = aInstance.getClass().getDeclaredMethod("setName", String.class);
            setter.invoke(aInstance, "Sujit");
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class A {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}

class B extends  A {
    /*public void setName(String name) {
        System.out.println("here");
    }*/
}
