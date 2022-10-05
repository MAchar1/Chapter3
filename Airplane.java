/**
* name: Manu Achar
* date: 10/4/22
**/
public class Airplane implements Flight{

    private String model;
    private int yearBuilt;

    public Airplane(String model, int year){
        this.model = model;
        this.yearBuilt = year;
    }

    public String getModel() {
        return model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public void fly(){
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }

    @Override
    public String toString(){
        return "Airplane [model=" + model + ", year=" + yearBuilt + "]";
    }
}
