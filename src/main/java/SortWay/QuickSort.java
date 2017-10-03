package SortWay;

public class QuickSort{

     public static void main(String []args){
        int[] a =  { 33, 11, 77, 22, 55 };
        int low = 0;
        int high = a.length-1;
        sort(a,low,high);
        for(int i = 0; i<a.length; i++){
             System.out.print(a[i]+" ");
         }
        
     }
     
     public static void sort(int[] a,int low,int high){
         int i = low;
         int j = high;
         int index = a[low];
         
         while(j>i){
             //从后往前比较
             while(j>i&&a[j]>=index)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                 j--;
             if(a[j]<=index){
                 int temp = a[j];
                 a[j] = a[i];
                 a[i] = temp;
             }
             //从前往后比较
             while(j>i&&a[i]<=index)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                i++;
             if(a[i]>=index){
                 int temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
         }
         //递归
         if(i>low) sort(a,low,i-1);//左边序列。第一个索引位置到关键值索引-1
         if(j<high) sort(a,j+1,high);//右边序列。从关键值索引+1到最后一个
     }
}