package com.deronlee.test.duckcall;

import com.deronlee.test.quack.Quack;
import com.deronlee.test.quack.QuackBehavior;

/**
 * Created by lnc on 3/6/2016.
 */
public class SimpleDuckCall extends DuckCall {
    public SimpleDuckCall() {
        quackBehavior = new Quack();
    }


}
