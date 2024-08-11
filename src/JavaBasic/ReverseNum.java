package JavaBasic;

import java.util.*;

public class ReverseNum
{
	public static void main(String[] args) {
	    
	    int num = 0;
	    
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    
	    
	    while (a != 0){
	       int b = a % 10;
	        num = num * 10 + b;
	        a = a / 10;
	        
	    }
	    
	    
		System.out.println(num);
	}
}

