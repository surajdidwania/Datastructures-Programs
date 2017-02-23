import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sdsadolution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
         Scanner sc = new Scanner(System.in);
        int testCases =sc.nextInt();
        String[] result = new String[testCases];
        for(int i=0;i<testCases;i++)
            {
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();
            
            if(side1 == side2 && side2 == side3)
                result[i]="Equilateral";
            else if((side1==side2) || ( side2==side3) ||(side3 ==side1))
                result[i]="Isosceles";
            else 
                result[i]="None of these";
                    
        }
        for(int i=0;i<testCases;i++)
            {
            System.out.println(result[i]);
        }
    }
}