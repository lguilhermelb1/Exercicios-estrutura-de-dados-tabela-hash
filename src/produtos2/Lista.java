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
    public void inserir(Produto p) {
        No novoNo = new No(p);
        if (this.vazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProx(novoNo);
        }
        this.ultimo = novoNo;
    }

    //Imprimir tipo
    public String imprimirTipo(String tipo) {
        String msg = "";
        No atual = this.primeiro;
        if (atual != null) {
            while ((atual != null)) {
                if (atual.getP().getTipo().equals(tipo)) {
                    msg += atual.getP().getDesc() + " ";
                    atual = atual.getProx();
                }
            }
        }
        return msg;
    }
}
