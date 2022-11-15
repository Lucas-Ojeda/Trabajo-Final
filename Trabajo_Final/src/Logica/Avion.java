package Logica;

import java.io.Serializable;


public class Avion implements Serializable, Informacion {

    private String nombre;
    private int capacidad;

    public Avion(){}
    public Avion(String nombre, int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String imprimir() {
        return "Avion:\n Nombre: "+this.nombre+", capacidad: "+this.capacidad;
    }


}

