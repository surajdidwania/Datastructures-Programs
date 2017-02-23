
public class wordbreakGFG {
	public static boolean containsword(String words)
	{
		String[] str = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", 
				  "cream", "icecream", "man", "go", "mango"};
		int len1 = str.length;
		for(int i=0;i<len1;i++)
		{
		if(str[i].contains(words)) return true;
		}
		return false;
		
	}
	public static void breakword(String word)
	{
		int len = word.length();
		wordbreak(word,len,"");
		
	}
	private static int wordbreak(String word, int len, String result) {
		// TODO Auto-generated method stub
		System.out.println(result);
		for(int i=1;i<=len;i++)
		{
			String prefix  =word.substring(0,i);
			if(containsword(prefix))
			{
				if(i==len)
				{
					result+=prefix;
					System.out.println(result);
					return 0;
				}
				wordbreak(word.substring(i,len-i),len-i,result+prefix+" ");
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "ilikeicecreamandmango";
		breakword(word);
	}

}
