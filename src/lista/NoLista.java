/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author regis
 */
public class NoLista {

    private int info;
    private NoLista prox;

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return this.info;
    }

    public void setProx(NoLista prox) {
        this.prox = prox;
    }

    public NoLista getProx() {
        return this.prox;
    }

    @Override
    public String toString() {
        return this.info+"";
    }

}
