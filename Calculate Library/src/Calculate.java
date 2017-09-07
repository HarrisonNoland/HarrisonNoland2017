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
	 public static double discriminant(double operand,double ,double operand) {
		double discriminant = (integer1*integer)-(4*integer*integer);
		return discriminant;
	 }
	 
}