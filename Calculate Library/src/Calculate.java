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
		public static int factorial(int a){
			int answer = 1;
			if(a ==0){
				return(1);
			}
			for(int i = 1; i <= a; i++){
				answer *=i;
			}
			return answer;
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
			int pdf = 1;
			for(int i=1;i<=a;i++){
				if(isDivisibleBy(a,i)) && isDivisibleBy(b, i)){
					pdf = 1;
				}
			}
			return(pdf);
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
