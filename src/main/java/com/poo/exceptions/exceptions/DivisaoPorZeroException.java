package com.poo.exceptions.exceptions;

public class DivisaoPorZeroException extends Exception implements MensagemError {
    public DivisaoPorZeroException() {
        super(DIVISAO_POR_ZERO);
    }
}
