package com.company.StrategyDisignPattern;

public class StrategyPatternDemo {

    public static void main(String[] args) {
	    Context context = new Context(new OperationAdd());
	    System.out.println("10 + 5 = " + context.excuteStrategy(10, 5));

	    context = new Context(new OperationSubstract());
	    System.out.println("10 - 5 = "+ context.excuteStrategy(10, 5));

	    context = new Context(new OperationMultiply());
	    System.out.println("10 - 5 = "+ context.excuteStrategy(10, 5));
    }
}
