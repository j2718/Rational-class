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
  public Rational add(Rational other) {
    int newNum;
    int newDen;
    
    
    newNum=numerator*other.getDenominator()+other.getNumerator()*denominator;
    
    newDen=denominator*other.getDenominator();
    
    Rational frac3=new Rational(newNum, newDen);
    return frac3.getRational();
  }
    
  public Rational subtract(Rational other) {
    int newnumerator=numerator*other.getDenominator()-other.getNumerator()*denominator;
    int newdenominator=denominator*other.getDenominator();
    
    
    Rational frac3=new Rational(newnumerator, newdenominator);
    return frac3.getRational();
  }
    
  public Rational multiply(Rational other) {  
    int newNumerator=numerator*other.getNumerator();
    int newDenominator=denominator*other.getDenominator();
    
    Rational frac3=new Rational(newNumerator, newDenominator);
    return frac3.getRational(); 
    
  }
  public Rational divide(Rational other){
    Rational reciprocal=new Rational(other.getDenominator(), other.getNumerator());
    return multiply(reciprocal);
    

  }
}