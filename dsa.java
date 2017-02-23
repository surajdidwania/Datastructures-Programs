import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dsa {
	    public static List<List<Integer>> nextPermutation(int[] nums) {
	        List<List<Integer>> l = new ArrayList();
	        for(int j=0;j<nums.length;j++)
	        {
	        combinations(l,new ArrayList<Integer>(),nums,0,nums.length,j);
	        }
	        return l;
	    }
	    public static void combinations(List<List<Integer>> l, List<Integer> cur, int[] nums, int start, int k, int j)
	    {
	        if(k==0)
	        {
	            l.add(new ArrayList(cur));
	            return;
	        }
	        for(int i=start;i<nums.length;i++)
	        {
	            cur.add(nums[i]);
	            combinations(l,cur,nums,i+1,k-1,j);
	            cur.remove(cur.size()-1);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={1,2,3,4};
		System.out.println(nextPermutation(arr));

	}

}
