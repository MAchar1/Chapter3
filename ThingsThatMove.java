
public class ThingsThatMove {
    public static void main(String[] args) {
        Airplane a = new Airplane("Boeing 747", 2016);
        Bird b1 = new Bird("Eagle");
        Bird b2 = new Bird("Hummingbird");

        System.out.println(a);
        a.fly();
        a.walk();
        a.jump();
        System.out.println(b1);
        b1.fly();
        b1.walk();
        b1.jump();
        System.out.println(b2);
        b2.fly();
        b2.walk();
        b2.jump();
    }
}
