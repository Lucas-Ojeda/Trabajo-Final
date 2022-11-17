package Logica;

import java.io.Serializable;

public class Pilotos extends Persona implements Serializable, Informacion {
    private int añosExperiencia;
    private double sueldo;



    public Pilotos(String nombre, String apellido, int dni, int añosExperiencia,double sueldo) {
        super(nombre, apellido, dni);
        this.añosExperiencia=añosExperiencia;
        this.sueldo=sueldo;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public String imprimir() {
        return "Piloto:\n Nombre: "+super.getNombre()+", Apellido: "+super.getApellido()+", DNI: "+super.getDni()
                +"\nAños de experiencia: "+this.añosExperiencia+", Sueldo: $"+this.sueldo;
    }
}

