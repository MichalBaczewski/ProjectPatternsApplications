package com.baczewski.compiler;

public class ProgramRunner {
    private final ProgramMemory programMemory;
    private final EvaluatorFactory evaluatorFactory;

    public ProgramRunner(ProgramMemory programMemory, EvaluatorFactory evaluatorFactory) {
        this.programMemory = programMemory;
        this.evaluatorFactory = evaluatorFactory;
    }

    public void run() {
        for (Instruction instruction : programMemory.getInstructions()) {
            Evaluator evaluator = evaluatorFactory.createInstructionEvaluator(instruction);
            evaluator.evaluate();
        }
    }

}
