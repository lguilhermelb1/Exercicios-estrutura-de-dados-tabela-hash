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
public class Lista {

    private No primeiro;
    private No ultimo;

    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
    }       //Construtor

    //Checar se é vazia
    public boolean vazia() {
        return (this.primeiro == null);
    }

    //Inserir produto na lista
    public void inserir(Pessoa p) {
        No novoNo = new No(p);
        if (this.vazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProx(novoNo);
        }
        this.ultimo = novoNo;
    }

    //Imprimir pessoas
    public String imprimir() {
        String msg = "";
        No atual = this.primeiro;
        if (atual != null) {
            while ((atual != null)) {
                msg += atual.getP().getNome() + "\n";
                atual = atual.getProx();
            }
        }
        return msg;
    }
    
    //Encontrar pessoa
    public String encontrar(String nome, int i) {
        String msg = "";
        No atual = this.primeiro;
        if (atual != null) {
            while ((atual != null)) {
                if (atual.getP().getNome().equals(nome)) {
                msg += "Pessoa encontrada na tabela " + i + ": " + atual.getP().getNome() + "\n";
                }
                atual = atual.getProx();
            }
        }
        return msg;
    }

    //Imprimir pessoas com mesma inicial
    public String imprimirInicial(String inicial) {
        String msg = "";
        No atual = this.primeiro;
        if (atual != null) {
            while ((atual != null)) {
                if (atual.getP().getNome().charAt(0) == inicial.charAt(0)) {
                    msg += atual.getP().getNome() + "\n";
                }
                atual = atual.getProx();
            }
        }
        return msg;
    }

    //Remover pessoa por nome
    public void remover(String nome) {
        No atual = this.primeiro;
        No aux = null;
        if (!vazia()) {
            while (atual != null) {
                if (atual.getP().getNome().equals(nome)) {
                    if (atual.prox == null) {
                        ultimo = aux;
                        ultimo.prox = null;
                        atual = null;
                        break;
                    } else {
                        aux.prox = atual.prox;
                        atual.prox = null;
                        atual = null;
                        break;
                    }
                }
                atual = atual.prox;
                aux = aux.prox;
            }
        }
    }
}
