import javax.swing.JOptionPane;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Aeropuerto implements Serializable {
    static List<Vuelo>listVuelo=new LinkedList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=0;
        //Flujo de datos al interior
        try{
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("Aeropuerto.txt"));
            listVuelo=(List<Vuelo>) recuperando_fichero.readObject();
            recuperando_fichero.close();

        }catch (Exception e){
            System.out.println("Error de lectura de Datos");
        }

        System.out.println("\n ----------------------------------------\n Bienvenido al sistema del Aeropuerto");
        do{

            System.out.println(" ----------------------------------------\n");
            System.out.println("1)Crear vuel\n2)Administrar elementos de un Vuelo\n3)Listar Vuelos\n4)Buscar y listar datos de un vuelo" +
                    "\n5)Buscar y eliminar un vuelo\n6)Salir");
            System.out.println("Ingrese una opcion: ");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Crear Vuelo");
                    agregarVuelo();
                    break;
                case 2:
                    System.out.println("Administrar elementos de un vuelo");
                    administrarElementosVuelo();
                    break;
                case 3:
                    System.out.println("Listar vuelos");
                    listarVuelos();
                    break;
                case 4:
                    System.out.println("Buscar y listar datos de un vuelo");
                    bucarVuelo();
                    break;
                case 5:
                    System.out.println("Buscar y eliminar un vuelo");
                    eliminarVuelo();
                    System.out.println("vuelo eliminado");
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            //flujo de datos al exterior
            try{
                ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("Aeropuerto.txt"));
                escribiendo_fichero.writeObject(listVuelo);
                escribiendo_fichero.close();
            }catch (Exception e){
                System.out.println("Error de carga de Datos");
            }

        }while (opcion!=6);









    }
    static void administrarElementosVuelo(){
        int opcion2=0,id,opcion3=0;
        do{
            System.out.println(" ----------------------------------------");
            System.out.println("ID del Vuelo");
            id=sc.nextInt();
            Vuelo vuelo1=seleccionarVuelo(id);
            if(vuelo1==null){
                System.out.println("No se encontro el vuelo");
                opcion2=5;
            }

            while(opcion2!=5) {

                System.out.println("\n-----------------------------\n");
                System.out.println("1)Pilotos\n2)Asafatas\n3)Avion\n4)Pasajeros\n5)Salir");
                System.out.println("ingrese una opcion ");
                opcion2 = sc.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println(" Pilotos ");
                        System.out.println("----------");
                        System.out.println("1)Agregar Pilotos\n2)Eliminar Pilotos\n3)Salir");
                        opcion3=sc.nextInt();
                        do {
                            switch (opcion3) {
                                case 1:
                                    System.out.println("Agregar Pilotos");
                                    System.out.println("---------------");
                                    vuelo1.agregarPiloto1();
                                    vuelo1.agregarPiloto2();
                                    opcion3 = 3;
                                    break;
                                case 2:
                                    System.out.println("Eliminar Pilotos");
                                    System.out.println("---------------");
                                    vuelo1.eliminarPiloto1();
                                    vuelo1.eliminarPiloto2();
                                    opcion3 = 3;
                                    break;
                                case 3:
                                    System.out.println("Salir");
                                    opcion3 = 3;
                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");

                            }
                        }while(opcion3!=3);
                        break;
                    case 2:
                        System.out.println(" Asafatas ");
                        System.out.println("----------");
                        System.out.println("1)Agregar Asafatas\n2)Eliminar Asafatas\n3)Salir");
                        opcion3=sc.nextInt();
                        do {
                            switch (opcion3) {
                                case 1:
                                    System.out.println("Agregar Asafatas");
                                    System.out.println("---------------");
                                    vuelo1.agregarAsafata();
                                    opcion3 = 3;
                                    break;
                                case 2:
                                    System.out.println("Eliminar Asafatas");
                                    System.out.println("---------------");
                                    vuelo1.eliminarAsafatas();
                                    opcion3 = 3;
                                    break;
                                case 3:
                                    System.out.println("Salir");
                                    opcion3 = 3;
                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");

                            }
                        }while(opcion3!=3);
                        break;
                    case 3:
                        System.out.println(" Avion ");
                        System.out.println("----------");
                        System.out.println("1)Agregar Avion\n2)Eliminar Avion\n3)Salir");
                        opcion3=sc.nextInt();
                        do {
                            switch (opcion3) {
                                case 1:
                                    System.out.println("Agregar Avion");
                                    System.out.println("---------------");
                                    vuelo1.agregarAvion();
                                    opcion3 = 3;
                                    break;
                                case 2:
                                    System.out.println("Eliminar Avion");
                                    System.out.println("---------------");
                                    vuelo1.eliminarAvion();
                                    opcion3 = 3;
                                    break;
                                case 3:
                                    System.out.println("Salir");
                                    opcion3 = 3;
                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");

                            }
                        }while(opcion3!=3);
                        break;
                    case 4:
                        System.out.println(" Pasajeros ");
                        System.out.println("----------");
                        System.out.println("1)Agregar Pasajeros\n2)Eliminar Pasajeros\n3)Salir");
                        opcion3=sc.nextInt();
                        do {
                            switch (opcion3) {
                                case 1:
                                    System.out.println("Agregar Pasajeros");
                                    System.out.println("---------------");
                                    vuelo1.agregarPasajeros();
                                    opcion3 = 3;
                                    break;
                                case 2:
                                    System.out.println("Eliminar Pasajeros");
                                    System.out.println("---------------");
                                    vuelo1.eliminarPasajero();
                                    opcion3 = 3;
                                    break;
                                case 3:
                                    System.out.println("Salir");
                                    opcion3 = 3;
                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");

                            }
                        }while(opcion3!=3);
                        break;
                    case 5:
                        System.out.println(" Salir");
                        opcion2=5;
                        break;
                    default:
                        System.out.println("opcion incorrecta");
                }
            }
            opcion2=5;

            devolver(vuelo1,id);

        }while(opcion2!=5);
    }
    static void agregarVuelo(){
        System.out.println("ID DE VUELO: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("CIUDAD DE DESPEGUE: ");
        String despegue=sc.nextLine();
        System.out.println("CIUDAD DE DESTINO: ");
        String destino=sc.nextLine();
        Vuelo vuelo=new Vuelo(id, despegue, destino);
        listVuelo.add(vuelo);
    }
    static void listarVuelos(){
        for(Vuelo vuelo:listVuelo){
            System.out.println(vuelo.imprimir());
            System.out.println("\n<---------------------------->\n");
            vuelo.listarAsafatas();
            System.out.println("\n<---------------------------->\n");
            vuelo.listarPasajeros();
        }
    }
    static void bucarVuelo(){
        System.out.println("ID de vuelo: ");
        int id=sc.nextInt();
        for (Vuelo vuelo1:listVuelo ) {
            if(vuelo1.getId()==id){
                System.out.println(vuelo1.imprimir());
                System.out.println("\n<---------------------------->\n");
                vuelo1.listarAsafatas();
                System.out.println("\n<---------------------------->\n");
                vuelo1.listarPasajeros();
                break;
            }
        }

    }
    static void eliminarVuelo(){
        System.out.println("ID de Vuelo: ");
        int id=sc.nextInt();
        for(Vuelo vuelo1:listVuelo){
            if(vuelo1.getId()==id){
                listVuelo.remove(vuelo1);

                break;
            }
        }
    }
    static void eliminarVueloID(int id){
        for(Vuelo vuelo1:listVuelo){
            if(vuelo1.getId()==id){
                listVuelo.remove(id);
            }
        }
    }
    static Vuelo seleccionarVuelo(int id){
        for(Vuelo vuelo1: listVuelo){
            if(vuelo1.getId()==id){
                return vuelo1;
            }
        }
        return null;
    }
    static void devolver(Vuelo v1, int id){
        for(Vuelo vuelo:listVuelo){
            if(vuelo.getId()==id){
                vuelo=v1;
            }
        }
    }



}//Eliminar vuelos estatic
