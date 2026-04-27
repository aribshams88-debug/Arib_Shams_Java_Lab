// Interface for Sales Department
interface SalesDepartment {
    void processSale(double amount);
}

// Interface for Finance Department
interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

// Class implementing both interfaces (Multiple Inheritance)
class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    
    private double lastSaleAmount;
    private String lastClient;

    // Implementation of SalesDepartment method
    @Override
    public void processSale(double amount) {
        lastSaleAmount = amount;
        System.out.println("Sales Department:");
        System.out.println("Processing sale of amount: ₹" + amount);
        System.out.println("Sale processed successfully.\n");
    }

    // Implementation of FinanceDepartment method
    @Override
    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("Finance Department:");
        System.out.println("Generating invoice for client: " + clientName);
        System.out.println("Invoice Amount: ₹" + amount);
        System.out.println("Invoice generated successfully.\n");
    }

    // Additional method
    public void showSummary() {
        System.out.println("----- Commercial Operations Summary -----");
        System.out.println("Last Client: " + lastClient);
        System.out.println("Last Sale Amount: ₹" + lastSaleAmount);
        System.out.println("All operations completed successfully.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        CommercialExecutive executive = new CommercialExecutive();

        // Calling interface methods
        executive.processSale(50000.0);
        executive.generateInvoice("ABC Pvt Ltd", 50000.0);

        // Calling additional method
        executive.showSummary();
    }
}