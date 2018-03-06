package aplicacionaula;

import java.util.ArrayList;
import java.lang.*;

public class AplicacionAula {

    public static void main(String[] args) {
        Profesor jesus,joaquin;
        Alumno juan,beatriz;
        Persona per;
        ArrayList<Delegado> delegados = new ArrayList();
        Delegado mariajose, pepe, alfredo, bonifacio, carlos, leandro, fer, alex, alberto;
        char letra = 'a';
        
        mariajose = new Delegado("Mariajose");
        delegados.add(mariajose);
        pepe = new Delegado("Pepe");
        delegados.add(pepe);
        alfredo = new Delegado("Alfredo");
        delegados.add(alfredo);
        bonifacio = new Delegado("Bonifacio");
        delegados.add(bonifacio);
        carlos = new Delegado("Carlos");
        delegados.add(carlos);
        leandro = new Delegado("Leandro");
        delegados.add(leandro);
        fer = new Delegado("Fer");
        delegados.add(fer);
        alex = new Delegado("Alex");
        delegados.add(alex);
        alberto = new Delegado("Alberto");
        delegados.add(alberto);
        
        jesus   = new Profesor("Jesus");
        joaquin = new Profesor("Joaquin","B7");
        juan  = new Alumno("Juan");
        beatriz = new Alumno("Beatriz",4,5);
        per = new Persona();

        per.altura=3.3F;
        System.out.println("\n"+jesus.toString());   // Mostramos a los profesores
        System.out.println(joaquin.toString());
        jesus.setDespacho("C7");                     // Cambiamos el despacho de Jesus
        System.out.println(jesus.toString()+"\n");   // Comprobamos la nueva informacion

        /*jesus.darClase();                               // Jesus comineza la clase
        jesus.habla();
        juan.pregunta("¿Que es un objeto?");             // El alumno juan pregunta
        jesus.responderPregunta("¿Que es un objeto?");   // Jesus contesta
        beatriz.pregunta("¿Es lo mismo clase y objeto?");
        jesus.responderPregunta("¿Es lo mismo clase y objeto?");
        jesus.pregunta("¿Os habeis enterado?");
        jesus.trabaja();*/
        
        System.out.println(Math.abs(3.7));
        System.out.println(Math.sqrt(37));

        if(Character.isLowerCase(letra))
            System.out.print(letra+ " si esta en minuscula\n");
        else
            System.out.print(letra+ " no esta en minuscula\n");
        
        String cinco = Integer.toString(5);
        System.out.print(cinco+"\n");
        
        String cincostr = "5";
        int cincoint = Integer.parseInt(cincostr);
        
        String cincoconcinco = Float.toString(5.5f);
        System.out.print(cincoconcinco+"\n");
        
        System.out.print(Float.MAX_VALUE+"\n");
        
        String holamin = "hola";
        System.out.print(holamin.charAt(1)+"\n");
        
        String holamax = "Hola";
        
        if(holamin.equals(holamax))
            System.out.print("holi");
        else
            System.out.print("ADIOS\n");
          
        System.out.print(holamax.concat("ADIOS")+"\n");
        
    }

}
