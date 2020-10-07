/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunosAprovados;

/**
 *
 * @author Luis Guilherme
 */
public class Hash {
    Lista Alunos[];
    int qtd = 15;
    
    public Hash(){
        Alunos = new Lista[qtd];
        inicializaListas();
    }   //Construtor
    
    //Cria a tabela
    public void inicializaListas(){
        for(int i = 0; i < qtd; i++){
            Alunos[i] = new Lista();
        }
    }
    
    //Onde será colocado o funcionário
    public int funcaoHash(int cod){
        int posicao;
        posicao = cod%qtd;
        return posicao;
    }
    
    //Inserir na tabela hash
    public void inserir(Aluno aluno){
        Alunos[funcaoHash(aluno.getCodigo())].inserir(aluno);
    }
}