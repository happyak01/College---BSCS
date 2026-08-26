import java.util.Scanner;

public class LabActivity3_StudentInfo_CHUNACO {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Enter your grade: ");
        float grade = scan.nextFloat();
        System.out.println("Enter your hobbies: ");
        String hobbies = scan.next();

        System.out.println();
        System.out.println("----- STUDENT INFORMATION -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Hobbies: " + hobbies);
    }
    
}
