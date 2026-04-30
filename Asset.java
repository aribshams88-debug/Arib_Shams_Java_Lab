abstract class Asset {
    abstract void displayDetails();
}

class Stock extends Asset {
    void displayDetails() {
        System.out.println("Stock Details");
    }
}

class Bond extends Asset {
    void displayDetails() {
        System.out.println("Bond Details");
    }
}

class Savings extends Asset {
    void displayDetails() {
        System.out.println("Savings Details");
    }
}

public class AssetMain {
    public static void main(String[] args) {
        Asset a1 = new Stock();
        Asset a2 = new Bond();
        Asset a3 = new Savings();

        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
    }
}