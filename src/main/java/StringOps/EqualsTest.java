package StringOps;

public class EqualsTest {

	public static void main(String[] args) {
		
		equalsTest();

	}
	
	public static void equalsTest() {
		int num1=1;
		Integer num2 =1;
		
		if(num2.equals(num1)){
			System.out.println("num2 equals num1");
		}
		
		String num3Str="1";
		System.out.println(num2.equals(num3Str));
		System.out.println(num3Str.equals(num2+""));

	}

}
