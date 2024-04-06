package codeAcademyJava.Project;

public class Calculator{
    int result;

    // This program adds, subtracts, multiplies, divides, and operates the modulo operations just like a calculator.

    public Calculator(){
    }
    public int add(int a, int b){
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b){
        int result = a - b;
        return result;
    }
    public int multiply(int a, int b){
        int result = a * b;
        return result;
    }
    public double divide(int a, double b){
        double result = a / b;
        return result;
    }
    public int modulo(int a, int b){
        int modulo = a % b;
        return result;
    }
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));

        int subtractedResult = myCalculator.subtract(45, 11);
        System.out.println(subtractedResult);

        double dividedResult = myCalculator.divide(10, 20);
        System.out.println(dividedResult);
    }
}