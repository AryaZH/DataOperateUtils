package StringOps;

public class StringInput {

	public static void main(String[] args) {
		
		StringInput stringInput = new StringInput();
		stringInput.arrayTest();
	}
	
	public void arrayTest() {
		int[][] data1 = new int[][]{{1,2},{2},{5,9}};
		System.out.println(data1.length);
		Object[][] data2 = new Integer[][]{{1,2},{3,4}};
		System.out.println(data2.length);
		Integer[][] data3=new Integer[][]{{1,2,3},{4,5}};
		System.out.println(data3.length);
		System.out.println(data3[0][2]);
		
		for(int i=0,max=data3.length;i<max;i++){
			for(int j=0,max2=data3[i].length;j<max2;j++)
			{
				System.out.print(data3[i][j]);
			}
			System.out.println();
		}
		
		Integer[][] data4= new Integer[5][5];
		
		int t=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				data4[i][j]=t++;
			}
		}
		
		for(Integer[] row: data4)
		{
			for(Integer data: row)
			{
				System.out.print(data+"\t");
			}
			System.out.println();
		}
			
	}

}
