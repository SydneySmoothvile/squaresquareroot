package SquareSquareRoot;
public class SquareSquareRoot {
    public static void main(String[] args) {
      
        double testNumber = 30;
        double testNumberSquareRoot = findSquareRoot(testNumber);
        System.out.println(testNumber+" Sq.Root is " +testNumberSquareRoot);
        double testNumberSquare = squareMe((float) testNumber);
        System.out.println(testNumberSquare);
        
        
    }
    public static double squareMe(float numberX){
        double numberSquared = Math.pow( numberX, 2);
        return numberSquared;
    }
    public static double findSquareRoot(double number){
        double numberSquareRoot;
        numberSquareRoot = Math.sqrt(number);
        return numberSquareRoot;//return Math.sqrt(number)
          }
}