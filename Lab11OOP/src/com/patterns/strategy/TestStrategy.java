package com.patterns.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Context context = new Context();
        int action = 2;
        if (action == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action == 2) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        System.out.println(context.executeStrategy(2, 3));
    }
}
