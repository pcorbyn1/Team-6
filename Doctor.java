public class Doctor {
    private final int DOCTOR_ID;
    private String name;
    private String specialty;

    public Doctor(int doctorIn, String nameIn, String specialtyIn){
        DOCTOR_ID = doctorIn;
        name = nameIn;
        specialty = specialtyIn;
    }

    public int getDoctor() {
        return DOCTOR_ID;
    }

    public String getDoctorName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String toString(){
        return "Dr. " + name + ", ID#: " + DOCTOR_ID;
    }
}
