
package com.mycompany.aplicativo;

public class InvalidOperationException extends RuntimeException{
    public InvalidOperationException(String mensagem){
        super(mensagem);
    }
}
