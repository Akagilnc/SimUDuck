package com.deronlee.test.duck;

import com.deronlee.test.fly.FlyNoWay;
import com.deronlee.test.quack.Quack;

/**
 * Created by lnc on 3/6/2016.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
