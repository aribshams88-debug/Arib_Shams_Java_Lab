class Counter {
    static int cnt = 0;

    Counter() {
        cnt++;
    }
}

public class CounterMain {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Number of objects created: " + Counter.cnt);
    }
}