package StringOps;

import java.awt.Window.Type;
import java.util.*;

public class test {
	public static void main(String[] args) {
//		List list = new ArrayList();
//		ArrayList arrayList = new ArrayList();
//		//list.trimToSize(); // 错误，没有该方法。
//		arrayList.trimToSize(); // ArrayList里有该方法。	  
		
	    String s ="1234";
	    int n = Integer.valueOf(s);
	    
	    String s2 ="1234";
	    int n2= Integer.parseInt(s2);
	    
	    int m =1234;
	    String s3=Integer.toString(m);
	    String s4=String.valueOf(m);
	}
}






//问题的关键: 
//为什么要用 List list = new ArrayList() ,而不用 ArrayList alist = new ArrayList()呢？ 
//问题就在于List有多个实现类，现在你用的是ArrayList，也许哪一天你需要换成其它的实现类，如 LinkedList或者Vector等等，这时你只要改变这一行就行了： 
//List list = new LinkedList(); 其它使用了list地方的代码根本不需要改动。 
//假设你开始用 ArrayList alist = new ArrayList(), 这下你有的改了，特别是如果你使用了 ArrayList特有的方法和属性。