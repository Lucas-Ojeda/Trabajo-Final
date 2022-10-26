import java.io.Serializable;

public class Pilotos extends Persona implements Serializable {
    private int añosExperiencia;
    private double sueldo;
    private int estrellas;

    public Pilotos(){}

    public Pilotos(String nombre,String apellido,int dni,int añosExperiencia,double sueldo,int estrellas){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
        this.añosExperiencia=añosExperiencia;
        this.sueldo=sueldo;
        this.estrellas=estrellas;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getEstrellas() {
        return estrellas;
    }

    @Override
    public String toString() {
        return "Piloto: "+ "\n" +getNombre()+" "+getApellido()+", DNI: "+getDni()+", años de experiencia: "+añosExperiencia
                +", sueldo:"+sueldo+", estrellas: "+ estrellas;
    }
}
