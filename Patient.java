public class Patient {
    private final int PATIENT_ID;
    private String name;
    private String title;
    private  final String DOB;
    private String emergencyContact;
    private String doa;
    private String phoneNumber;
    private Hospital hospitalLocation;
    private int roomNum;
    private Doctor assignedDoctor;

    public Patient(int patientIn, String nameIn, String titleIn, String DOBin, String emconIn, String doaIn, String phoneIn, Hospital locationIn, int roomIn, Doctor doctorIn){
        PATIENT_ID= patientIn;
        name = nameIn;
        DOB = DOBin;
        emergencyContact = emconIn;
        doa = doaIn;
        phoneNumber = phoneIn;
        hospitalLocation = locationIn;
        roomNum = roomIn;
        assignedDoctor = doctorIn;
    }

    public int getPatientID(){
        return PATIENT_ID;
    }

    public String getPatientName(){
        return name;
    }

    public String getPatientTitle(){
        return title;
    }

    public String getPatientDOB(){
        return DOB;
    }

    public String getEmergencyContact(){
        return emergencyContact;
    }

    public String getDateOfArrival(){
        return doa;
    }

    public String getPatientPhoneNumber(){
        return phoneNumber;
    }

    public Hospital getPatientHospital(){
        return hospitalLocation;
    }

    public int getRoomNumber(){
        return roomNum;
    }

    public Doctor getAssignedDoctor(){
        return assignedDoctor;
    }
}
