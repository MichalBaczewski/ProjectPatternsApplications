package com.baczewski.compiler;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;

        import java.io.IOException;

class ProgramCompilerApplication {
    private static final Logger log = LogManager.getLogger(ProgramCompilerApplication.class);

    public static void main(String[] args) throws IOException {
        InstructionParser parser = new InstructionParser();
        ProgramMemory programMemory = new ProgramMemory();
        ProgramLoader loader = new ProgramLoader(programMemory, parser);
        loader.load();
        log.error("error");
        log.warn("warnnig");
        log.info("informacja");
        log.debug("debugujemy");
        log.trace("wychodze");
        EvaluatorFactory factory = new EvaluatorFactory(programMemory);
        programMemory.getInstructions().forEach(System.out::println);
        ProgramRunner program = new ProgramRunner(programMemory, factory);
        program.run();
    }
}
