import java.util.ArrayList;
import java.util.Scanner;

public class rotatearray {
	
public void rotate(int[] nums, int k) {
        /*int n = nums.length-k;
        int[] num= new int[nums.length];
        for(int i=0;i<n;i++)
        {
        	num[i+k]=nums[i];
        }
        int j=0;
        for(int i=n;i<nums.length;i++)
        {
        	num[j]=nums[i]; j++;
        }
        for(int i=0;i<num.length;i++)
        {
        	System.out.print(num[i]+ " ");
        }*/
		if(nums==null || nums.length<2)
		{
			return;
		}
		k = k% nums.length;
	reverse(nums,0,nums.length-k-1);
	reverse(nums,nums.length-k,nums.length-1);
	reverse(nums,0,nums.length-1);
	for(int i=0;i<nums.length;i++)
	{
		System.out.print(nums[i]);
	}
	
    }
	public void reverse(int[] nums,int start, int end)
	{
		int tmp=0;
		while(start<end)
		{
			tmp = nums[end];
			nums[end]=nums[start];
			nums[start]=tmp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] list = new int[4];
		int n;
		System.out.println("Enter the array");
		for(int i=0;i<4;i++)
		{
			 n=sc.nextInt();
			list[i]=n;
		}
		System.out.println("Enter");
		int k = sc.nextInt();
		rotatearray ra = new rotatearray();
		ra.rotate(list, k);
		
	}

}
