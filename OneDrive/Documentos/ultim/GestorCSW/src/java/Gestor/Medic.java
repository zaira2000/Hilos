/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor;

/**
 *
 * @author zai
 */
public class Medic extends Person{
       public Medic(String nom,String ape){
        super(nom,ape);
        
    }
    public void mostrarD(){
        System.out.println("Doctor: "+getnom()+" "+getape());
               
    }

   
    
}
