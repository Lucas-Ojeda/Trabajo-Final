import java.io.Serializable;

public class Asafatas extends Persona implements Serializable {
    private int añosExperiencia;
    private double sueldo;

    public Asafatas(){}

    public Asafatas(String nombre,String apellido,int dni,int añosExperiencia,double sueldo){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
        this.añosExperiencia=añosExperiencia;
        this.sueldo=sueldo;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" "+getApellido()+"\nDNI: "+getDni()+"\nAños de experiencia: "+ añosExperiencia+"\nSueldo:" + sueldo;
    }
}
