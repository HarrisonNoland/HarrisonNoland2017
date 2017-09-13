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
	 //Discriminant provides coefficients of a quadratic equation
	 public static double discriminant(double integer1,double integer2 ,double integer3) {
		double discriminant = (integer2*integer2)-(4*integer1*integer3);
		return discriminant;
		}
<<<<<<< HEAD
	 //toImproperFrac converts a mixed number into an improper fraction
	 public static String toImproperFrac(int a,int b,int c) {
		 int  = Wholenumber*Denominator+Numerator;
		 return "/"+Denominator);
	 }
	 //toMixedNum converts an improper fraction into a mixed number
=======
	 public static String toImproperFrac(int Wholenumber,int Numerator,int Denominator) {
		 int  = Wholenumber*Denominator+Numerator;
		 return "/"+Denominator);
	 }
>>>>>>> origin/master
	public static String toMixedNum(int Numerator, int Denominator) {
		int wholenumber = Numerator/Denominator;
		int nnumerator = Numerator%Denominator;
		return (wholenumber+"_"+nnumerator+"/"+Denominator);
}
<<<<<<< HEAD
	//foil converts a binomial multiplication into a quadratic equation
	public static String foil(int a, int b, int c, int d) {
		int first = a*c;
		int second = (a*d)+(b*c);
		int third = c*d;
		return (first+"x^2"+"+"+second+"x"+"+"+third);
	}
	//isDivisibleBy determines whether or not one integer is evenly divisible by another
=======
	public static String foil(int a, int b, int c, int d) {
		int first + a*c;
		int second (a*d)+(b*c);
		int third c*d;
		return (first+"x^2"+"+"+second+"x"+"+"+third);
	}
>>>>>>> origin/master
		public static boolean isDivisibleBy(int a, int b) {
			if(a % b == 0){
				return true;
			}else{
				return false;
			}
		}
<<<<<<< HEAD
		//absValue returns the absolute value of the number passed
		public static double absValue(double a){
=======
		public static double absvalue(double a){
>>>>>>> origin/master
			double x = a - 0;
			if(x > 0){
				return x;
			}else{ 
				return 0 - a;
			}
		}
<<<<<<< HEAD
		//max returns the larger of the values passed
=======
>>>>>>> origin/master
		public static double max(double a, double b){
			if(a > b){
				return a;
			}else{
				return b;
			}
		}
<<<<<<< HEAD
		//max overload the max method
=======
>>>>>>> origin/master
		public static double max(double a, double b, double c){
			if (a > b && a > c){
				return a;
			}
			if(b > a && b > c){
				return b;
			}
			if(c > a && c > b){
				return c;
			}
			return(2.4);
		}
<<<<<<< HEAD
		//min returns the smaller value passed
=======
>>>>>>> origin/master
		public static int min(int a, int b){
			if(a < b){
				return a;
			}
			if(b < a){
				return b;
			}
			return(2);
		}
<<<<<<< HEAD
		//round2 rounds a double correctly to 2 decimal places
=======
>>>>>>> origin/master
		public static double round2(double a){
			a = a * 100;
			a += .5;
			return(a / 100);
			}
<<<<<<< HEAD
		}
=======
		}
>>>>>>> origin/master
