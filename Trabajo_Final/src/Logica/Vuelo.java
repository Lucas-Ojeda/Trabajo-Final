package Logica;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Vuelo implements Serializable,Informacion {

    List<Asafatas>asafatas;
    List<Pasajeros>pasajeros;
    private int id;
    private String ciudadDespegue;
    private String ciudadLlegada;
    private Avion a1;
    private Pilotos p1;
    private Pilotos p2;


    public Vuelo(int id,String ciudadDespegue,String ciudadLlegada){
        this.id=id;
        this.ciudadDespegue=ciudadDespegue;
        this.ciudadLlegada=ciudadLlegada;
        this.asafatas=new LinkedList<>();
        this.pasajeros=new LinkedList<>();
        this.a1=new Avion();
        this.p1=new Pilotos(null,null,0,0,0);
        this.p2=new Pilotos(null,null,0,0,0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudadDespegue() {
        return ciudadDespegue;
    }

    public void setCiudadDespegue(String ciudadDespegue) {
        this.ciudadDespegue = ciudadDespegue;
    }

    public String getCiudadLlegada() {
        return ciudadLlegada;
    }

    public void setCiudadLlegada(String ciudadLlegada) {
        this.ciudadLlegada = ciudadLlegada;
    }

    public Avion getA1() {
        return a1;
    }

    public void setA1(Avion a1) {
        this.a1 = a1;
    }

    public Pilotos getP1() {
        return p1;
    }

    public void setP1(Pilotos p1) {
        this.p1 = p1;
    }

    public Pilotos getP2() {
        return p2;
    }

    public void setP2(Pilotos p2) {
        this.p2 = p2;
    }

    public List<Asafatas> getAsafatas() {
        return asafatas;
    }

    public List<Pasajeros> getPasajeros() {
        return pasajeros;
    }

    public void agregarAvion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NOMBRE: ");
        String nombre=sc.nextLine();
        System.out.println("Capacidad: ");
        int capacidad=sc.nextInt();
        sc.nextLine();
        Avion avion=new Avion(nombre,capacidad);
        this.a1=avion;
    }
    public void eliminarAvion(){
        Avion a=new Avion(null,0);
        this.a1=a;
    }


    public void agregarPiloto1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Piloto N° 1: \n");
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.print("APELLIDO: ");
        String apellido = sc.nextLine();
        System.out.print("DNI:");
        int dni = sc.nextInt();
        System.out.println("AÑOS DE EXPERIENCIA: ");
        int años=sc.nextInt();
        System.out.println("SUELDO: ");
        double sueldo=sc.nextDouble();
        sc.nextLine();
        Pilotos piloto=new Pilotos(nombre,apellido,dni,años,sueldo);
        this.p1=piloto;
    }
    public void eliminarPiloto1(){
        Pilotos pilotos=new Pilotos(null,null,0,0,0);
        this.p1=pilotos;
    }

    public void agregarPiloto2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Piloto N° 2: \n");
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.print("APELLIDO: ");
        String apellido = sc.nextLine();
        System.out.print("DNI:");
        int dni = sc.nextInt();
        System.out.println("AÑOS DE EXPERIENCIA: ");
        int años=sc.nextInt();
        System.out.println("SUELDO: ");
        double sueldo=sc.nextDouble();
        sc.nextLine();
        Pilotos piloto=new Pilotos(nombre,apellido,dni,años,sueldo);
        this.p2=piloto;
    }
    public void eliminarPiloto2(){
        Pilotos pilotos=new Pilotos(null,null,0,0,0);
        this.p2=pilotos;
    }
    public void agregarAsafata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.print("APELLIDO: ");
        String apellido = sc.nextLine();
        System.out.print("DNI:");
        int dni = sc.nextInt();
        System.out.println("AÑOS DE EXPERIENCIA: ");
        int años=sc.nextInt();
        System.out.println("SUELDO: ");
        double sueldo=sc.nextDouble();
        sc.nextLine();
        Asafatas asafata=new Asafatas(nombre,apellido,dni,años,sueldo);
        this.asafatas.add(asafata);
    }
    public void agregarPasajeros(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.print("APELLIDO: ");
        String apellido = sc.nextLine();
        System.out.print("DNI:");
        int dni = sc.nextInt();
        System.out.println("Numero DE ASIENTO: ");
        int asiento=sc.nextInt();
        sc.nextLine();
        Pasajeros pasajero=new Pasajeros(nombre,apellido,dni,asiento);
        this.pasajeros.add(pasajero);
    }
    public void listarAsafatas(){
        for(Asafatas asafatas1: asafatas){
            System.out.println(asafatas1.imprimir());
        }
    }
    public void buscarAsafatas(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NOMBRE: ");
        String nombreAsafata=sc.nextLine();
        try{
            for(Asafatas asafatas1:asafatas){
                if(asafatas1.getNombre().equals(nombreAsafata)){
                    System.out.println(asafatas1.imprimir());
                }
            }
        }catch (Exception e){
            System.out.println("No se ecnotro asafata");
        }


    }
    public void eliminarAsafatas(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NOMBRE: ");
        String nombreAsafata=sc.nextLine();
        try{
            for(Asafatas asafatas1:asafatas){
                if(asafatas1.getNombre().equals(nombreAsafata)){
                    System.out.println(asafatas1.imprimir());
                    asafatas.remove(asafatas1);
                    System.out.println("Asafata eliminada");
                }
            }
        }catch (Exception e){
            System.out.println("No se encontro asafata");
        }


    }
    public void listarPasajeros(){
        for(Pasajeros pasajeros1: pasajeros){
            System.out.println(pasajeros1.imprimir());
        }
    }
    public void buscarPasajero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NOMBRE: ");
        String nombrePasajero=sc.nextLine();
        try {
            for(Pasajeros pasajeros1:pasajeros){
                if(pasajeros1.getNombre().equals(nombrePasajero)){
                    System.out.println(pasajeros1.imprimir());
                }
            }
        }catch (Exception e){
            System.out.println("Pasajero no encontrado");
        }

    }
    public void eliminarPasajero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NOMBRE: ");
        String nombrePasajero=sc.nextLine();
        try{
            for(Pasajeros pasajeros1:pasajeros){
                if(pasajeros1.getNombre().equals(nombrePasajero)){
                    pasajeros.remove(pasajeros1);
                    System.out.println("Pasajero Eliminado");
                }
            }
        }catch (Exception e){
            System.out.println("No se encontro el pasajero");
        }

    }

    @Override
    public String imprimir() {
        return "Vuelo: \nID: "+id+", Ciudad de despegue: "+ciudadDespegue+", Ciudad de llegada: "+ciudadLlegada+
                "\n"+a1.imprimir()+"\n"+p1.imprimir()+"\n"+p2.imprimir()+"\n";
    }


    //Agregar Avion
    //Modificar Avion




}