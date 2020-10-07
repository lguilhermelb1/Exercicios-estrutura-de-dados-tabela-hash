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
    public void inserir(Aluno a) {
        No novoNo = new No(a);
        if (this.vazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProx(novoNo);
        }
        this.ultimo = novoNo;
    }

    //Imprimir todos os alunos com nota 7 ou mais
    public String imprimirMaior() {
        String msg = "";
        No atual = this.primeiro;
        if (atual != null) {
            while ((atual != null)) {
                if (atual.getA().getNota() >= 7) {
                    msg += atual.getA().getNome() + ", nota final: " + atual.getA().getNota() + "\n";
                }
                atual = atual.getProx();
            }
        }
        return msg;
    }

    //Imprimir todos os alunos
    public String imprimir() {
        String msg = "";
        No atual = this.primeiro;
        if (atual != null) {
            while ((atual != null)) {
                msg += atual.getA().getNome() + ", nota final: " + atual.getA().getNota() + "\n";
                atual = atual.getProx();
            }
        }
        return msg;
    }
}
