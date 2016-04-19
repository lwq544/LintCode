/**
 * Created by Silocean on 2016-04-19.
 */
public class ToyFactory {
    public static void main(String[] args) {
        Toy toy = ToyFactory.getToy("Cat");
        toy.talk();
    }

    /**
     * @param type a string
     * @return Get object of the type
     */
    public static Toy getToy(String type) {
        // Write your code here
        if (type.equals("Cat")) {
            return new Cat();
        } else if (type.equals("Dog")) {
            return new Dog();
        }
        return null;
    }
}

/**
 * Your object will be instantiated and called as such:
 * ToyFactory tf = new ToyFactory();
 * Toy toy = tf.getToy(type);
 * toy.talk();
 */
interface Toy {
    void talk();
}

class Dog implements Toy {
    // Write your code here

    @Override
    public void talk() {
        System.out.println("Wow");
    }
}

class Cat implements Toy {
    // Write your code here

    @Override
    public void talk() {
        System.out.println("Meow");
    }
}
