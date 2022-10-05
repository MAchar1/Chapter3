/**
* name: Manu Achar
* date; 10/4/22
**/
public class Cow extends FarmAnimal {

    private String sound = "Moo Moo";

    public Cow(String name, String gender, double weight, int age){
        super(name, gender, weight, age);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Cow " + sound +
                " [name=" + getName() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                ", age=" + getAge() +
                "]";
    }

    @Override
    public String feedLoadingSchedule(){
        return "6am - 4pm";
    }
}
