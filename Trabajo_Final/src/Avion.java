import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Avion implements Serializable {
    private String nombre;
    private int id;
    List<Pasajeros> listP=new LinkedList<Pasajeros>();
    private int capacidad;
    List<Asafatas>listA=new LinkedList<Asafatas>();
    private Pilotos p1=new Pilotos();
    private Pilotos p2=new Pilotos();

}
