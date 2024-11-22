
package com.mycompany.aluno;

public class CAluno {
    private String matricula;
    private String nome;
    private double nota;
    
    public CAluno(String matricula, String nome) throws MatriculaInvalidaException{
        this.nome = nome;
        if(matricula == null || matricula.length()>4){
            throw new MatriculaInvalidaException("Matrícula inválida");
        }
        this.matricula = matricula;
    }
    
    public void validarNota(double nota) throws NotaInvalidaException{
        if(nota >10 || nota<0){
            throw new NotaInvalidaException("Nota inválida");
        }
        this.nota = nota;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
}
