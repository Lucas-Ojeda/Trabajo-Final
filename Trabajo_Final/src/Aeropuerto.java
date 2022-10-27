import javax.swing.JOptionPane;

public class Aeropuerto {
    public static void main(String[] args) {

        Pilotos p1 =new Pilotos();

        p1.setNombre("Juan");
        p1.setApellido("Martinez");
        p1.setDni(41477156);
        p1.setAñosExperiencia(10);
        p1.setEstrellas(3);
        p1.setSueldo(1000000);

        JOptionPane.showMessageDialog(null, p1.toString());

    }
}
