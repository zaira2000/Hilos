/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilos1;

/**
 *
 * @author zaira
 */
public class HiloFuente extends Thread {
     private final String nombre;

    private final int retardo;

// Constructor para inicializar el nombre del hilo y tiempo de retardo
    public HiloFuente(String s, int d) {

        nombre = s;

        retardo = d;

    }

// El metodo run() ejecuta
// threads. Cuando run() termina el thread muere
    @Override
    public void run() {

// Con el método sleep retrasamos la ejecución el tiempo especificado
        try {

            sleep(retardo);

        } catch (InterruptedException e) {

        }

// Imprimimos el nombre y tiempo que hemos retardado el hilo
        System.out.println("Prueba Hilos: " + nombre + " " + retardo);

    }

}

