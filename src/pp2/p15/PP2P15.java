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
        int m;
        int[][] arreglo = new int[10][10];
        //es un arreglo de 10 por 10
        llenarArreglo(arreglo);
        //Mostrar(m);
    }
    public static void llenarArreglo(int [][]a){
        int i,j=0,p,m=0,q;
        //aqui declaro la funcion random y como se llamara
        Random numAleatorio = new Random();
           for(i=0;i<a.length;i++){
               //cada vez que cambia de celda i se le asignara un valor random
              for(j=0;j<a.length;j++){
               //cada vez que cambia de celda j se la asignara un valor random
               a[i][j] = numAleatorio.nextInt();
               if(j==0){
                   for(p=0;p<a.length;p++)
                       m = a[i][j] + m;
               }
               a[i][j] = m;
                  System.out.println(m);
              }
              if(i==0){
                  for(q=0;q<a.length-1;q++){
                      m = a[q][j] + m;
                  }
                  a[i][j] = m;
                  System.out.println(m);
              }
    }
    }
    public static void Mostrar(int m){
        System.out.println(m);
    }
}
