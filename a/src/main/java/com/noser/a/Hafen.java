package com.noser.a;

import com.noser.b.Boot;

public class Hafen {

    public Hafen() {
        System.out.println("Hello from " + this.getClass().getSimpleName());
        Boot b = new Boot();
    }
}
