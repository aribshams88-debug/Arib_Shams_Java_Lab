import java.util.Scanner;

class Commission {
    double sales;

    Commission(double s) {
        sales = s;
    }

    double commission() {
        if (sales < 0)
            return -1;
        else if (sales <= 100)
            return sales * 0.02;
        else if (sales <= 500)
            return sales * 0.05;
        else
            return sales * 0.1;
    }
}

public class CommissionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales: ");
        double s = sc.nextDouble();

        Commission obj = new Commission(s);
        double result = obj.commission();

        if (result == -1)
            System.out.println("Invalid Input");
        else
            System.out.println("Commission: " + result);
    }
}