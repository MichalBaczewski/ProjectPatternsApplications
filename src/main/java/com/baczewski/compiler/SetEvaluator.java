package com.baczewski.compiler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetEvaluator implements Evaluator{

    public static final Pattern PATTERN = Pattern.compile("(\\S+)\\s+(.*)");

    private final Instruction instruction;
    private final ProgramMemory programMemory;

    public SetEvaluator(Instruction instruction, ProgramMemory programMemory) {
        this.instruction = instruction;
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate() {
        Matcher matcher = PATTERN.matcher(instruction.getArguments());
        if (matcher.find()) {
            String variable = matcher.group(1);
            String value = matcher.group(2);
            programMemory.addVariable(variable, value);
        }
    }
}
