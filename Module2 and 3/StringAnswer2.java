import java.util.Arrays;
import java.util.Scanner;

public class StringAnswer2 {

	public static void main(String[] args) {
		boolean bool=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1");
		String s=sc.nextLine();
		System.out.println("Enter the second string");
		String t=sc.nextLine();
		if(s.length()!=t.length()) {
			System.out.println("Not anagram");
			System.exit(1);
		}
		else
		{
			char str[]=s.toCharArray();
			char str1[]=t.toCharArray();
			Arrays.sort(str);
			Arrays.sort(str1);
//			System.out.println(str);
//			System.out.println(str1);
			if(Arrays.equals(str, str1)) {
				bool=true;
			}
		}
		if(bool==true) {
			System.out.print(bool);
		}
		else {
			System.out.println(bool);
		}
		
	}

}
