package com.poo.exceptions.exceptions;

public class OpcaoInvalidaException extends Exception implements MensagemError {
    public OpcaoInvalidaException(){
        super(OPCOES_INVALIDAS);
    }
}