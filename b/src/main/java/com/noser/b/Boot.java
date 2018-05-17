
package com.noser.b;

import com.noser.c.Schraube;

public class Boot {

    public Boot() {
        System.out.println("Hello from " + this.getClass().getSimpleName());
        Schraube s = new Schraube();
    }
}
