package singleton;

public class MainSingleton {
    public static void main(String[] args) {

        Doctor doctor = Doctor.getInstance();

        doctor.setNombreDoctor("Doctora Juguetes");
        doctor.setEspecialidadDoctor("Zootecnia");

        String nombreDoctor = doctor.getNombreDoctor();
        String especialidadDoctor = doctor.getEspecialidadDoctor();

        System.out.println("Nombre del doctor: " + nombreDoctor);
        System.out.println("Especialidad del doctor: " + especialidadDoctor);
    }
}

