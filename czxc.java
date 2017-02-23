import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class czxc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("suraj");
		String s2 = new String("suraj");
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("abc.yxy");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.print("Hello");
		
		ArrayList<String> sew = new ArrayList<String>();
		sew.add("suraj");
		String su = sew.get(0);
	}
	Object o = Class.forName(args[0]).newInstance();

}
