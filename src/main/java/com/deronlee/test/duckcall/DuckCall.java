package com.deronlee.test.duckcall;

import com.deronlee.test.quack.QuackBehavior;

/**
 * Created by lnc on 3/6/2016.
 */
public abstract class DuckCall {
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
