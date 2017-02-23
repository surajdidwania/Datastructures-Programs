import java.math.MathContext;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class NextPermutation {
	static int[] nums = new int[100];
	static int[] num = new int[Factorial(nums.length)];
	static int j=0;
	static Stack<Integer> stack = new Stack<Integer>();
	public void nextPermutation(int[] nums)
	{
		nextpermutation(nums,0,nums.length-1);
	}
	public void nextpermutation(int[] nums,int l, int r)
	{
		
		if(l==r)
		{
			for(int k=nums.length-1;k>=0;k--)
			{
			num[j]+= nums[nums.length-1-k]*(10^k);
			}
			j++;
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				int temp;
				temp = nums[i];
				nums[i]=nums[l];
				nums[l]=temp;
				nextpermutation(nums,l+1,r);
				temp = nums[i];
				nums[i]=nums[l];
				nums[l]=temp;
				
			}
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		 
		for(int i=0;i<;i++)
		{
			nums[i]= sc.nextInt();
		}
		NextPermutation np = new NextPermutation();
		np.nextPermutation(nums); 
		Arrays.sort(nums);
		int max = num[0];
		for(int i=1;i<num.length;i++){
			if(num[i]>max) max = num[i]; break;
		}
		if(max == num[0]){ 
			Arrays.sort(nums);
			System.out.println(nums[0] + " " +nums[1] + " "+nums[2]);
		}
		else
		{
			ordercheck(max);
		}
	}
	public static int Factorial(int n)
	{
		int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       return result;
	}
		public static void ordercheck(int max)
		{
			while(max>0)
			{
				stack.push(max%10);
				max = max/10;
			}
			while(!stack.isEmpty())
			{
				System.out.print(stack.pop() + " ");
			}
		}
}
