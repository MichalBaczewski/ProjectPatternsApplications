package com.baczewski.compiler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Set;

public class GotoEvaluator implements Evaluator {

    private static final Logger log = LogManager.getLogger(GotoEvaluator.class);

    private final Instruction instruction;
    private final ProgramMemory programMemory;

    public GotoEvaluator(Instruction instruction, ProgramMemory programMemory) {
        this.instruction = instruction;
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate() {
        Long addressToJump = Long.parseLong(instruction.getArguments());
        List<Instruction> instructions = programMemory.getInstructions();
        for (int index = 0; index < instructions.size(); index++) {
            Long actualInstructionAddress = instructions.get(index).getAddress();
            log.trace("Porownuje {} i {}.", actualInstructionAddress, addressToJump);
            if (actualInstructionAddress.equals(addressToJump)) {
                log.debug("Znalazłem indeks {}.", actualInstructionAddress);
                programMemory.setIndex(index);
                break;
            }
        }
    }
}
