package com.deronlee.test.quack;

/**
 * Created by lnc on 3/6/2016.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
