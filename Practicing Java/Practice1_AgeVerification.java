public class Practice1_AgeVerification{
  public static void main(String[] args){
  String name = "Theo Chunaco";
  int day, month, year;
  String birthday = "";
  day = 15;
  month = 12;
  year = 2026;
  int age = 2026 - year;
  birthday = month + "/" + day + "/" + year;
  System.out.println("Hello! " + name + " " + birthday);
  if(age >= 18 && !(age>=50)){
    System.out.println("Welcome!");
  }
  else if(age <= 17){
    System.out.println("Access Denied. You are not eligible enough to enter.");
  }
  else if(age>=60){
  System.out.println("Nice try faking your age.");
  }
  
  }
}