package com.baczewski.compiler;

public class ErrorEvaluator implements Evaluator {
    private final Instruction instruction;

    public ErrorEvaluator(Instruction instruction) {
        this.instruction = instruction;
    }

    @Override
    public void evaluate() {
        System.out.println(instruction.getArguments());
    }
}
