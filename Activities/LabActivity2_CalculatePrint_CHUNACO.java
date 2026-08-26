import java.util.Scanner;

public class LabActivity2_CalculatePrint_CHUNACO{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of B&W pages");
        float B_W = scan.nextFloat();
        System.out.println("Enter the number of colored pages");
        float colored = scan.nextFloat();

        B_W *= 3.00;
        colored *= 10.00;
        float total_cost = B_W + colored;

        System.out.println("-----------------------------------");
        System.out.println("B&W Printing Costs: " + B_W);
        System.out.println("Colored Printing Costs: " + B_W);
        System.out.println("Total Printing Costs: " + total_cost);

    }
}