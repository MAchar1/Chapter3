/*
* name: Manu Achar
* date: 10/4/22
*/
public abstract class FarmAnimal {

    private String name;
    private String gender;
    private double weight;
    private int age;

    public FarmAnimal(String name, String gender, double weight, int age){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return name + " is " + gender + " and weighs " + weight + " and is " + age + " years old.";
    }

    public abstract String feedLoadingSchedule();
}
