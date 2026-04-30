abstract class AbstractProduct {
    int product_id;

    abstract void display();
}

class Book extends AbstractProduct {
    void display() {
        System.out.println("Travel Guide Book ID: " + product_id);
    }
}

class CD extends AbstractProduct {
    void display() {
        System.out.println("CD ID: " + product_id);
    }
}

public class AbstractProductMain {
    public static void main(String[] args) {
        Book b = new Book();
        b.product_id = 1;
        b.display();

        CD c = new CD();
        c.product_id = 2;
        c.display();
    }
}