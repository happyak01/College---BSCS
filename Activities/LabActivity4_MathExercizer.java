import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class LabActivity4_MathExercizer {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int operatr=0;
        int range_one, range_two;
        float userGuess;
        //random num holder
        int a, b;
        float total = 0;
        int completedIteration = 0;
        int totalIteration=0;
        //exponent
        int range_one_exp=0;
        int range_two_exp=0;
        //previous num random, for checking if its equal to the current 'a' and 'b' 
        int prev_a=0;
        int prev_b=0;
        //text coloring
        String ANSI_Reset = "\u001B[0m";
        String ANSI_Green = "\u001B[32m";
        String ANSI_Red = "\u001B[31m";


        System.out.println("Welcome to Math Exercizer! You will choose which operation to practice and then set number range that will be used");
        System.out.println();
            System.out.println("Choose an operator:");
            System.out.println("1 - Exponent");
            System.out.println("2 - Multiplication");
            System.out.println("3 - Division");
            System.out.println("4 - Addition");
            System.out.println("5 - Subtraction");
            System.out.println();
            operatr = scan.nextInt();
            while (operatr == 0 || operatr>=5) {
                System.out.println();
                System.out.println("Invalid number, there's no opearator. Enter again");
                System.out.println("Choose an operator:");
                System.out.println("1 - Exponent");
                System.out.println("2 - Multiplication");
                System.out.println("3 - Division");
                System.out.println("4 - Addition");
                System.out.println("5 - Subtraction");
                System.out.println("6 - PEMDAS Practice");
                operatr = scan.nextInt();
            }
            System.out.println("Set minimum range: ");
            range_one = scan.nextInt();
            System.out.println("Set maxinum range: ");
            range_two = scan.nextInt();

            while (range_one>range_two) {
                System.out.println();
                System.out.println("Invalid Range. Re-enter.");
                System.out.println("Set minimum range: ");
                range_one = scan.nextInt();
                System.out.println("Set maxinum range: ");
                range_two = scan.nextInt();
            }

            if (operatr==1) {
                System.out.println("Set mininum range for the power: ");
                range_one_exp = scan.nextInt();
                System.out.println("Set maxinum range for the power: ");
                range_two_exp = scan.nextInt();
                while (range_one_exp>range_two_exp) {
                    System.out.println();
                    System.out.println("Invalid Range. Re-enter.");
                    System.out.println("Set minimum range: ");
                    range_one_exp = scan.nextInt();
                    System.out.println();
                    System.out.println("Set maxinum range: ");
                    range_two_exp = scan.nextInt();
            }
            }

            while (totalIteration<=0) {
                System.out.println("How many questions you want to solve?");
                totalIteration = scan.nextInt();
                System.out.println();
                if (totalIteration<=0) {
                    System.out.println("Invalid input. Why put less than one?");
                }
            }

        while (completedIteration != totalIteration) {
            switch (operatr) {
                case 1:
                    // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two_exp - range_one_exp +1 )+range_one);
                        total = (float) Math.pow(a, b);

                        System.out.println("What is "+ a +" powered by " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println(ANSI_Green+"Correct!"+ANSI_Reset);
                            System.out.println();
                            completedIteration++;
                        break;
                        } else {
                            System.out.println(ANSI_Red+"Wrong!");
                            System.out.println("Answer is: " + total +ANSI_Reset);
                            System.out.println();
                            completedIteration++;
                        break;
                        }
                case 2:
                        // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        if (prev_a != a && prev_b != b) {
                            total = a * b;

                        System.out.println("What is "+ a +" multiplied by " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println(ANSI_Green+"Correct!"+ANSI_Reset);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                            System.out.println();
                            break;
                        } else {
                            System.out.println(ANSI_Red+"Wrong!");
                            System.out.println("Answer is: " + total +ANSI_Reset);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                            System.out.println();
                            break;
                        }
                    } else {
                        continue;
                    }
                case 3:
                    // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        /*
                        repeatingly checks if the numbers respects the division rules:
                        1. if 'a' is bigger than divisor 'b'
                        2. divisor 'b' isnt 0
                        3. making it basic by checking if theres no remainder
                        4. checking if numbers are not the same as the previous
                        */
                        if (a>=b && b!=0 && a%b == 0 && prev_a != a && prev_b != b) {
                            total = (float) a / b;
                        
                        System.out.println("What is "+ a +" divided by " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println(ANSI_Green+"Correct!"+ANSI_Reset);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                            System.out.println();
                        break;
                        } else {
                            System.out.println(ANSI_Red+"Wrong!");
                            System.out.println("Answer is: " + total +ANSI_Reset);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                            System.out.println();
                        break;
                        }
                        } else {
                            continue;
                        }
                        
                case 4:
                    // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        total = a + b;
                        if (prev_a != a && prev_b != b){
                        System.out.println("What is "+ a +" plus " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println(ANSI_Green+"Correct!"+ANSI_Reset);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                            System.out.println();
                        break;
                        } else {
                            System.out.println(ANSI_Red+"Wrong!");
                            System.out.println("Answer is: " + total +ANSI_Reset);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                            System.out.println();
                        break;
                        }
                    } else{
                        continue;
                    }
                case 5:
                    // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        total = a - b;

                        if (prev_a != a && prev_b != b){
                        System.out.println("What is "+ a +" minus " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println(ANSI_Green+"Correct!"+ANSI_Reset);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                            System.out.println();
                        break;
                        } else {
                            System.out.println(ANSI_Red+"Wrong!");
                            System.out.println("Answer is: " + total +ANSI_Reset);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                            System.out.println();
                        break;
                        }
                    } else{
                        continue;
                    }
            }
            
        }
    }
}
