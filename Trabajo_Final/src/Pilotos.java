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
        if(estrellas>0 && estrellas<6){
            this.estrellas = estrellas;
        }else{System.out.println("Debe ingresar un numero entre 1 y 5. ");}
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

    public String imprimirEstrellas(int estrellas){
        estrellas = this.estrellas;
        String stars="";

        switch(estrellas){
            case 1:
                stars="⭐";
                break;
            case 2:
                stars="⭐⭐";
                break;
            case 3:
                stars="⭐⭐⭐";
                break;
            case 4:
                stars="⭐⭐⭐⭐";
                break;
            case 5:
                stars="⭐⭐⭐⭐⭐";
                break;
            default: System.out.println("ERROR");

        }
        return stars;
    }

    @Override
    public String toString() {
        return "Piloto: "+ "\n" +getNombre()+" "+getApellido()+", DNI: "+getDni()+", Años de experiencia: "+añosExperiencia
                +", Sueldo: $"+sueldo+", Estrellas: "+ imprimirEstrellas(estrellas);
    }
}
