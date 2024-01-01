public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof!");
    }

    public String toString() {
        return super.toString();
    }

    public void greets(Dog another) {
        System.out.println("Woooooooooof!");
    }
}
