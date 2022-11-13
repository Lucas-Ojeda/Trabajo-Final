import java.io.Serializable;

public class Asafatas extends Persona implements Serializable, Informacion {
    private int añosExperiencia;
    private double sueldo;

    public Asafatas(String nombre, String apellido, int dni, int añosExperiencia, double sueldo) {
        super(nombre, apellido, dni);
        this.añosExperiencia=añosExperiencia;
        this.sueldo=sueldo;
    }

    @Override
    public String imprimir() {
        return "Asafata:\nNombre: "+super.getNombre()+", Apellido: "+super.getApellido()+", DNI: "+super.getDni()
                +"\nAños de experiencia: "+this.añosExperiencia+", Sueldo: "+this.sueldo;
    }
}