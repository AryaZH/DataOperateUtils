package LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  
/** 
 * Created with IntelliJ IDEA. 
 * User: Donkey 
 * Date: 13-11-24 
 * Time: 上午10:44 
 * 用于将String类型的数组转变为ArrayList 
 */  
public class StringsToArrayList {  
    public static void main(String[] args){  
        StringsToArrayList.test1();  
        StringsToArrayList.test2();  
        StringsToArrayList.test3();  
        

    }  
  
    public static void test1(){  
        String[] words = {"ace", "boom", "crew", "dog", "eon"};  
  
        List<String> wordList = Arrays.asList(words);  
        //wordList.add("1");  
        for (String e : wordList){  
            System.out.print(e);  
            
        }  
        System.out.println();
    }  
  
    public static void test2(){  
        String[] words = {"ace", "boom", "crew", "dog", "eon"};  
  
        List<String> wordList = new ArrayList<String>(Arrays.asList(words));  
        wordList.add("1");  
        for (String e : wordList){  
            System.out.print(e);  
        }  
        System.out.println();
    }  
  
    public static void test3(){  
        String[] words = {"ace", "boom", "crew", "dog", "eon"};  
  
        List<String> wordList = new ArrayList<String>(words.length);  
  
        for (String e : words){  
            wordList.add(e);  
        }  
        wordList.add("2");  
        for (String e : wordList){  
            System.out.print(e);  
        }  
        
        System.out.println();
    }  
}