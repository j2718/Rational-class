public class Rational{
  private int numerator;
  private int denominator;
  public Rational(int num, int den){
    numerator=num;
    denominator=den;
  }
  public static int getGCF(int num1, int num2){
    int gcf=1;
    for(int i=1; i<=num1 && i<=num2; i++){
      if(num1 % i==0 && num2 % i ==0){
        gcf=i;
      }
    }
    return gcf;
  }
  public Rational getRational(){
    int gcf=getGCF(numerator, denominator);
    int reducedNum=(int)numerator/gcf;
    int reducedDen=(int)denominator/gcf;
    Rational frac=new Rational(reducedNum, reducedDen);
    return frac;
  }
  public double getDecimal(){
    return (double)numerator/(double)denominator;
  }
  
  public int getNumerator() {
    return numerator;
  }
    
  public int getDenominator() {
    return denominator;
  }
    
  public void setNumerator(int x) {
    numerator=x;
  }
    
    
  public void setDenominator(int x) {
    denominator=x;
  }
  public String toString() {
    return numerator+" / "+denominator;
  }
}