package Logica;

import java.io.Serializable;

public abstract class  Persona implements Serializable {
    private String nombre, apellido;
    private int dni;

    public Persona(String nombre,String apellido, int dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }


}