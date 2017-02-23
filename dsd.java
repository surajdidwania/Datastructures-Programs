
public class dsd {
	public static void main(String args[])
	{
		int count=0;
		String s = "ABba";
		int i=0; int len = s.length();
		while(i<len-1 && !s.isEmpty())
		{
			if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90 && (int)s.charAt(i+1) >=65 && (int)s.charAt(i+1)<=90)
				{
				count++;
				}
			 if((int)s.charAt(i+1)- (int)s.charAt(i)==32)
			{
					count++;
					s=s.replace(String.valueOf(s.charAt(i)), "");
					s=s.replace(String.valueOf(s.charAt(i)), "");
					if(i!=0) {i--; continue;}
			}
			i++;
		}
		System.out.println(count);
	}
}
