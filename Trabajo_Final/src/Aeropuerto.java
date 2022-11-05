import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument.BranchElement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public class Aeropuerto implements Informacion {
    static List<Vuelo> listVuelo=new LinkedList<>();

    public static void main(String[] args) {
        Aeropuerto aero=new Aeropuerto();
        int opcion= 0, opcionVuelo=0, opcionAvion=0, opcionPersonal=0;

        int idvuelo;
        String ciudadDespeje;
        String ciudadLlegada;

        int idAvion;
        String nombreAvion;
        int capacidadAvion;
        Pilotos p1;
        Pilotos p2;

        List<Pilotos> listPilotos=new LinkedList<Pilotos>();        

        Pilotos piloto1 = new Pilotos("Juan","Martinez",41477156,5,10000,5);
        Pilotos piloto2 = new Pilotos("Lucas","Ojeda",42156651,5,10000,5);
        Pilotos piloto3 = new Pilotos("Pedro","Gomez",22222222,3,5000,3);
        Pilotos piloto4 = new Pilotos("Maria","Perez",33333333,3,5000,3);
        Pilotos piloto5 = new Pilotos("Jose","Gonzalez",44444444,7,6000,2);
        Pilotos piloto6 = new Pilotos("Luis","Rodriguez",55555555,2,7500,4);

        listPilotos.add(piloto1);
        listPilotos.add(piloto2);
        listPilotos.add(piloto3);
        listPilotos.add(piloto4);
        listPilotos.add(piloto5);
        listPilotos.add(piloto6);
        //variables y demas arriba de esta linea
        //Flujo de datos al interior
        try{
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("Datos.txt"));
            listVuelo=(List<Vuelo>) recuperando_fichero.readObject();
            recuperando_fichero.close();

        }catch (Exception e){
            System.out.println("Error de lectura de Datos");
        }
        //menu abajo de esta linea
        JOptionPane.showMessageDialog(null, "Bienvenido al Aeropuerto");

        do{
            opcion= JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Aeropuerto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Vuelos", "Aviones","Personal", "Salir"}, "Vuelos");
            switch(opcion){
                case 0:
                //vuelos
                    do{
                        opcionVuelo= JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Vuelos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Crear Vuelo", "Eliminar Vuelo","Mostrar Vuelos", "Atras"}, "Crear Vuelo");
                        switch(opcionVuelo){
                            case 0:
                                idvuelo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del vuelo", "Crear Vuelo", JOptionPane.QUESTION_MESSAGE));
                                ciudadDespeje=JOptionPane.showInputDialog(null, "Ingrese la ciudad de despegue", "Crear Vuelo", JOptionPane.QUESTION_MESSAGE);
                                ciudadLlegada=JOptionPane.showInputDialog(null, "Ingrese la ciudad de llegada", "Crear Vuelo", JOptionPane.QUESTION_MESSAGE);
                                Vuelo vuelo=new Vuelo(idvuelo, ciudadDespeje, ciudadLlegada);
                                listVuelo.add(vuelo);
                                break;
                            case 1:
                                idvuelo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del vuelo", "Eliminar Vuelo", JOptionPane.QUESTION_MESSAGE));
                                for(int i=0;i<listVuelo.size();i++){
                                    if(listVuelo.get(i).getId()==idvuelo){
                                        listVuelo.remove(i);
                                    }
                                }
                                break;
                            case 2:
                                for(int i=0;i<listVuelo.size();i++){
                                    JOptionPane.showMessageDialog(null, listVuelo.get(i).toString(), "Vuelos", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            case 3:
                                opcionVuelo=4;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                    }while(opcionVuelo!=4);
                    break;
                case 1:
                //aviones
                    do{
                        opcionAvion= JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Aviones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Crear Avion", "Eliminar Avion","Mostrar Aviones", "Atras"}, "Crear Avion");
                        switch(opcionAvion){
                            case 0:
                                idvuelo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del vuelo", "Crear Avion", JOptionPane.QUESTION_MESSAGE));
                                for(int i=0;i<listVuelo.size();i++){
                                    if(listVuelo.get(i).getId()==idvuelo){
                                        idAvion=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del avion", "Crear Avion", JOptionPane.QUESTION_MESSAGE));
                                        nombreAvion=JOptionPane.showInputDialog(null, "Ingrese el nombre del avion", "Crear Avion", JOptionPane.QUESTION_MESSAGE);
                                        capacidadAvion=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad del avion", "Crear Avion", JOptionPane.QUESTION_MESSAGE));
                                        p1 = (Pilotos) JOptionPane.showInputDialog(null, "Seleccione el primer piloto", "Crear Avion", JOptionPane.QUESTION_MESSAGE, null, listPilotos.toArray(), null);
                                        p1.setID(idvuelo);
                                        listPilotos.remove(p1);
                                        p2 = (Pilotos) JOptionPane.showInputDialog(null, "Seleccione el segundo piloto", "Crear Avion", JOptionPane.QUESTION_MESSAGE, null, listPilotos.toArray(), null);
                                        p2.setID(idvuelo);
                                        listVuelo.get(i).agregarAvion(new Avion(idAvion, nombreAvion, capacidadAvion, p1,p2));
                                    }
                                }
                                break;
                            case 1:
                                //eliminar avion
                                idvuelo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del vuelo", "Eliminar Avion", JOptionPane.QUESTION_MESSAGE));
                                for(int i=0;i<listVuelo.size();i++){
                                    if(listVuelo.get(i).getId()==idvuelo){
                                        idAvion=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del avion", "Eliminar Avion", JOptionPane.QUESTION_MESSAGE));
                                        listVuelo.get(i).eliminarAvion(idAvion);
                                    }
                                }
                                break;
                            case 2:
                                idvuelo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del vuelo", "Mostrar Aviones", JOptionPane.QUESTION_MESSAGE));
                                for(int i=0;i<listVuelo.size();i++){
                                    if(listVuelo.get(i).getId()==idvuelo){
                                        listVuelo.get(i).listar();
                                    }
                                }
                                break;
                            case 3:
                                opcionAvion=4;
                                break;
                        }
                    }while(opcionAvion!=4);
                    break;
                case 2:
                    //Personal
                    do{
                        opcionPersonal = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Personal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Mostrar Pilotos", "Mostrar Asafatas","Crear Pilotos","Crear Asafatas", "Atras"}, "Crear Personal");
                        switch(opcionPersonal){
                            case 0:
                                
                                break;
                            case 1:
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                opcionPersonal=5;
                                break;
                        }
                    }while(opcionPersonal!=5);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa", "Aeropuerto", JOptionPane.INFORMATION_MESSAGE);
                    opcion = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida", "Aeropuerto", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }while(opcion!=4);
        
        
        /*switch(opcion){
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
            } */
        
        
        
        
        
        
        

        //pone tu codigo arriba de esto
        //flujo de datos al exterior
        try{
            ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("Datos.txt"));
            escribiendo_fichero.writeObject(listVuelo);
            escribiendo_fichero.close();
        }catch (Exception e){
            System.out.println("Error de carga de Datos");
        }
    }

    public void agregarVuelo(Vuelo v){
        listVuelo.add(v);
    }

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
