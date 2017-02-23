import java.util.*;
import java.util.Scanner;

public class Mergesort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Please input the values");
		for(int i=0;i<10;i++)
		{
			a[i]= sc.nextInt();
		}
		Arrays.toString(a);
		mergesort(a);
		System.out.println(Arrays.toString(a));
	}
		public static void mergesort(int[] array)
		{
			if(array.length > 1)
			{
				int[] left = lefthalf(array);
				int[] right = righthalf(array);
				mergesort(left);
				mergesort(right);
				merge(array,left,right);
			}
		}
		public static int[] lefthalf(int array[])
		{
			int size1= array.length/2;
			int[] left = new int[size1];
			for(int i=0;i<size1;i++)
			{
				left[i] = array[i];
			}
			return left;
		}
		public static int[] righthalf(int array[])
		{
			int size1 = array.length/2;
			int size2 = array.length-size1;
			int[] right = new int[size2];
			for(int i=0;i<size2;i++)
			{
				right[i]=array[i+size1];
			}
				return right;
		}
		public static void merge(int[] result, int[] left , int[] right)
		{
			int i1=0;
			int i2=0;
			for(int i=0;i<result.length;i++)
			{
				if(i2>=right.length || (i1<left.length && left[i1] <= right[i2]))
				{
					result[i] = left[i1];
					i1++;
				}
				else 
				{
					result[i]= right[i2];
					i2++;
				}
			}
			
		}
}
