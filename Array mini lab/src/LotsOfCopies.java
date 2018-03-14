import java.util.Arrays;
public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int [] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
	}

public static void changeMe(int x, String str, int[] arr){
	
	System.out.println("In changeMe, before the change, num (aka x):" +x);
	 x = 4;
	 System.out.println("In changeMe, after the change, num (aka x):"+x);
	 
	 System.out.println("In changeMe, before the change, strMain (aka str):"+str);
	 str = "I like turtles";
	 System.out.println("In changeMe, after the change, strMain (aka str):"+str);
	 
	 System.out.println("In changeMe, before the change, arrMain (aka arr):"+Arrays.toString(arr));
	 arr[0]=12;
	 System.out.println("In changeMe, after the chagne, arrMain (aka arr):"+Arrays.toString(arr));
	 
	 
	 x = 3;
	 int bint = x;
	 x= 23;
	 System.out.println("b:" + bint);
	 
	 
	 str = "hhhhh";
	 String bstr = str;
	 str = "aiiiiii";
	 System.out.println("bstr" + bstr);
	 
	 int[] barr = arr;
	 arr[0] = 200;
	 System.out.println("barr:"+ Arrays.toString(barr));
}

}