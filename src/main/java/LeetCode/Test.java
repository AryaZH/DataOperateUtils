package LeetCode;

public class Test {

	public static void main(String[] args) {
		int x = 313;
		//System.out.println(reverse(x));
		System.out.println(isPalindrome(x));
		
	}
	

public static boolean isPalindrome(int x){
	//handle negative integers
	if(x<0)
	return false;
	//get the divisor for x
	int div = 1;
	while(x/div >= 10)
	div = div*10;

	    //check first and last digits if they are same
	    while(x > 0){
	        if(x%10 != x/div)
	            return false;
	        
	        x = (x%div)/10;
	        div = div/100;
	    }      
	    return true;
	}

	
	public static int reverse(int x){
		int negative = 1;  
        
        if(x <= Integer.MIN_VALUE)  
            return 0;  
        if(x < 0)  
        {  
            x = -x;  
            negative = -1;  
        }  
          
        long y = x % 10;  
          
        while(x / 10 != 0)  
        {  
            x /= 10;  
            y *= 10;  
            y += x %10;  
        }  
          
        if(y > Integer.MAX_VALUE)  
            return 0;  
        else  
            return (int)y * negative; 
	}

/*public static int reverse(int x) {
		char[] source = String.valueOf(x).toCharArray();
		int length = source.length;
		char[] target = new char[length];
		if (x >= 0) 
		{
			for (int i = length - 1; i >= 0; i--)
			{
				target[length - 1 - i] = source[i];
			}
		}
		else{
			for (int i = length - 1; i > 0; i--)
			{
				target[length - i] = source[i];
			}	
			target[0]=source[0];		
		}
		String IntTarget = new String(target);
		long result = Integer.parseInt(IntTarget);
        
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
			return 0;
		}
		else	
		return (int)result;
	}*/

}
