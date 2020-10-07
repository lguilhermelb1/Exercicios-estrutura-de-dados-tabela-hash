/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios4;

/**
 *
 * @author Luis Guilherme
 */
public class Hash {
    Lista Funcionarios[];
    int qtd = 20;
    
    public Hash(){
        Funcionarios = new Lista[qtd];
        inicializaListas();
    }   //Construtor
    
    //Cria a tabela
    public void inicializaListas(){
        for(int i = 0; i < qtd; i++){
            Funcionarios[i] = new Lista();
        }
    }
    
    //Onde será colocado o funcionário
    public int funcaoHash(float salario){
        int posicao;
        posicao = Math.round(salario)%qtd;
        return posicao;
    }
    
    //Inserir na tabela hash
    public void inserir(Funcionario funcionario){
        Funcionarios[funcaoHash(funcionario.getSalario())].inserir(funcionario);
    }
}