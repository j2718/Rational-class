import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the 1st numerator");
    int numerator1=scanner.nextInt();
    System.out.println("Enter the 1st denominator");
    int denominator1=scanner.nextInt();
    Rational frac1=new Rational(numerator1, denominator1);
    System.out.println("Enter the 2nd numerator");
    int numerator2=scanner.nextInt();
    System.out.println("Enter the 2nd denominator");
    int denominator2=scanner.nextInt();
    Rational frac2=new Rational(numerator2, denominator2);
    System.out.print(frac1+" * "+frac2);
    System.out.print(" = ");
    System.out.println(frac1.multiply(frac2));
    System.out.print(frac1+" / "+frac2);
    System.out.print(" = ");
    System.out.println(frac1.divide(frac2));
    System.out.print(frac1+" + "+frac2);
    System.out.print(" = ");
    System.out.println(frac1.add(frac2));
    System.out.print(frac1+" - "+frac2);
    System.out.print(" = ");
    System.out.println(frac1.subtract(frac2));
  
  }
  


}