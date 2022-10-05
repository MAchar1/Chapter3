/**
* name: Manu Achar
* date: 10/4/22
**/
public class ThingsThatFly {
    public static void main(String[] args) {
        Airplane a = new Airplane("Boeing 747", 2016);
        Bird b1 = new Bird("Eagle");
        Bird b2 = new Bird("Hummingbird");

        System.out.println(a);
        a.fly();
        System.out.println(b1);
        b1.fly();
        System.out.println(b2);
        b2.fly();
    }
}
