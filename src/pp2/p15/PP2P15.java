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
        //EL arreglo lo hago de 11x11 para que en la ultima casilla pueda depositar el valor de la suma
        int[][] arreglo = new int[11][11];
        llenarArreglo(arreglo);
        Mostrar(arreglo);
    }
     public static int[][] llenarArreglo(int[][] a){
        int m,j,i;
        //Esta es la nueva función que asigna un valor aleatorio
        Random numAleatorio = new Random();
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(j==10){
                    m = 0;
                    for(j=0;j<a.length-1;j++){
                        m = a[i][j]+ m;
                    }
                    //En la celda a[i][j] se almacenara el valor de m
                    a[i][j] = m;
                } else{
                    a[i][j]=numAleatorio.nextInt(10+1);
                }
                if(i==10){
                    m = 0;
                    for(i=0;i<a.length-1;i++){
                        m = a[i][j]+ m;
                    }
                    a[i][j] = m;
                }
            }
        }
        return a;
     }

    public static void Mostrar(int [][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(j<10 && i<10){
                 System.out.print(a[i][j]+"\t");   
                }else{
                    //El valor de la suma estara entre corchetes
                 System.out.print("[" +a[i][j] +"]" +"\t");  
                }
            }
            System.out.print("\n");
    }
}
}
