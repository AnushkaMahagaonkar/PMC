import java.util.*;
public class StringAnswer1 {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str= sc.nextLine();
		String splitedarray[]=str.split("\\s+");
		int n=splitedarray.length;
		String lastword=splitedarray[n-1];
		System.out.print("The last word in the string is "+lastword+" and it's length is "+lastword.length());
	}
}
