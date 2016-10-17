/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p15;
import java.util.*;
//use import java.util.*; porque Random es otra funcion como Scanner que necesitamos declarar
/**
 *
 * @author Osvaldo
 */
public class PP2P15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arreglo = new int[10][10];
        //es un arreglo de 10 por 10
        llenarArreglo(arreglo);
    }
    public static void llenarArreglo(int [][]a){
        int i,j,p,m,q;
        //aqui declaro la funcion random y como se llamara
        Random numAleatorio = new Random();
           for(i=0;i<10;i++){
               m = numAleatorio.nextInt();
               //cada vez que cambia de celda i se le asignara un valor random
              for(j=0;j<10;j++){
               //cada vez que cambia de celda j se la asignara un valor random
               p = numAleatorio.nextInt();   
               //aqui esta la suma y ensiguida la muestro en pantalla porque acabando j cambiara de celda
               q = m + p;
                  System.out.print(p +"\t");
              }
               System.out.println("\n");
    }
    }
}
