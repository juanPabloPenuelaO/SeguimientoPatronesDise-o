package singleton;

public class Doctor {
    private static Doctor instance;
    private String nombreDoctor;
    private String especialidadDoctor;

    private Doctor() {}

    public static Doctor getInstance() {
        if(instance == null) {
            instance = new Doctor();
        }
        return instance;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }
}
