/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos2;

/**
 *
 * @author Luis Guilherme
 */
public class Hash {
    Lista Produtos[];
    int qtd = 4;
    
    public Hash(){
        Produtos = new Lista[qtd];
        inicializaListas();
    }
    
    final void inicializaListas(){
        for(int i = 0; i < 4; i++){
            Produtos[i] = new Lista();
        }
    }
    
    //Onde será colocado o produto
    final int funcaoHash(String tipo){
        int posicao = 0;
        if(tipo.equals("A")){
        posicao = 0;
        } else if(tipo.equals("H")){
        posicao = 1;
        } else if(tipo.equals("L")){
        posicao = 2;
        } else if(tipo.equals("V")){
        posicao = 3;
        } else{
            System.out.println("Tipo inexistente");
        }
        return posicao;
    }
    
    //Inserir na tabela hash
    final void inserir(Produto produto){
        Produtos[funcaoHash(produto.getTipo())].inserir(produto);
    }
}
