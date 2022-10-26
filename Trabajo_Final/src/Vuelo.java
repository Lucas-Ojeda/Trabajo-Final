import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Vuelo implements Serializable {
    List<Avion>listAviones= new LinkedList<Avion>();
    private int id;
    private String ciudadDespegue;
    private String ciudadLlegada;

    public Vuelo(){}

    public Vuelo (String ciudadDespegue,String ciudadLlegada,int id){
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

    public String getCiudadDespegue() {
        return ciudadDespegue;
    }

    public String getCiudadLlegada() {
        return ciudadLlegada;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Vuelo: "+"id: "+id+", ciudad de despegue: "+ciudadDespegue+", ciudad de llegada: "+ciudadLlegada;
    }
}
