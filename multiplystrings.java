import java.util.Scanner;

public class multiplystrings {
	public void multiply(String num1, String num2) {
	int len1 = num1.length();
    int len2 = num2.length();
   int[] num = new int[len1+len2];
    int formno = 0;
    for(int i=len1-1;i>=0;i--)
    {
    for(int k=len2-1;k>=0;k--)
	{
    	int index = len1+len2-i-k-2;
           num[index]+=(num1.charAt(i)-'0') *(num2.charAt(k)-'0');
           num[index+1]+=num[index]/10;
           num[index]%=10;
     }
    }
    StringBuilder stringbuilder = new StringBuilder();
    for (int j = num.length - 1; j > 0; j--) {
    	if (stringbuilder.length() == 0 && num[j] == 0) continue;
    	stringbuilder.append(num[j]);
    }
    stringbuilder.append(num[0]);
    System.out.println(stringbuilder.toString());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplystrings ms = new multiplystrings();
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		ms.multiply(num1,num2);
	}

}
