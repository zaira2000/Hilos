package Gestor;

public class Princi {
    
 public static void main(String[] args) {
     
    System.out.println("LISTADO DE PACIENTES");
    Pacient pac = new Pacient("Maris","Aguirre","Cra 1 # 14-32", "Traumatismo","Dr.Black","San Rafael","5-05-2022", 145, 'F');
    pac.mostrarD();
    Pacient pac1 = new Pacient("Paul","Saenz","carrera 1 # 12-17", "Lesion en hombro","Dr.Mora","Olaya","6-06-2022", 369, 'M');
    pac1.mostrarD();
    Pacient pac2 = new Pacient("Tatix","Vaca","calle 9 # 20-25", "Migraña","Dra.Rico","Sanitas","2-9-2022", 521, 'F');
    pac2.mostrarD();
    Pacient pac3 = new Pacient("David","Loal","calle 2 # 19-28", "Lesion en pecho","Dra.Prieto","Hospital Militar Central","9-09-2022", 947, 'M');
    pac3.mostrarD();
    Pacient pac4 = new Pacient("Alex","Romero","calle 2 # 19-28", "Lesion en mano","Dra.Moreno","Hospital Militar Central","19-09-2022", 257, 'M');
    pac4.mostrarD();
    Pacient pac5 = new Pacient("Zara","Acuña","Cra 1 # 14-32", "Migraña","Dr.white","San Rafael","6-05-2022", 831, 'F');
    pac5.mostrarD();
    Pacient pac6 = new Pacient("Mariana","Bernal","calle 2 # 19-28", "contusion en tobillo","Dra.Pino","Hospital Militar Central","9-08-2022", 881, 'F');
    pac6.mostrarD();
    Pacient pac7 = new Pacient("Charid","Salazar","Cra 11 # 14-32", "Control","Dr.Torres","Cafam","6-02-2022", 117, 'F');
    pac7.mostrarD();
    
    
     System.out.println("LISTA DE DOCTORES");
    Medic med = new  Medic("DR."+"Filhip","Black");
    med.mostrarD();
    Medic med1 = new  Medic("DR."+"Mauricio","Mora");
    med1.mostrarD();   
    Medic med2 = new  Medic("Dra."+"Sandra","Rico");
    med2.mostrarD();
     Medic med3 = new  Medic("Dra."+"Vanesa","Prieto");
    med3.mostrarD();
    Medic med4 = new Medic ("Dra."+"Liseth","Moreno");
    med4.mostrarD(); 
    Medic med5 = new  Medic("DR."+"Hernesto","White");
    med5.mostrarD();
    Medic med6 = new  Medic("Dra."+"Marcela","Pino");
    med6.mostrarD();
    Medic med7 = new  Medic("DR."+"Camilo","Torres");
    med7.mostrarD();
    
    System.out.println("LISTA CENTROS DE SERVICIO");
    Servicio  cse = new Servicio("Hospital ","Hospital Militar Central");
    cse.mostrarD();
    Servicio  cse1 = new Servicio("Hospital","San Rafael");
    cse1.mostrarD();
    Servicio  cse2 = new Servicio("Policlinico","Olaya");
    cse2.mostrarD();
    Servicio  cse3 = new Servicio("Hospital","Sanitas");
    cse3.mostrarD();
    Servicio  cse4 = new Servicio("Hospital","Cafam");
    cse4.mostrarD();
       
    }
}
