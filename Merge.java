import java.util.*;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int p=0;
		int r=a.length-1;
		mergesort(a,p,r);
		System.out.println("The given Input is" +Arrays.toString(a));
		sc.close();
	}
	public static void mergesort(int[] a, int p, int r)
	{
		if(r>p)
		{
			int q=(p+r)/2;
			mergesort(a,p,q);
			mergesort(a,q+1,r);
			merge(a,p,q,r);
		}
	}
	public static void merge(int a[], int p, int q, int r)
	{
		int n1 = q-p+1;
		int n2= r-q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i=0;i<n1;i++)
		{
			L[i] = a[p+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=a[q+j];
		}
		//L[n1+1]=-1;
		//R[n2+1]=-1;
		int i=1,j=1;
		for(int k=p;k<=r;k++)
		{
			if(L[i] < R[j])
			{
				a[k]= L[i];
				i++;
			}else
			{
				a[k]= R[j];
				j++;
			}
		}
	}
}
