package StringOps;


public class StringToNum {

	public static void main(String[] args) {
		
		int i=0;
		String str = i+""; //int to string
		int j = Integer.valueOf(str);//string to int
		int h = Integer.parseInt(str);
	}
	
	public int stringtoNUm(String str) {
		if(str!=null && !str.equals("")){
			return Integer.valueOf(str);
		}
		return 0;
	}

}
