
package com.mycompany.aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAlunos {
    private static List<CAluno> alunos = new ArrayList<>();
    
    public static void adicionarAluno(CAluno aluno){
        alunos.add(aluno);
    }
    
    public static void removerAluno(String matricula){
        CAluno aluno;
        //try{
            aluno = buscarAluno(matricula);
            alunos.remove(aluno);
        /*} catch(AlunoInexistenteException e){
            System.err.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("Solicite o método removerAluno novamente.");
        }*/
    }
    
    public static void listarAlunos(){
        for(CAluno item: alunos){
            System.out.println(item.getNome());
        }
    }
    
    public static CAluno buscarAluno(String matricula) throws AlunoInexistenteException{
        for(CAluno item: alunos){
            if(item.getMatricula().equals(matricula)){
                return item;
            }
        }
        throw new AlunoInexistenteException("Aluno não existe.");
    }
    
    public static void adicionarAlunoInterativo(){
        Scanner sc = new Scanner(System.in);
        boolean alunoAdicionado = false;
        while(!alunoAdicionado){
            try{
                System.out.println("Digite a matrícula do aluno:");
                String matricula = sc.nextLine();
                System.out.println("Digite o nome do aluno:");
                String nome = sc.nextLine();
                System.out.println("Digite a nota do aluno:");
                double nota = sc.nextDouble();
                sc.nextLine();
                CAluno aluno = new CAluno(matricula,nome);
                aluno.validarNota(nota);
                adicionarAluno(aluno);
                alunoAdicionado = true;
            } catch(MatriculaInvalidaException | NotaInvalidaException e){
                System.err.println(e.getMessage());
                System.out.println("Preencha os dados novamente.");
            }
            
        }
    }
}
