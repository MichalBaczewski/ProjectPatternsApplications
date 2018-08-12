package com.baczewski.compiler;

import java.util.List;

public class ProgramRunner {
    private final ProgramMemory programMemory;
    private final EvaluatorFactory evaluatorFactory;

    public ProgramRunner(ProgramMemory programMemory, EvaluatorFactory evaluatorFactory) {
        this.programMemory = programMemory;
        this.evaluatorFactory = evaluatorFactory;
    }

    public void run() {
//        List<Instruction> instructions1 = programMemory.getInstructions();
        while (programMemory.hasNextInstruction()) {
            Instruction instruction = programMemory.getNextInstruction();
            Evaluator evaluator = evaluatorFactory.createInstructionEvaluator(instruction);
            evaluator.evaluate();
        }
//        for (int i = 0; i < instructions1.size(); i++) {
//            Instruction instruction = instructions1.get(i);
//            Evaluator evaluator = evaluatorFactory.createInstructionEvaluator(instruction);
//            evaluator.evaluate();
//        }
    }

}
