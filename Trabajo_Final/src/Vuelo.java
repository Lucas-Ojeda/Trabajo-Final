import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Vuelo implements Serializable {
    List<Avion>listAviones= new LinkedList<Avion>();
    private int id;
    private String ciudadDespegue;
    private String ciudadLlegada;
    private Avion avion;

    public Vuelo(){}

    public Vuelo(int id,String ciudadDespegue,String ciudadLlegada,Avion avionVuelo){
        this.id=id;
        this.ciudadDespegue=ciudadDespegue;
        this.ciudadLlegada=ciudadLlegada;
        this.avion=avionVuelo;
    }

    public Vuelo (int id,String ciudadDespegue,String ciudadLlegada){
        this.ciudadDespegue=ciudadDespegue;
        this.ciudadLlegada=ciudadLlegada;
        this.id=id;
    }

    public void setCiudadDespegue(String ciudadDespegue) {
        this.ciudadDespegue = ciudadDespegue;
    }

    public void setCiudadLlegada(String ciudadLlegada) {
        this.ciudadLlegada = ciudadLlegada;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setAvionVuelo(Avion avionVuelo) {
        this.avion = avionVuelo;
    }

    public String getCiudadDespegue() {
        return ciudadDespegue;
    }

    public String getCiudadLlegada() {
        return ciudadLlegada;
    }

    public Avion getAvion() {
        return avion;
    }

    public int getId() {
        return id;
    }

    public void liberarPiloto(int id){
        int a=0;

        for(int i=0;i<listAviones.size();i++){
            if(listAviones.get(i).getId()==id){
                listAviones.get(i).getPiloto1().setID(a);
                listAviones.get(i).getPiloto2().setID(a);
            }break;
        }
    }

    

    //deberiamos hacer que no pueda haber dos id iguales para vuelos;



    @Override
    public String toString() {
        return "ID del vuelo: "+id+"\nCiudad de despegue: "+ciudadDespegue+"\nCiudad de llegada: "+ciudadLlegada;
        }

    public void agregarAvion(Avion avion){
        listAviones.add(avion);
    }

    public void eliminarAvion(int id){
        for(int i=0;i<listAviones.size();i++){
            if(listAviones.get(i).getId()==id){
                
                listAviones.remove(i);
            }
        }
    }

    public void modificarAvion(Avion avion){
        for (int i = 0; i < listAviones.size(); i++) {
            if(listAviones.get(i).getId()==avion.getId()){
                listAviones.set(i, avion);
            }
        }
    }
    
    //listar aviones
    public void listar(){
        for (int i = 0; i < listAviones.size(); i++) {
            JOptionPane.showMessageDialog(null, listAviones.get(i).toString());
        }
    }

    public List<Avion> getListAvion() {
        return listAviones;
    }

    public void setListAvion(List<Avion> listAviones) {
        this.listAviones = listAviones;
    }

    

}