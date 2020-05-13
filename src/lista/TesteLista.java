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
public class TesteLista {

    public static void main(String[] args) {
        Lista li = new Lista();

        li.inserir(6);
        li.inserir(8);
        li.inserir(7);
        li.insereFim(40);
        System.out.println("quatindade = " + li.comprimento());
        System.out.println("soma dos infos = " + li.soma());
        //li.insereOrdenado(5);
        //li.insereOrdenado(20);
        //  li.insereOrdenado(50);
        //li.insereOrdenado(3);

          li.imprime();
        //li.retiraRecursivo(li.temp.getProx(), 1);
        // li.retira(8);
        //System.out.println(li.vazia());
        //System.out.println("quatindade = " + li.comprimento());
        // System.out.println("Ultimo = " + li.ultimo());
        //li.libera();
        //li.imprime();
        //System.out.println("novo teste");
        //Lista l = new Lista();
        //l.inserir(2);
        //l.inserir(8);
        //l.inserir(7);
        //l.imprime();
        //li.igual(l);
        //System.out.println("imprime recursivo");
        // li.imprimeRecursivo();
        //int[] n = {5, 4, 9};
        //li.concatenaArray(n);
        //li.imprime();
    }
}
