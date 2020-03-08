/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thania;

/**
 *
 * @author lizbe
 */
public class Persona {
    
    private String nombre;
    private double edad;

    public Persona(String nombre, double edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
