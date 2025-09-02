 //import java.lang.*;
public class calculator{

    public int add( int a , int b , int c , int d){
        int addResult = a+b+c+d;
        return addResult;
    };
    public int minus( int a , int b , int c , int d){
        int minusResult = a-b-c-d;
         return minusResult; 
    };
     public int multi( int a , int b , int c , int d){
        int multiResult = a*b*c*d;
         return multiResult; 
    };
     public float divide( float a , float b){
        float divideResult = a/b;
         return divideResult; 
    };
     public int modulus(int a, int b) {
    return a % b;
    };
    public double power(double base, double exponent) {
    return Math.pow(base, exponent);
    };
    public double squareRoot(double number) {
    return Math.sqrt(number);
    };
    public int factorial(int num) {
    int fact = 1;
    for(int i = 1; i <= num; i++) {
        fact *= i;
    }
    return fact;
    };
    public float percentage(float total, float obtained) {
    return (obtained / total) * 100;
    };
    public double sin(double angleDegrees) {
    return Math.sin(Math.toRadians(angleDegrees));
    };

    public double cos(double angleinDegrees) {
    return Math.cos(Math.toRadians(angleinDegrees));
    };
    public double tan(double angleDegrees) {
    return Math.tan(Math.toRadians(angleDegrees));
    };
    public int IfElse(int g , int y){
    if(g>y){
   return g;
}
else{
    return y;
}
    }

    
    





     public static void main(String[] args){
        calculator i = new calculator();
        System.out.println("Addition: " +i.add(2, 1, 4, 2));
        System.out.println("Subtract: " +i.minus(2, 1, 4, 2));
        System.out.println("Multiply: " +i.multi(2, 1, 4, 2));
        System.out.println("Divide: " +i.divide(4, 1));
        System.out.println("Power: " + i.power(2, 3)); 
        System.out.println("Factorial: " + i.factorial(5));
        System.out.println("Percentage: " + i.percentage(500, 435));
        System.out.println("SquareRoot: " +i.squareRoot(2));
        System.out.println("Modulus: " +i.modulus(2 , 5));
        System.out.println("tan(angle): " + i.tan(45));
        System.out.println("sin(angle): " + i.sin(60));
        System.out.println("cos(angle): " + i.cos(0));
        
        System.out.println("The number is: "+i.IfElse( 20 , 30));
      //  int max2 = utility.findMax(100, 200);
        
     }
}