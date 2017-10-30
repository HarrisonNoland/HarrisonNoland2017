//*Harrison Noland
 // September 6, 2017
 //This is the runner for the caluclate library it is used to test the methods
public class DoMath {

	public static void main(String[] args) {
		Calculate.square(5);
		System.out.println(Calculate.square(5));
		Calculate.cube(4);
		System.out.println(Calculate.cube(4));
		Calculate.average(4.0,6.0);
		System.out.println(Calculate.average(4.0,6.0));
		Calculate.average(5.0,9.0,120.0);
		System.out.println(Calculate.average(5.0,9.0,120.0));
		Calculate.toDegrees(30);
		System.out.println(Calculate.toDegrees(30));
		Calculate.toRadians(40);
		System.out.println(Calculate.toRadians(40));
		Calculate.discriminant(40.0, 20.0, 8.0);
		System.out.println(Calculate.discriminant(40.0, 20.0, 8.0));
		Calculate.toImproperFrac(4,5,6);
		System.out.println(Calculate.toImproperFrac(4,5,6));
		Calculate.toMixedNum(4,8);
		System.out.println(Calculate.toMixedNum(4,8));
		Calculate.foil(7,8,4,2);
		System.out.println(Calculate.foil(7,8,4,2));
		Calculate.toMixedNum(4,8);
		System.out.println(Calculate.toMixedNum(4,8));
		Calculate.foil(7,8,4,2);
		System.out.println(Calculate.foil(7,8,4,2));
	}

}
