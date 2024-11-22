
package com.mycompany.aluno;

public class AlunoInexistenteException extends RuntimeException{
    public AlunoInexistenteException(String mensagem){
        super(mensagem);
    }
}
