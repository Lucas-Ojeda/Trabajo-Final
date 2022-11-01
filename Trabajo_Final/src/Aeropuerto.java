import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Aeropuerto {
    public static void main(String[] args) {
        List<Vuelo> listVuelo=new LinkedList<>();
        //Flujo de datos al interior
        try{
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("Datos.txt"));
            listVuelo=(List<Vuelo>) recuperando_fichero.readObject();
            recuperando_fichero.close();

        }catch (Exception e){
            System.out.println("Error de lectura de Datos");
        }

        /*Vuelo vuelo1 =new Vuelo("Buenos Aires","Miami",456 );
        Pilotos p1 =new Pilotos("Juan", "Martinez", 41477156, 5, 10000, 5);
        Pilotos p2 =new Pilotos("Lucas", "Ojeda", 54612345, 10, 15000, 4);
        Avion avion1 =new Avion("Boeing 747", 1, 500, p1, p2);
        Asafatas asafatas1 =new Asafatas("Maria", "Gomez", 45678912, 3, 5000);
        Pasajeros pasajeros1 =new Pasajeros("Juan", "Perez", 45678912, 41);

        vuelo1.setCiudadDespegue("Buenos Aires");
        vuelo1.setCiudadLlegada("Miami");
        vuelo1.agregarAvion(avion1);

        avion1.agregarAsafata(asafatas1);
        avion1.agregarPasajero(pasajeros1);

        JOptionPane.showMessageDialog(null, vuelo1.toString());
        JOptionPane.showMessageDialog(null, avion1.toString());*/


        //flujo de datos al exterior
        try{
            ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("Datos.txt"));
            escribiendo_fichero.writeObject(listVuelo);
            escribiendo_fichero.close();
        }catch (Exception e){
            System.out.println("Error de carga de Datos");
        }

    }
    public static void eliminarVuelos(int id, List<Vuelo> vuelo){
        for(int i=0;i< vuelo.size();i++){
            if(vuelo.get(i).getId()==id){
                vuelo.get(i).liberarPiloto(id);
                vuelo.remove(i);
            }break;
        }

    }
}
