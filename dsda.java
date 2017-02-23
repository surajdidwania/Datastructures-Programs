// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class dsda {
	static List<String> lt = new ArrayList<String>();
    public static String solution(int A, int B, int C, int D) {
        // write your code in Java SE 8
        int[] arr = new int[4];
        
        List<Integer> com= new ArrayList<Integer>();
        int k=0;
        arr[0]=A;
        arr[1]=B;
        arr[2]=C;
        arr[3]=D;
        String hh = "";
        String mm= "";
        Arrays.sort(arr);
        permutation(arr,4,4);
        int max= lt.get(0).charAt(0);
        for(int i=0;i<lt.size();i++)
        {
        	for(int j=0;j<lt.get(i).length();j++)
        	{
        		if(lt.get(i).charAt(0) > max && lt.get(i).charAt(0)<=2)
        		{
        		max = lt.get(i).charAt(0);
        		k = i;
        		}
        		if (max==2)
        		{
        		if(lt.get(i).charAt(1)<=3)
        		{
        			
        		}
        		}
        		if(lt.get(i).charAt(2)<=5)
        		{
        			
        		}
        	}
        }
        return (hh + ":" + mm);
    }
    public static void permutation(int[] a, int size, int n)
    {
        if(size==1)
           lt.add(Arrays.toString(a));
        for (int i=0; i<size; i++)
		{
		   permutation(a,size-1,n);
		   if (size % 2 == 1)
			{
				int temp = a[0];
				a[0] = a[size-1];
				a[size-1] = temp;
			}
			else
			{
				int temp = a[i];
				a[i] = a[size-1];
			    a[size-1] = temp;	
			}
		}
        
    }
   
	public static void main(String args[])
    {
    	solution(1,8,3,2);
    }
}