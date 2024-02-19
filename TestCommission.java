import java.util.Scanner;

class Commission {
    private double sale;

    
    public Commission(double sale) {
        this.sale = sale;
    }

    
    public double calculateCommission() {
        if (sale < 0) {
            return -1; 
        } else if (sale < 500) {
            return sale * 0.02; 
        } else if (sale >= 500 && sale <= 5000) {
            return sale * 0.05; 
        } else {
            return sale * 0.08; 
        }
    }
}

public class TestCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the sales amount:");
        double sale = scanner.nextDouble();

        
        Commission commission = new Commission(sale);

        
        double commissionAmount = commission.calculateCommission();
        if (commissionAmount == -1) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Commission: " + commissionAmount);
        }

        scanner.close();
    }
}
