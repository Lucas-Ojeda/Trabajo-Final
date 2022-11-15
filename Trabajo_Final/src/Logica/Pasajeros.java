package Logica;

import java.io.Serializable;

public class Pasajeros extends Persona implements Informacion, Serializable {
    private int asiento;

    public Pasajeros(String nombre, String apellido, int dni, int asiento) {
        super(nombre, apellido, dni);
        this.asiento=asiento;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String imprimir() {
        return "Pasajero:\nNombre: "+super.getNombre()+", Apellido: "+super.getApellido()+", DNI: "+super.getDni()+
                "\nNumero de asiento: "+this.asiento;
    }
}

