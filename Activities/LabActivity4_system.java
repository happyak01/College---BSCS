import java.util.Scanner;
import java.util.Random;

public class LabActivity4_system {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int operatr=0;
        int range_one;
        int range_two;
        float userGuess;
        int a, b;
        float total;
        while (true) {
            System.out.println("Welcome to Math Training! You will choose which operation to practice and then set number range that will be used");
            System.out.println();
            System.out.println("Choose an operator:");
            System.out.println("1 - Exponent");
            System.out.println("2 - Multiplication");
            System.out.println("3 - Division");
            System.out.println("4 - Addition");
            System.out.println("5 - Subtraction");
            System.out.println("6 - PEMDAS Practice");
            System.out.println();
            operatr = scan.nextInt();

            System.out.println("Set initial range: ");
            range_one = scan.nextInt();
            range_two = scan.nextInt();

            switch (operatr) {
                case 1:
                    System.out.println("expo");
                    /*  WIP
                    
                    a = rand.nextInt(range_two - range_one);
                    b = rand.nextInt(range_two - range_one);
                    total =
                    System.out.println("What is "+ a +" powered by " + b +" ?");
                    userGuess = scan.nextFloat();
                    if (userGuess == ) {
                        
                    }*/
                    break;
                case 2:
                    System.out.println("mult");
                    a = rand.nextInt((range_two - range_one +1 )+range_one);
                    b = rand.nextInt((range_two - range_one +1 )+range_one);
                    total = a * b;
                    System.out.println("What is "+ a +" multiplied by " + b +" ?");
                    userGuess = scan.nextFloat();
                    if (userGuess == total) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong!");
                    }
                    break;
                case 3:
                    System.out.println("divis");
                    break;
                case 4:
                    System.out.println("add");
                    break;
                case 5:
                    System.out.println("sub");
                    break;
                case 6:
                    System.out.println("pemdas");
                    break;
            
                default:
                    System.out.println("You entered 0");
                    continue;
            }
            
        }
    }
}
