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
public class No {

    private Produto p;
    public No prox;
    public No ant;

    public No(Produto p) {
        this.p = p;
        this.prox = null;
    }   //Construtor

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}
