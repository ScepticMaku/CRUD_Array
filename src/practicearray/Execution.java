package practicearray;
import java.util.*;

public class Execution {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    Implementation[] implement = new Implementation[100];
    
    public void inputProduct(){
        System.out.println("\nAdd Products");
        System.out.print("Enter number of products: ");
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++){
            System.out.printf("\nEnter details of product %d:\n",(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            
            System.out.print("Product Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Category: ");
            String category = sc.next();
            
            System.out.print("Stock Quantity: ");
            int quantity = sc.nextInt();
            
            System.out.print("Price per Unit: ");
            double price = sc.nextDouble();
            
            implement[max] = new Implementation();
            implement[max].addProducts(id, name, category, quantity, price, implement[max].criteria(quantity, price));
            max+=1;
        }
    }
    
    public void displayProduct(){
        System.out.println("\nDisplay Products");
        System.out.printf("%-5s %-15s %-15s %-15s %-15s %-15s\n", "ID", "Name", "Category", "Stock Quantity", "Price per Unit", "Status");
        
        for(int i = 0; i < max; i++){
            implement[i].viewProducts();
        }
    }
    
    public void changeProduct(){
        System.out.println("\nEdit Products");
        System.out.print("Enter ID you want to edit: ");
        int id = sc.nextInt();
        
        for(int i = 0; i < max; i++){
            if(id == implement[i].id){
                System.out.println("\nSelected product: "+implement[i].name);
                System.out.println("""
                                 -----------------------
                                 Choose what to edit:
                                 1. Stock Quantity
                                 2. Price per Unit""");
                System.out.print("Enter selection: ");
                int select = sc.nextInt();
                
                implement[i].editProducts(select);
            }
        }
    }
    
    public void eraseProduct(){
        System.out.println("\nRemove Products");
        System.out.print("Enter ID you want to remove: ");
        int id = sc.nextInt();
        
        for(int i = 0; i < max; i++){
            if(id == implement[i].id){
                System.out.println("Selected product: "+implement[i].name);
                if(implement[i].removeProducts()){
                    implement[i].addProducts(implement[i+1].id-1, implement[i+1].name, implement[i+1].category, implement[i+1].quantity, implement[i+1].price, implement[i+1].status);
                    max-=1;
                }
            }        
        }
    }
}
