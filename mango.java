// Define the interface
interface Mango {
    void taste();
    void color();
}

// Implementing class Winter
class Winter implements Mango {
    public void taste() {
        System.out.println("Winter Mango tastes slightly sweet and mild.");
    }

    public void color() {
        System.out.println("Winter Mango color is light yellow.");
    }
}

// Implementing class Summer
class Summer implements Mango {
    public void taste() {
        System.out.println("Summer Mango tastes very sweet and juicy.");
    }

    public void color() {
        System.out.println("Summer Mango color is bright yellow/orange.");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Mango m1 = new Winter();
        Mango m2 = new Summer();

        System.out.println("Winter Mango Details:");
        m1.taste();
        m1.color();

        System.out.println("\nSummer Mango Details:");
        m2.taste();
        m2.color();
    }
}