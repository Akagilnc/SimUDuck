package com.deronlee.test.duck;

import com.deronlee.test.fly.FlyWithWings;
import com.deronlee.test.quack.Quack;

/**
 * Created by lnc on 3/6/2016.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
