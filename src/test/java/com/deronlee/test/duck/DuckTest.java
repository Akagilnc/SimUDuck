package com.deronlee.test.duck;

import com.deronlee.test.duckcall.DuckCall;
import com.deronlee.test.duckcall.SimpleDuckCall;
import com.deronlee.test.fly.FlyRocketPowered;

/**
 * Created by lnc on 3/6/2016.
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck  model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckCall duckCall = new SimpleDuckCall();
        duckCall.performQuack();

    }
}
