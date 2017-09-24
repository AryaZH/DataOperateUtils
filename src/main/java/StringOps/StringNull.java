package StringOps;

public class StringNull {

	public static void main(String[] args) {
		String str1="test";
		String str2 ="TEST";
		String str3=null;
		
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1==str2.toLowerCase());
		
		if(str2!=null &&str2.trim().equals(str1)){
			System.out.println("str2 equals str1");
		}
		
		if("".equals(str3))
		{
			System.out.println("str3 is blank");
		}
	}

}
