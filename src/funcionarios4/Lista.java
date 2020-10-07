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
    public void inserir(Funcionario f) {
        No novoNo = new No(f);
        if (this.vazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProx(novoNo);
        }
        this.ultimo = novoNo;
    }

    //Aumentar o percentual do salário
    public void aumentarSalario(float porcentagem) {
        No atual = this.primeiro;
        while ((atual != null)) {
            atual.getF().setSalario(atual.getF().getSalario() + ((atual.getF().getSalario() * porcentagem) / 100));
            atual = atual.getProx();
        }
    }

    //Imprimir funcionários
    public String imprimir() {
        String msg = "";
        No atual = this.primeiro;
        if (atual != null) {
            while ((atual != null)) {
                msg += atual.getF().getNome() + ", recebendo " + atual.getF().getSalario() + "\n";
                atual = atual.getProx();
            }
        }
        return msg;
    }
    
    //Remover funcionário por nome
    public boolean remover(String nome) {
        No atual = this.primeiro;
        No anterior = null;
        if (vazia()) {
            return false;
        } else {
            while ((atual != null) && (!atual.getF().getNome().equals(nome))) {
                anterior = atual;
                atual = atual.getProx();
            }
            if (atual == this.primeiro) {
                if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProx();
            } else {
                if (atual == this.ultimo) {
                    this.ultimo = anterior;
                }
                anterior.setProx(atual.getProx());
            }
            return true;
        }
    }
}
