package com.poo.exceptions.exceptions;

public class IndiceInvalidoException extends Exception implements MensagemError {
    public IndiceInvalidoException(){
        super(INDICE_INVALIDO);
    }
}
