import java.io.Serializable;

public class Pasajeros extends Persona implements Serializable {
    private int asiento;

    public Pasajeros(){}

    public Pasajeros(String nombre,String apellido,int dni,int asiento){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
        this.asiento=asiento;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Pasajero: "+getNombre()+" "+getApellido()+", DNI: "+getDni()+", asiento: " + asiento;
    }
}
