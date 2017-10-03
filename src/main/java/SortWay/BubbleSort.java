package SortWay;

public class BubbleSort {

	public static void main(String[] args) {
		int[] BS ={ 49, 38, 65, 97, 76, 13, 27, 49, 78};
		int length = BS.length;
		int temp = 0;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1; j++) {
				if (BS[j] > BS[j + 1]) {
					temp = BS[j];
					BS[j] = BS[j + 1];
					BS[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < BS.length; i++)
			System.out.println(BS[i]);

	}

}
