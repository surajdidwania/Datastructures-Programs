import java.util.Scanner;

public class HappyNumber {
	public boolean isHappy(int num) {
        int tmp=0;int tmp1;
		do{
        while(num>0)
        {
            tmp1= num%10;
            tmp+=Math.pow(tmp1, 2);
            num = num/10;
        }
        num=tmp;
        System.out.println(tmp);
        tmp=0;
        }while(num>9);
        if(num == 1) return true; else return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		HappyNumber hn = new HappyNumber();
		if(hn.isHappy(num))
			System.out.println("Happy Number");
		else
			System.out.println("Not Happy Number");
	}

}
