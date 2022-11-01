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

    public Avion(String nombre,int id,int capacidad, Pilotos p1, Pilotos p2){
        this.nombre=nombre;
        this.id=id;
        this.capacidad=capacidad;
        this.p1=p1;
        this.p2=p2;
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
        return "Avion: "+nombre+"\nID: "+id+"\nCapacidad: "+capacidad+"\nPiloto 1°: "+p1.toString()+"\nPiloto 2°: "+p2.toString();
    }

    //Agregar Pasajeros
    public void agregarPasajero(Pasajeros pasajero){
        listPasajeros.add(pasajero);
    }
    //Eliminar Pasajeros
    public void eliminarPasajero(String nombre){
        for (Pasajeros pasajero : listPasajeros) {
            if(pasajero.getNombre().equals(nombre)){
                listPasajeros.remove(pasajero);
            }
        }
    }

    //Modificar Pasajeros
    public void modificarPasajero(Pasajeros pasajero){
        for (int i = 0; i < listPasajeros.size(); i++) {
            if(listPasajeros.get(i).getDni()==pasajero.getDni()){
                listPasajeros.set(i, pasajero);
            }
        }
    }

    public int calcularAsafatas(){
        int cantAsafatas=0;
        cantAsafatas=capacidad/50;
        return cantAsafatas;
    }

    //Agregar Asafatas
    public void agregarAsafata(Asafatas asafata){
        listAsafatas.add(asafata);
    }
    //Elimiar Asafatas
    public void eliminarAsafata(String nombre){
        for (Asafatas asafata : listAsafatas) {
            if(asafata.getNombre().equals(nombre)){
                listAsafatas.remove(asafata);
            }
        }
    }
    //Modificar Asafatas
    public void modificarAsafata(Asafatas asafata){
        for (int i = 0; i < listAsafatas.size(); i++) {
            if(listAsafatas.get(i).getDni()==asafata.getDni()){
                listAsafatas.set(i, asafata);
            }
        }
    }
    //Elegir Pilotos para el avion
    public void elegirPilotos(Pilotos p1, Pilotos p2){
        this.p1=p1;
        this.p2=p2;
    }

}
