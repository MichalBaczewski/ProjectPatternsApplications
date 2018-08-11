package com.baczewski.compiler;

/*
* W celu skrócenia ilości kodu i poprawienia czutelności wykorzystano bibliotekę lombok.
* */


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Instruction {
    private Long address;
    private String type, arguments;
}
