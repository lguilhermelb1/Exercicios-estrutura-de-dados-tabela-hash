/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

/**
 *
 * @author Luis Guilherme
 */
public class Hash {
    Lista Pessoas[];
    int qtd = 26;
    
    public Hash(){
        Pessoas = new Lista[qtd];
        inicializaListas();
    }   //Construtor
    
    //Cria a tabela
    public void inicializaListas(){
        for(int i = 0; i < qtd; i++){
            Pessoas[i] = new Lista();
        }
    }
    
    //Onde será colocado o funcionário
    public int funcaoHash(String nome){
        String letra = nome.toLowerCase();  //Converter para minusculo, para não ter diferença entre maiuscula ou minuscula
        int posicao = letra.charAt(0)%qtd;  //Posição pelo valor da letra inicial na tabela ASCII dividido pela quantidade de letras do alfabeto
        return posicao;
    }
    
    //Inserir na tabela hash
    public void inserir(Pessoa pessoa){
        Pessoas[funcaoHash(pessoa.getNome())].inserir(pessoa);
    }
}