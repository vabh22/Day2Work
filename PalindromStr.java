import java.util.*;
class PalindromStr{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=s.nextLine();
		StringBuffer sb=new StringBuffer(str1);
		sb.reverse();//buit in method
		System.out.println("==original String==");
		System.out.println("str1:"+str1.toString());
		System.out.println("sb:"+sb.toString());
		System.out.println("palindrom process==");
		String str2 =new String(sb);
		System.out.println("str2:"+str2.toString());
		if(str1.equals(str2)){
			System.out.println("String is palindrom ");
		}
		else {
			System.out.println("String is not palindrom");
		}
	}
	
}
