import javax.swing.JOptionPane;
/*import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;*/
import java.util.LinkedList;
import java.util.List;

public class Aeropuerto implements Informacion {
    List<Vuelo> listVuelo=new LinkedList<>();

    public static void main(String[] args) {
        Aeropuerto aero=new Aeropuerto();
        int opcion= 0;

        int idvuelo;
        String ciudadDespeje;
        String ciudadLlegada;
        
        JOptionPane.showMessageDialog(null, "Bienvenido al aeropuerto", "Aeropuerto", JOptionPane.INFORMATION_MESSAGE);
        while(opcion!=4){
            opcion= JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Aeropuerto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Ver lista de Vuelos", "Agregar un Vuelo","Eliminar un Vuelo", "Salir"}, "Ver lista de Vuelos");
            switch(opcion){
                case 0:
                    aero.listar();
                    break;
                case 1:
                    idvuelo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del vuelo"));
                    ciudadDespeje=JOptionPane.showInputDialog("Ingrese la ciudad de despegue");
                    ciudadLlegada=JOptionPane.showInputDialog("Ingrese la ciudad de llegada");
                    aero.agregarVuelo(new Vuelo(idvuelo, ciudadDespeje, ciudadLlegada));
                    break;
                case 2:
                    idvuelo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del vuelo que desea eliminar"));
                    aero.eliminarVuelo(idvuelo);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa", "Aeropuerto", JOptionPane.INFORMATION_MESSAGE);
                    opcion = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida", "Aeropuerto", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        
        
        
        
        
        
        
        
        
        
        /*List<Vuelo> listVuelo=new LinkedList<>();
        //Flujo de datos al interior
        try{
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("Datos.txt"));
            listVuelo=(List<Vuelo>) recuperando_fichero.readObject();
            recuperando_fichero.close();

        }catch (Exception e){
            System.out.println("Error de lectura de Datos");
        }
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
        }*/

    }

    //agregar un vuelo
    public void agregarVuelo(Vuelo v){
        listVuelo.add(v);
    }

    //eliminar un vuelo
    public void eliminarVuelo(int id){
        for(int i=0;i< listVuelo.size();i++){
            if(listVuelo.get(i).getId()==id){
                listVuelo.get(i).liberarPiloto(id);
                listVuelo.remove(i);
            }break;
        }
    }

    @Override
    public void listar(){       
        for (int i = 0; i < listVuelo.size(); i++) {
            JOptionPane.showMessageDialog(null, listVuelo.get(i).toString());
        }

    }

}
