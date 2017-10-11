package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongCommonPrefix {

	public static void main(String[] args) {
//		String strs[] = {"abcd","abcd","abcdf"};
//        longestCommonPrefix(strs);
		
		  String[] s = new String[]{"abcfg","abef","abdgg"};
	        System.out.print("字符串数组为:");
	        for(String ss : s){
	            System.out.print(ss+",");
	        }
	        System.out.println();
	        //首先找出长度最小的字符串
	        String minStr = s[0];
	        for(int i = 0; i < s.length; i++){
	            if(minStr.length() > s[i].length()){
	                minStr = s[i];
	            }
	        }
	        System.out.println("长度最小的字符串:"+minStr);
	        String result = "";
	        //循环长度最小字符串的每个字符,如果每个字符串都包含了这个字符,那么结果就加上它
	        for(int i = 0; i < minStr.length(); i++){
	            char ch = minStr.charAt(i);
	            boolean b = true;
	            //循环数组,判断每个字符串是否包含ch这个字符
	            for(int j = 0; j < s.length; j++){
	                if(s[j].charAt(i) == ch){
	                     
	                }else{
	                    b = false;
	                }
	            }
	            //都包含,结果加上该字符
	            if(b){
	                result += ch;
	            }
	        }
	        System.out.println("公共字符串:"+result);
	}
	
	

public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);             
        }
    }
    return strs[0];
}

	
//	 public static String longestCommonPrefix(String[] strs) {
//		 if (strs == null || strs.length == 0) return "";
//		 
//	      List<String> strsList = new ArrayList<String>(Arrays.asList(strs));  
//	      //System.out.println(strsList.getClass());
//		  int length = strsList.size();
//	      //System.out.println(strsList.get(0));
//		  for(int i=0;i<length;i++)
//		  {
////			  for(int j=0;j<strsList.get(i).length();j++){
////				  System.out.print(strsList.get(i).charAt(j));
////			  }
////			  System.out.println();
//			  System.out.print(strsList.get(i).charAt(0));
//		  }
//		  
//		  return "test";
//	 }


}
