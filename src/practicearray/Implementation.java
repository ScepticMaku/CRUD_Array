package practicearray;
import java.util.Scanner;

public class Implementation {
    int id, quantity;
    String name, category, status;
    double price;
    
    Scanner sc = new Scanner(System.in);
    
    public void addProducts(int p_id, String p_name, String p_category, int p_quantity, double p_price, String p_status){
        this.id = p_id;
        this.name = p_name;
        this.category = p_category;
        this.quantity = p_quantity;
        this.price = p_price;
        this.status = p_status;
    }
    
    public void viewProducts(){
        System.out.printf("%-5d %-15s %-15s %-15d %-15.2f %-15s\n", id, name, category, quantity, price, status);
    }
    
    public String criteria(int p_quantity, double p_price){
        return status = ((p_quantity > 0) && (p_price > 0)) ? "Valid" : "Invalid";
    }
    
    int n_quantity;
    double n_price;
    
    public void editProducts(int selected){
        switch(selected){
            case 1 -> {
                System.out.print("\nEnter new stock quantity: ");
                quantity = n_quantity = sc.nextInt();
                
                System.out.println("Stock quantity successfully changed.");
            }
            case 2 -> {
                System.out.print("\nEnter new Price per Unit: ");
                price = n_price = sc.nextDouble();
                
                System.out.println("Pricer per Unit successfully changed.");
            }
        }
    }
    
    public boolean removeProducts(){
        System.out.print("Confirm Deletion? [y/n]: ");
        String confirm = sc.next();
        
        if(!(confirm.equals("y"))){
            System.out.println("Deletion cancelled.");
            return false;
        } else{
            System.out.println("Successfully Deleted.");
            return true;
        }
    }
    
}
