/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Usuario
 */
public class EJERCICIO2 {

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7};
        int mult = 0;
        for (int cont = 0; cont < lista.length; cont++) {
            if (lista[cont] % 2 == 0) {
                for (int i = 1; i <= 12; i++) {
                    mult = cont * i;
                    System.out.printf("%d*%d=%d\n" ,lista[cont], i, mult);
                }
            }
        }

    }
}
