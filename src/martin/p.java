/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martin;

/**
 *
 * @author MartinPC
 */
public class p {

    private String nombre;
    private int edad;

    public p() {
    }

    public p(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
