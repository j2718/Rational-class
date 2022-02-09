import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter your name here and then push to GitHub");
    Scanner scanner=new Scanner(System.in);
    System.out.println("Give me a numerator");
    int numerator=scanner.nextInt();
    System.out.println("Give me a denominator");
    int denominator=scanner.nextInt();
    Rational frac1=new Rational(numerator, denominator);
    System.out.print(numerator+"/"+denominator+" equals ");
    System.out.println(frac1.getDecimal());
    System.out.println("and reduces to ");
    System.out.println(frac1.getRational());
    
  
  }
  


}