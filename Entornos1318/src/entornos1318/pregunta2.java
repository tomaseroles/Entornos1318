package entornos1318;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomfor
 */
public class pregunta2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int filas=0, cols=0, n, valor=0;
        int suma=0;
        int i=0,j=0;
        
        filas=sc.nextInt();
        cols =sc.nextInt();
        n    =sc.nextInt();
        
//        System.out.println("Matriz:");
        int[][] matriz = new int[filas][cols];
        
//        i=0;
//        while(i<filas){
//            j=0;
//            while(j<cols){
//                matriz[i][j]=0;
//                j++;
//            }
//            i++;
//        }
        for(i=0;i<filas;i++){
            for(j=0;j<cols;j++){
                //System.out.print("Elemento [" + i +"][" + j + "]:");
                matriz[i][j]=sc.nextInt();
            }
        }
                
        System.out.println(sumaMatriz(matriz,0,n));
    }
    
    public static int sumaMatriz(int[][] m, int suma, int maximo){
        int i=0;
        while(i<=m.length-1){
            suma+=sumaVector(m[i],suma,0,maximo);
            i++;
        }
        return suma;
    }
    
    public static int sumaVector(int[] v, int suma, int pos, int maximo){
        if(pos==v.length-1){
            if (v[pos]>maximo)
                return v[pos];
            else
                return 0;
        } else{
            return sumaVector(v,suma,pos+1,maximo);
        }
    }
    
    
}
