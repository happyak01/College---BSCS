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
        int a, b;
        float total = 0;
        int completedIteration = 0;
        int totalIteration;
        int prev_a=0;
        int prev_b=0;
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
            while (operatr == 0) {
                System.out.println();
                System.out.println("You entered 0, there's no opearator. Enter again");
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

            System.out.println("How many questions you want to solve?");
            totalIteration = scan.nextInt();

        while (completedIteration != totalIteration) {
            switch (operatr) {
                case 1:
                    // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        total = (float) Math.pow(a, b);

                        System.out.println("What is "+ a +" powered by " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println("Correct!");
                            completedIteration++;
                        break;
                        } else {
                            System.out.println("Wrong!");
                            System.out.println("Answer is: " + total);
                            completedIteration++;
                        break;
                        }
                case 2:
                        // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        total = a * b;
                        System.out.println();

                        System.out.println("What is "+ a +" multiplied by " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println("Correct!");
                            completedIteration++;
                        break;
                        } else {
                            System.out.println("Wrong!");
                            System.out.println("Answer is: " + total);
                            completedIteration++;
                        break;
                    }
                case 3:
                    // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        if (a>=b && b!=0 && a%b == 0 && prev_a != a && prev_b != b) {
                            total = (float) a / b;
                        System.out.println();

                        System.out.println("What is "+ a +" divided by " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println("Correct!");
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                        break;
                        } else {
                            System.out.println("Wrong!");
                            System.out.println("Answer is: " + total);
                            completedIteration++;
                            prev_a = a;
                            prev_b = b;
                        break;
                        }
                        } else {
                            continue;
                        }
                        
                case 4:
                    System.out.println("add");
                    // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        total = a + b;
                        System.out.println();

                        System.out.println("What is "+ a +" plus " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println("Correct!");
                            completedIteration++;
                        break;
                        } else {
                            System.out.println("Wrong!");
                            System.out.println("Answer is: " + total);
                            completedIteration++;
                        break;
                        }
                case 5:
                    System.out.println("sub");
                    // Gets an random number between user entered range and mentions in the question
                        a = rand.nextInt((range_two - range_one +1 )+range_one);
                        b = rand.nextInt((range_two - range_one +1 )+range_one);
                        total = a - b;
                        System.out.println();

                        System.out.println("What is "+ a +" minus " + b +" ?");
                        userGuess = scan.nextFloat();
                        // Answer checker
                        if (userGuess == total) {
                            System.out.println("Correct!");
                            completedIteration++;
                        break;
                        } else {
                            System.out.println("Wrong!");
                            System.out.println("Answer is: " + total);
                            completedIteration++;
                        break;
                        }
                case 6:
                    System.out.println("pemdas");
                    break;
            
                default:
                    continue;
            }
            
        }
    }
}
