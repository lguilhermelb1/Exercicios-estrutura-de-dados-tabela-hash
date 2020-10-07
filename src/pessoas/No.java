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
public class No {

    private Pessoa p;
    public No prox;

    public No(Pessoa p) {
        this.p = p;
        this.prox = null;
    }   //Construtor

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}
