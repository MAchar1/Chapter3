/**
* name: Manu Achar
* date: 10/4/22
**/

public class Chicken extends FarmAnimal{

    private String sound;

    public Chicken(String name, String gender, double weight, int age){
        super(name, gender, weight, age);
        if (gender == "male"){
            this.sound = "Cock-a-Doodle-doo";
        } else this.sound = "Cluck Cluck";
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString(){
        return "Chicken " + sound +
                " [name=" + getName() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                ", age=" + getAge() +
                "]";
    }

    @Override
    public String feedLoadingSchedule(){
        return "8am - 4pm";
    }
}
