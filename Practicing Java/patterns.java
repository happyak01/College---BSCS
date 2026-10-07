import java.util.Scanner;
import java.lang.Math;

public class patterns {
    public static void checkerBoard(double size){
        //finished 20mis
        double powered = Math.pow(size, 2);
        for (int column=0; column<=powered; column++){
            for(int row=0; row<=powered; row++){
                if ((column%size)==0||(row%size)==0) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }

    public static void triangle(int size){
        //spaces
        for (int min=0; min!=size; min++){
            for(int stars= size-min; stars!=0; stars--){
                System.out.print(" ");
            }
            for (int i=0; i<=(min*6); i++){
                if ((i%3)==0) {
                    System.out.print();
                } else{
                    System.out.print("");
                }
            }
            System.out.println(" ");
        }
    }



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How big it should be?   ");
        int size = scan.nextInt();
        System.out.println("Choose what pattern to print: \n1. Checker Board\n2. Triangle\n3. Right Triangle");
        switch (scan.nextInt()) {
            case 1:
                checkerBoard(size);
                break;

            case 2:
                //redirect to triangle
                triangle(size);
                break;
            
            case 3:
                //redirect to right triangle
                break;
        
            default:
                break;
        }
    }
}
