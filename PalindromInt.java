/*Palindrom integer using while loop  and if else*/
import java.util.*;
class PalindromInt{
	public static void main(String args[])
	{
		int n,r,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:----");
		n=s.nextInt();
		temp=n;
		while(n>0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("Given number is palindrom number");
		}
		else {
			System.out.println("Given number is not palindrom number");
		}
	}
}

			