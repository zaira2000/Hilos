/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor;

/**
 *
 * @author zai
 */

public class Servicio {
    
    private String elect, nomC;
   

    public String getelect() {
        return elect;
    }

    public String getnomC() {
        return nomC;
    }

    public Servicio(String elect, String nomC) {
        this.elect = elect;
        this.nomC = nomC;
    }
    
    public void mostrarD(){
        System.out.println("elect: "+getelect()+" nom: "+getnomC());
               
    }
    
}
