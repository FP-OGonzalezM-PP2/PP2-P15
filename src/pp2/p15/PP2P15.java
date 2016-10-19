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
     public static void llenarArreglo(int[][] a){
        int m,j,i;
        Random numAleatorio = new Random();
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(j==10){
                    m = 0;
                    for(j=0;j<a.length-1;j++){
                        m = a[i][j]+ m;
                    }
                    a[i][j] = m;
                } else a[i][j]=numAleatorio.nextInt(10+1);
                if(i==10){
                    m = 0;
                    for(i=0;i<a.length-1;i++){
                        m = a[i][j]+ m;
                    }
                    a[i][j] = m;
                }
                System.out.print(a[i][j] +"\t");
            }
            System.out.println("\n");
        }
    }
    public static void Mostrar(int m){
        System.out.println(m);
    }
}
