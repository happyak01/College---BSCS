import java.util.Scanner;
import java.lang.Math;

public class CheckerPattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What size do you want? ");
        int size = scan.nextInt();
        double real = Math.pow(size, 2);
        for(int column=0; column<real; column++){
            for(int row=0; row<real; row++){
                if ((column%(size-1))==0 || row==0 || (row%(size-1))==0) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
             System.out.println();
        }
    }
}
