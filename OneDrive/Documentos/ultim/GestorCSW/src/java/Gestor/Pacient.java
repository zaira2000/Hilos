package Gestor;

public class Pacient extends Person{
    
    //constructor this---
    private int code;
    private char sexo;
    private String centroAtt,motConsu,address,medico,fecha;
    //Constructor ---

    public Pacient(String nom, String ape,String address, String motConsu, String medico, String centroAtt, String fecha, int code, char sexo) {
        super(nom, ape);
        
          this.code = code;
          this.sexo = sexo;
          this.centroAtt = centroAtt;
          this.motConsu = motConsu;
          this.address = address;
          this.medico = medico;
          this.fecha = fecha;
       
    }
       
    public void mostrarD(){
        System.out.println("nom: "+getnom()+"\nApe: "+getApellido()+"\naddress: "+address+"\nMotivo Consulta: "+motConsu+
                           "\nMedico: "+medico+"\nCentro de atencion: "+centroAtt+"\nfecha: "+fecha+"\ncode: "+code+"\nSexo: "+sexo);
               
    }

    private String getApellido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
