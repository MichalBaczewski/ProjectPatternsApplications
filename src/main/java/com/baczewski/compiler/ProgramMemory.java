package com.baczewski.compiler;

import java.util.*;

class ProgramMemory {
    private int index =0;
    private Set<Long> visitedGotoAdress = new HashSet<>();
    private List<Instruction> instructions = new ArrayList<>();
    private Map<String, String> variables = new HashMap<>();
    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }

    public void addVariable(String variable, String value) {
        variables.put(variable, value);
    }

    public void addVisitedGotoAdress(Long address) {
        visitedGotoAdress.add(address);
    }

    public boolean hasNextInstruction() {
        return index < instructions.size();
    }

    public String getValue(String variable) {
        return variables.get(variable);
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public Set<Long> getVisitedGotoAdress() {
        return visitedGotoAdress;
    }

    public Map<String, String> getVariables() {
        return variables;
    }

    public Instruction getNextInstruction() {
        return instructions.get(index++);
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
