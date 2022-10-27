import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Avion implements Serializable {
    List<Pasajeros> listPasajeros=new LinkedList<Pasajeros>();
    List<Asafatas>listAsafatas=new LinkedList<Asafatas>();
    private String nombre;
    private int id;
    private int capacidad;
    private String horarioSalida = "";

    private Pilotos p1=new Pilotos();
    private Pilotos p2=new Pilotos();

    public Avion(){}

    public Avion(String nombre,int id,int capacidad){
        this.nombre=nombre;
        this.id=id;
        this.capacidad=capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    @Override
    public String toString() {
        return "Avion: "+"nombre: "+nombre+", id: "+id+", capacidad: "+capacidad+", 1°"+p1.toString()+", 2°"+p2.toString();
    }

    //Agregar Pasajeros
    //Eliminar Pasajeros
    //Modificar Pasajeros

    //Calcular cantidad de Asafatas
    //Agregar Asafatas
    //Elimiar Asafatas
    //Modificar Asafatas

    //Elegir Pilotos
    //

}
