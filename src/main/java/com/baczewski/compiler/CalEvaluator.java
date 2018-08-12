package com.baczewski.compiler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalEvaluator implements Evaluator {

    public static final Pattern PATTERN = Pattern.compile("(\\d+)\\s*(\\S+)\\s*(\\d+)");
    private final Instruction instruction;
    Integer result;

    public CalEvaluator(Instruction instruction) {
        this.instruction = instruction;
    }

    @Override
    public void evaluate() {
        Matcher matcher = PATTERN.matcher(instruction.getArguments());
        if (matcher.find()) {
            int number1 = Integer.parseInt(matcher.group(1));
            int number2 = Integer.parseInt(matcher.group(3));
            String operator = matcher.group(2);
            switch (operator) {
                case "+":
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    break;
                case "/":
                    if (number2 != 0) {
                        System.out.println(number1 / number2);
                        break;
                    } else {
                        System.out.println("Nie dziel przez zero!");
                        break;
                    }
                case "*":
                    System.out.println(number1 * number2);
                    break;
            }
        }
    }
}
