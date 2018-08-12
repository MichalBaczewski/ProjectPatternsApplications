package com.baczewski.compiler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintEvaluator implements Evaluator {


    public static final Pattern PATTERN = Pattern.compile("(\\$(\\w+))");

    private final Instruction instruction;
    private final ProgramMemory programMemory;

    public PrintEvaluator(Instruction instruction, ProgramMemory programMemory) {
        this.instruction = instruction;
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate() {

        String toPrint = instruction.getArguments();
        Matcher matcher = PATTERN.matcher(toPrint);
        while (matcher.find()) {
            String variableToInsertWithSpecialChar = matcher.group(0);
            String variableToInsert = variableToInsertWithSpecialChar.substring(1);
            String variableValue = programMemory.getValue(variableToInsert);
            toPrint = toPrint.replaceAll("\\$" + variableToInsert, variableValue);
        }
        System.out.println(toPrint);
    }

}
