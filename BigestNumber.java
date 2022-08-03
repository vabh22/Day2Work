/*nested if else*/
import java.util.*;
class BigestNumber{
	public static void main(String args[]){
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter First number:-- ");
		a=s.nextInt();
		System.out.print("Enter Second number:--");
		b=s.nextInt();
		System.out.print("Enter Third number:--");
		c=s.nextInt();
		if(a>b && a>c){
			System.out.println("First number is Big:--" +a);
		}
		else if(b>a && b>c){
			System.out.println("Second number is Big:--" +b);
		}
		else{
			System.out.println("Third number is Big:--" +c);
		}
	}
}
