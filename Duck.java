/**
* name: Manu Achar
* date; 10/4/22
**/
package Chapter3HW;

public class Duck extends FarmAnimal{

    private String sound = "Quack Quack";

    public Duck(String name, String gender, double weight, int age){
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
        return "Duck " + sound +
                " [name=" + getName() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                ", age=" + getAge() +
                "]";
    }

    @Override
    public String feedLoadingSchedule(){
        return "8am - 12pm - 6pm";
    }
}
