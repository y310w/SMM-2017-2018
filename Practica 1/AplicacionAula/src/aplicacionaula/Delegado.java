/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionaula;

/**
 *
 * @author thejoker
 */
public class Delegado extends Alumno{
    public String delega;
    
    public Delegado(String nom){
        super(nom);
        delega = "3ºA";
    }
}
