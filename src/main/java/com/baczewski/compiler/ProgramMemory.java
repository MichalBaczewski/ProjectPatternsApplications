package com.baczewski.compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProgramMemory {
    private List<Instruction> instructions = new ArrayList<>();
    private Map<String, String> variables = new HashMap<>();
    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }

    public void addVariable(String variable, String value) {
        variables.put(variable, value);
    }

    public String mapToString() {
        return variables.toString();
    }

    public String getValue(String variable) {
        return variables.get(variable);
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }
}
