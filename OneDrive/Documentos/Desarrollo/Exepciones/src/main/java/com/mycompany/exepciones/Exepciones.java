/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exepciones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zaira
 */
public class Exepciones {

    public static void main(String[] args) {
        ejer1y2();
        ejercicio3();
        ejercicio4();
        ejercicio5 ();
}   

//excepción sin tratar 
      
    public static void ejer1y2(){

        int numero;   
        String cadena="  1"; //error es que el string tiene espacios
    
        try{   
            numero = Integer.parseInt(cadena); // en la primera parte del ejercicio el numero se convertia directamente sin utilizar un Try Catch  
        }catch(NumberFormatException ex){   
            System.out.println("No es un número, es una cadena de texto."+ex.getMessage());//con el Try catch se evalua la conversion del dato y si se genera error se envia un mensaje al usuario    
        }   
    }


    public static void ejercicio3(){
    // ejercicio 3
        int v[]= new int[3];
        try { 
		    for(int i =0; i<5;i++){
		        v[i]=i;               // en este lugar mediante el for se esta dando una posisicion no existente dentro del arreglo 
            
            } 
        }catch (Exception e) {
            for (int j = 0; j < v.length; j++) {
               v[j]=j;                              // con este for manejamos el arreglo hasta la cantidad de posiciones que tiene para poderlo imprimir correctamente
            }
            System.out.println(Arrays.toString(v));
        }
    }

    public static void ejercicio4(){
        int numero=5, resultado;
        try {
            resultado= numero/0; // las divisiones por cero no existen por lo cual se toma este tipo de exepcion y al dar una division en cero 
        } catch (Exception e) {
            System.out.println("el divisor no puede ser cero");
        }
    }

    public static void ejercicio5 (){
        Scanner datos= new Scanner(System.in);
           
        try {
            System.out.println("Ingrese el numerador:");
            int a = datos.nextInt();
            System.out.println("Ingrese el denominador");
            int b = datos.nextInt();
            int aux;
            aux= a/b;
            System.out.println("el resultado es" + aux);
        } catch (Exception e) {
            System.out.println("El denominador tiene que ser un numero y a la vez que sea diferente de cero");
        } 
        // en este ejercicio se le pide al usuario que digite los datos y al ingresar un dato que no sea entero o no sea un numero se dispara la excepcion y nos manda el ,mensaje de error
    }
}
    

