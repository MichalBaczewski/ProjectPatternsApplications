package com.baczewski.compiler;

public class EvaluatorFactory {

    private final ProgramMemory programMemory;

    public EvaluatorFactory(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    Evaluator createInstructionEvaluator(Instruction instruction) {
        String type = instruction.getType();
        if ("PRINT".equalsIgnoreCase(type)){
            return new PrintEvaluator(instruction, programMemory);
        } else if ("SET".equalsIgnoreCase(type)){
            return new SetEvaluator(instruction, programMemory);
        } else if ("GET".equalsIgnoreCase(type)) {
            return new GetEvaluator(instruction, programMemory);
        } else if ("CAL".equalsIgnoreCase(type)) {
            return new CalEvaluator(instruction);
        } else if ("GOTO".equalsIgnoreCase(type)) {
            return new GotoEvaluator(instruction, programMemory);
        }
        return new ErrorEvaluator(instruction);
    }
}
