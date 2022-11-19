public class Hospital{
    private final String ADDRESS;
    private final String NAME;

    public Hospital(String addressIn, String nameIn){
        ADDRESS =addressIn;
        NAME = nameIn;
    }

    public String getHospitalLocation(){
        return ADDRESS;
    }

    public String getHosptialName(){
        return NAME;
    }

    public String toString(){
        return NAME + " Located at " + ADDRESS;
    }

}