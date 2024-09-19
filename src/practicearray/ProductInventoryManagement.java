package practicearray;

import java.util.*;

public class ProductInventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Execution execute = new Execution();
        
        while(true){
            System.out.println("""
                               Product Inventory Management
                               1. Add Products
                               2. View Producs
                               3. Edit Products
                               4. Delete Products
                               5. Exit""");
            System.out.print("Enter selection: ");
            int selection = sc.nextInt();
             
            switch(selection){
                case 1 -> execute.inputProduct();
                case 2 -> execute.displayProduct();
                case 3 -> execute.changeProduct();
                case 4 -> execute.eraseProduct();
                case 5 -> System.exit(0);
            }
            System.out.println();
        }
    }
   
}
