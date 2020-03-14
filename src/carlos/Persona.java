/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos;

/**
 *
 * @author Charly P
 */
public class Persona {

    String nombre;
    int edad;

    Persona(String string, int i) {
       
    }

    public void persona(String nombre, int edad) {
        nombre = this.nombre;
        edad = this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
