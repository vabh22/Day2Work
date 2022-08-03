/*simple if else example*/
import java.util.*;
class EvenOdd{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int num=s.nextInt();
		if(num%2==0){
			System.out.println("number is even: " +num);
		}
		else {
			System.out.println("number is odd :" +num);
		}
	}
}

		