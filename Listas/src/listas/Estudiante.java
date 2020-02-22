/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s109e2
 */
public class Estudiante {
    
    public String cedula;
    public String nombre;
    public String barrio;
    public double nFinal;
    
    public Estudiante(String ced, String n, String b, double nF) {
        this.cedula = ced;
        this.nombre = n;
        this.barrio = b;
        this.nFinal = nF;
    }
    
     public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setnFinal(double nFinal) {
        this.nFinal = nFinal;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public double getnFinal() {
        return nFinal;
    }
    
}
