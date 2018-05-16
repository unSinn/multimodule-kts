package com.noser.hello;

import sun.misc.Unsafe;

class DoDehShait {

    private static final Unsafe unsafe = Unsafe.getUnsafe();

    DoDehShait() {
        System.out.println("Allocating");
        unsafe.allocateMemory(1000);
    }
}
