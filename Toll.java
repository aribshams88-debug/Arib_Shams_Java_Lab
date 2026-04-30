class TollBooth {
    private int totalCars = 0;
    private int unpaidCars = 0;
    private int totalCash = 0;

    // Car that pays Rs. 50
    public void payingCar() {
        totalCars++;
        totalCash += 50;
    }

    // Car that does not pay
    public void nonPayingCar() {
        totalCars++;
        unpaidCars++;
    }

    // Display result
    public void display() {
        System.out.println("Total number of cars passed: " + totalCars);
        System.out.println("Number of cars not paid tax: " + unpaidCars);
        System.out.println("Total cash collected: Rs. " + totalCash);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        TollBooth t = new TollBooth();

        // Simulating cars passing
        t.payingCar();
        t.payingCar();
        t.nonPayingCar();
        t.payingCar();
        t.nonPayingCar();

        // Display details
        t.display();
    }
}