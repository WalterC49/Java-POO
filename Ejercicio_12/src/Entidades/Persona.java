/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Walter
 */
public class Persona {
    private String nombre;
    private Date Nacimiento;
    
    public Persona(){
    }
    
    public Persona(String nombre,Date Nacimiento){
        this.nombre = nombre;
        this.Nacimiento = Nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Nacimiento=" + Nacimiento + '}';
    }
}
