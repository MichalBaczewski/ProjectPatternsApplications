package com.baczewski.compiler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

class ProgramLoader {
    private final ProgramMemory programMemory;
    private final InstructionParser parser;

    public ProgramLoader(ProgramMemory programMemory,InstructionParser parser) {
        this.programMemory = programMemory;
        this.parser = parser;
    }

    public void load() throws IOException {
        Files.lines(Paths.get("src\\main\\resources\\instructions.txt"))
                .forEach(this::loadLine);
    }

    public void loadLine(String line){
        Optional<Instruction> instruction = parser.parseToInstruction(line);
        instruction.ifPresent(programMemory::addInstruction);
//        if (instruction.isPresent()) {
//            programMemory.addInstruction(instruction.get());
//        }
//        instruction.ifPresent(instruction1 ->
//                programMemory.addInstruction(instruction1));
    }
}
