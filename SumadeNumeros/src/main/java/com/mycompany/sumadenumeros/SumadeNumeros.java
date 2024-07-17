/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumadenumeros;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class SumadeNumeros {

    public static void main(String[] args) {
        System.out.println("Ingrese dimension de su arreglo");
        Scanner leerc= new Scanner (System.in);
        int dimension= leerc.nextInt();
        int [] numeros=new int[dimension];       
        IngresarNumeros(numeros, 0, leerc);
        int resultadoarreglo;
        resultadoarreglo = suma(numeros, numeros.length - 1);
        System.out.println("Resultado: " + resultadoarreglo);   
    }
    
    public static void IngresarNumeros(int num [], int n, Scanner leer){
        if (n == num.length) {
            return;
        }
        System.out.println("Ingrese numeros del arreglo");   
        num[n]=leer.nextInt();
        IngresarNumeros(num, n + 1,  leer);
    }
    
    public static int suma(int [] numeros, int n){
        if (n == 0){
            return numeros[0] ; 
        }else{
            int suma;
            suma= numeros [n] + suma (numeros, n - 1); 
            return suma;
        }
    }
    
}
