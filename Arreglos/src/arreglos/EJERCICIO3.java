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
public class EJERCICIO3 {
     public static void main(String[] args) {
         double sum=0,promed=0; //declaración de variables
         double[] calif_prog= {18,19,15,16,17,10}; //inicialización de arreglos con datos en posiciones
         double[] calif_bd= {10,12,13,20,17,20};
         double[] prom= new double[6]; // inicialización de arreglo sin datos (con posiciones especificas)
         for(int cont=0; cont<calif_bd.length;cont++){
            sum= calif_prog[cont]+calif_bd[cont];// determinación de la suma
            promed=sum/2; //determinación del promedio
            prom[cont]=promed; // almacenamiento de los promedios en una variable
        } 
        System.out.println("Tabla de calificaciones:\n Estudiante\t Programacion\tbase de datos\tpromedio");
         for(int i=0; i<calif_bd.length;i++){ 
             System.out.printf("%s%d\t%.2f\t\t%.2f\t\t%.2f\n","Estudiante#",i,calif_prog[i],calif_bd[i],prom[i]);//salida 
         }     
     }
}
