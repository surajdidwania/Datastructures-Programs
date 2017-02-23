
public class ZIgZagConversion {
	public static String convert(String s, int numRows) {
		int len = s.length();
		char[]  c = s.toCharArray();
		StringBuffer[] str = new StringBuffer[numRows];
				int i=0;
		while(i<len)
		{
			for(int idx=0;i<len && idx<numRows;idx++)
			{
				str[idx].append(c[i++]);
			}
			for(int idx = numRows-2;idx>=1&&i<len;idx--)
			{
				str[idx].append(c[i++]);
			}
		}
		for(int j = 1;j<numRows;j++)
		{
			str[0].append(str[j]);
		}
		return str[0].toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PAYPALISHIRING";
		int rows = 3;
		String str1 = convert(str,rows);
		System.out.println(str1;);
	}

}
