public class Practice2_Calculator
{
    public static void main(String[] args)
    {
        double a = 1.24;
        double b = 12;
        String arithmetic_choice = "-";




        if (arithmetic_choice == "+")
        {
            //System.out.println("Plus");
            System.out.println(a+b);
        }
        else if(arithmetic_choice == "-")
        {
            //System.out.println("Minus");
            System.out.println(a-b);
        }
        else if(arithmetic_choice == "*")
        {
            System.out.println(a*b);
        }
        else if (arithmetic_choice == "/")
        {
            System.out.println(a/b);
        }
        else
        {
            System.out.println("Error, no arithmetic set");
        }
        //System.out.println(arithmetic_choice);
    }
}