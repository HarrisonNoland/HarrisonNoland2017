//Harrison Noland
 //September 6, 2017
 //Self written math library
public class Calculate {
	//square of a number
    public static int square(int operand) {
        int square = operand*operand;
        return square;
    }
    //cube of a number
    public static int cube(int operand) {
        int cube = operand*operand*operand;
        return cube;
    }
    //find average of two numbers
    public static double average(double operand, double operand1) {
        double average = (operand+operand1)/2;
        return average;
    }
    //find average of three numbers
    public static double average(double operand, double operand1, double operand2) {
        double average = (operand+operand1+operand2)/3;
        return average;
    }
    //convert radians to degrees
    public static double toDegrees(double operand) {
        double toDegrees = operand*(180/3.14159);
        return toDegrees;
    }
    //convert degrees to radians
    public static double toRadians(double operand) {
        double toRadians = operand/(180*3.14159);
        return toRadians;
    }
    public static double discriminant(double integer1,double integer2 ,double integer3) {
        double discriminant = (integer2*integer2)-(4*integer1*integer3);
        return discriminant;
    }
    public static String toImproperFrac(int a,int b,int c) {
        int x= c*a;
        int y= x+b;
        String ab = y +"/" + c;
        return ab;
    }
    public static String toMixedNum(int Numerator, int Denominator) {
        int wholenumber = Numerator/Denominator;
        int nnumerator = Numerator%Denominator;
        return (wholenumber+"_"+nnumerator+"/"+Denominator);
    }
    public static String foil(int a, int b, int c, int d) {
        int first = a*c;
        int second = (a*d)+(b*c);
        int third = c*d;
        return (first+"x^2"+"+"+second+"x"+"+"+third);
    }
    //part two
    //this method gives fractions that contain integers a value of true or false
    public static boolean isDivisibleBy(int a, int b){
        if(a % b == 0){
            return true;
        }
        if (b==0){ throw new IllegalArgumentException("You cannot divide by zero");
        } else {
            return false;
        }
    }
    // absValue this method calculates the absolute value of a double
    public static double absvalue(double x) {
        if (x >= 0) {
            return x;
        } else {
            return (x *= -1);
        }
    }
    public static int max(int small, int big){
        if(small > big){
            return small;
        }else{
            return big;
        }
    }
    public static double max(double x, double y, double z){
        if(x > y && x > z){
            return x;
        }else if(y > x && y > z){
            return y;
        }else {
            return z;
        }
    }
    public static int min(int x, int y){
        if(x > y) {
            return y;
        }else {
            return x;
        }
    }

    public static double round2(double orig) {



        int tempInt = (int) (orig * 1000);
        int num = temInt % 10;
        tempInt = tempInt / 10;
        if (num >= 5 && tempInt > 0) {
            tempInt++;
        } else if {
            (num <= -5 && tempInt < 0)
            tempInt--;
            result = tempInt / 100.0;
            return result;
        }
    }
    public static double exponent(double a, int b){
        double answer = 1.0;
        if(a == 0){
            return(1);
        }
        for(int i = 1; i<= a; i++){
            answer *= b;
        }
        return(answer);
    }
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number can't be found");
        }
        int result = 1;
        if (n == 0) {
            result = 1;
        }
        while(n > 0) {
            result = n * result;
            n--;
        }
        return result;
    }
    public static boolean isPrime(int num){
        boolean test;
        for(int i = num - 1; i > 1; i--){
            test = Calculate.isDivisibleBy(num, i);
            if(test == true){
                return(false);
            }
        }
        return(true);
    }
    public static int gcf(int a, int b){
        int gfc = 1;
        for (int i=1; i <= a; i++){
            if (isDivisibleBy(a,i) && isDivisibleBy(b, i)){
                gfc =i;
            }
        }
        return(gfc);

    }

    public static double sqrt(double operand){
        for(double i= 0.1; i<= operand; i+= 0.1){
            double multiply = i * i;
            if(Calculate.absValue(multiply - operand) <=0.1){
                return Calculate.round2(i);
            }
        }
        return(2.0);
    }

}
}
