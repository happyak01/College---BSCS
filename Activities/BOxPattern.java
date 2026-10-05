import java.util.Scanner;

public class BOxPattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What size do you want? ");
        int size = scan.nextInt();

        for(int column=0; column<size; column++){
            for(int row=0; row<size; row++){
                if (column==0 || row==0 || row== size-1|| column==row || (row+column+1)==size|| column==size-1) {
                    System.out.print("\u001B[31m" + "* "+ "\u001B[0m");
                }else{
                    System.out.print("  ");
                }
                
            }
             System.out.println();
        }
    }
}
