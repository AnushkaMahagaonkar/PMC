import java.util.*;
public class ArraysAnswer2 {

	public static void main(String[] args) {
		int array[]=new int[] {0,1,2,2,1,0,0,2,0,1,1,0};
		int count0=0;
		int count1=0;
		int count2=0;
		int i;
		for(i=0;i<array.length;i++) {
			if(array[i]==0) {
				count0++;
			}
			else if(array[i]==1) {
				count1++;
			}
			else
			{
				count2++;
			}
		}
		for(i=0;i<count0;i++) {
			System.out.print("0");
		}
		for(i=0;i<count1;i++) {
			System.out.print("1");
		}
		for(i=0;i<count2;i++) {
			System.out.print("2");
		}
	}

}
