mport java.io.IOException;

public class deletemin {
	 static int heapsize;
	 static int[] arr ={13,14,16,19,21,19,68,65,26,32,31};
	 int[] a;
	 public deletemin(int[] ar) throws IOException
	 {
		 a= new int[ar.length];
		 System.arraycopy(ar, 0,a, 0, ar.length);
		int n=a.length;
		 for(int i=n/2;i>=0;i--)
		 {
			 pd(i);
		 }
		 for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
	 }
	public void removemin() throws Exception
	{
		 heapsize = arr.length;
		if(arr.length==0)
			throw new Exception("Heap is empty");
		
		else
		{
			arr[0]=arr[heapsize-1];
			heapsize--;
			if(heapsize>0)
				pd(0);
		}
		
	}
	void pd(int index)
	{
		int minindex;
		int leftchildindex = getLeftChildIndex(index);
		int rightchildindex = getRightChildIndex(index);
		if(rightchildindex >= heapsize){
			if(leftchildindex >= heapsize)
			return;
			else
				minindex = leftchildindex;
		}
		else
			
		{
			if(arr[leftchildindex] <= arr[rightchildindex])
			
				minindex=leftchildindex;
			else
				minindex = rightchildindex;
			
		}
		if(arr[index]> arr[minindex])
		{
			int tmp = arr[index];
			arr[index] = arr[minindex];
			arr[minindex] = tmp;
			pd(minindex);
		}
	}
	private int getRightChildIndex(int index) {
		// TODO Auto-generated method stub
		
		return (2*index+2);
	}
	private int getLeftChildIndex(int index) {
		// TODO Auto-generated method stub
		return (2*index+1);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		deletemin d = new deletemin(arr);
		d.removemin();
		for(int i=0;i<heapsize;i++)
		System.out.println(arr[i]);

	}

}
