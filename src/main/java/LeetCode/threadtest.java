package LeetCode;

public class threadtest extends Thread{

	public static void main(String[] args) {
		threadtest t1 = new threadtest("a");
		threadtest T2 = new threadtest("B");
		    t1.start();
		    T2.start();
			}
	
		private String name;
		public  threadtest(String name){
			this.name=name;
		}
		public void run(){
			for(int i=0;i<5;i++){
				 System.out.println(name + "运行  :  " + i);  
			}
			try {
				sleep((int) Math.random() * 10);  
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}