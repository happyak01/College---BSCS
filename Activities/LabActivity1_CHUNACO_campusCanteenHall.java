import java.util.Scanner;

public class LabActivity1_CHUNACO_campusCanteenHall {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String line = "=============================";

    System.out.println(line);
    System.out.println("    CAMPUS CANTEEN BILL     ");
    System.out.println(line);
    System.out.println();
    
    System.out.print("Enter price of Item 1:    ");
    float item1 = scan.nextFloat();
    System.out.print("Enter quantity:           ");
    int quan_item1 = scan.nextInt();
    
    System.out.print("Enter price of Item 2:    ");
    float item2 = scan.nextFloat();
    System.out.print("Enter quantity:           ");
    int quan_item2 = scan.nextInt();
    
    System.out.print("Enter price of Item 3:    ");
    float item3 = scan.nextFloat();
    System.out.print("Enter quantity:           ");
    int quan_item3 = scan.nextInt();

    float total_item1 = item1 * quan_item1;
    float total_item2 = item2 * quan_item2;
    float total_item3 = item3 * quan_item3;
    
    System.out.println();
    System.out.println("Item 1 Total: " + total_item1);
    System.out.println("Item 2 Total: " + total_item2);
    System.out.println("Item 3 Total: " + total_item3);
    float total = total_item1 + total_item2 + total_item3;
    System.out.println("TOTAL BILL: " + total);
    
    System.out.print("Enter amount paid:        ");
    float amt_paid = scan.nextFloat();
    float change = amt_paid - total;
    System.out.println("Change: " + change);
}
}
