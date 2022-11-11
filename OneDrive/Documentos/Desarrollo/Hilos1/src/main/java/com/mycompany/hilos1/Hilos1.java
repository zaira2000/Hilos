/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hilos1;

/**
 *
 * @author zaira
 */
public class Hilos1 {

    public static void main(String[] args) {
          HiloFuente t1, t2, t3;

// Creación de los threads con parámetro tiempo aleatorio
        t1 = new HiloFuente("Hilo 1", (int) (Math.random() * 2000));

        t2 = new HiloFuente("Hilo 2", (int) (Math.random() * 2000));

        t3 = new HiloFuente("Hilo 3", (int) (Math.random() * 2000));

// Arrancamos los threads con el método start
        t1.start();

        t2.start();

        t3.start();
    }
}
