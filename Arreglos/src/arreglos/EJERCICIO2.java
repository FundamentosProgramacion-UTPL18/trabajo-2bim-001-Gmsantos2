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
        int[] lista = {1, 2, 3, 4, 5, 6, 7}; //declaración del arreglo
        int mult = 0; //declaracion variable
        for (int cont = 0; cont < lista.length; cont++) { // corre hasta que el cont llegue a la cantidad de la lista -1
            if (lista[cont] % 2 == 0) { // condicion para obtener los numeros pares
                for (int i = 1; i <= 12; i++) {   // corre hasta que contador llegue a 12
                    mult = cont * i;  //proceso
                    System.out.printf("%d*%d=%d\n" ,lista[cont], i, mult); //salida
                }
            }
        }

    }
}
