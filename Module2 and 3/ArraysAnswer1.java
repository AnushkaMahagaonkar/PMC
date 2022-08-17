import java.util.*;
public class ArraysAnswer1 {

	public static void main(String[] args) {
		int str[]=new int[] {2,5,4,6,8,8,2};
		Arrays.sort(str);
		//System.out.print(str.length);
		for(int i=0;i<str.length-1;i++) 
		{
			//System.out.println(str[i]);
			if(str[i]==str[i+1]) {
				System.out.println("The  duplicate number in array is"+str[i]);
			}
		}
		
	}
}
