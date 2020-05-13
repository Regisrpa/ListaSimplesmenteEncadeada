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
public class Lista {

    private NoLista prim;
    private int cont;
    private NoLista ultimo;

    public Lista() {
        prim = null;
        ultimo = null;
    }

    public void inserir(int a) {
        NoLista novo = new NoLista();
        novo.setInfo(a);
        novo.setProx(prim);
        this.prim = novo;
        ultimo = novo;
        cont++;

    }

    public void inserirfim(int a) {
        NoLista novo = new NoLista();
        novo.setInfo(a);
        novo.setProx(prim);
        this.prim = novo;
        ultimo = novo;
        cont++;

    }

    public void imprime() {
        NoLista p = prim;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getProx();
        }
        if (prim == null) {
            boolean a = false;
            System.out.println(a);
        }
    }

    public boolean vazia() {
        return prim == null;
    }

    public int comprimento() {
        return cont;
    }

    public NoLista busca(int a) {
        NoLista p = prim;
        while (p != null) {
            if (p.getInfo() == a) {
                return p;
            }
            p = p.getProx();
        }
        return null;
    }

    public NoLista ultimo() {
        return ultimo;

    }

    public void retira(int a) {
        NoLista ant = null;
        NoLista p = prim;

        while (p != null && p.getInfo() != a) {
            ant = p;
            p = p.getProx();
        }

        if (ant == null && prim != null) {
            this.prim = p.getProx();
        } else {
            ant.setProx(p.getProx());
            cont--;
        }
    }

    public void libera() {
        prim = null;
        ultimo = null;
        cont = 0;
        System.out.println("Lista esta liberada");
    }

    public void insereOrdenado(int v) {
        NoLista novo;
        NoLista p = prim;
        NoLista ult = null;
        while (p != null && p.getInfo() < v) {
            ult = p;
            p = p.getProx();
        }
        novo = new NoLista();
        novo.setInfo(v);
        if (ult == null) {
            novo.setProx(prim);
            prim = novo;

        } else {
            novo.setProx(ult.getProx());
            ult.setProx(novo);
        }
    }

    public boolean igual(Lista i) {
        NoLista p = prim;
        if (p == null && i == null) {
            return true;
        }
        while (p.getProx() != null) {
            if (p.getInfo() == i.prim.getInfo()) {
                p = p.getProx();
                i.prim = i.prim.getProx();
            } else {
                return false;
            }
        }

        return false;
    }

    public void imprimeRecursivo() {
        if (prim != null) {
            System.out.println("" + prim.getInfo());
            prim = prim.getProx();
            imprimeRecursivo();

        }
    }

    public NoLista retiraRecursivo(NoLista p, int a) {
        if (p != null) {
            if (p.getInfo() == a) {
                p = p.getProx();

            } else {
                p.setProx(retiraRecursivo(p.getProx(), a));
            }
        }
        return p;
    }

    //Descri ̧c ̃ao: m ́etodo para inserir o valor no final da lista, isto  ́e, ap ́os
    //o u ́ltimo ńo da lista.
    public void insereFim(int valor) {
        NoLista p = prim;
        NoLista ult = new NoLista();

        while (p.getProx() != null) {
            p = p.getProx();
        }
        ult.setInfo(valor);
        p.setProx(ult);
        cont++;
    }

    //Descri ̧c ̃ao: m ́etodo deve retornar a soma de todos os ”infos”da lista.
    public int soma() {
        NoLista p = prim;
        int a = 0;
        while (p != null) {
            int b = p.getInfo();
            a = a + b;
            p = p.getProx();
        }
        return a;

    }
    //Descri̧c̃ao: ḿetodo que recebe um valor do tipo int, e retorna a
    //referencia para o u ́ltimo ńo que armazena um valor igual a v. Se o
    //valor v n ̃ao for encontrado na lista, o m ́etodo retorna null.

    public NoLista ultimoNoV(int v) {

        return null;
    }

    /*Descri̧c̃ao: ḿetodo que recebe um array de valores do tipo int e
concatena os valores do array no final da lista (na mesma ordem em
que aparecem no array). O m ́etodo pode assumir que o array recebido
est́a completamente preenchido com valores. Sendo uma lista v́alida,
a lista original pode ou ñao estar vazia.*/
    public void concatenaArray(int v[]) {
        NoLista p = prim;
        NoLista ult = new NoLista();
        while (p.getProx() != null) {
            p = p.getProx();

        }
        int j = 0;
        while (j < v.length && p != null) {
            int a = v[j];
            System.out.println(v[j] + "bla");
            ult.setInfo(a);
            p.setProx(ult);
            System.out.println("sim" + ult.toString());
            p = p.getProx();
            System.out.println("TESTE" + p.toString());
            j++;
        }
    }
}
