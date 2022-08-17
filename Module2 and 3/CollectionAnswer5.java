import java.util.*;
public class CollectionAnswer5 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n=sc.nextInt();
		System.out.println("Enter the elements of list");
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		System.out.println("Before rotation list is "+al);
		System.out.println("Enter the number of elements you want to rotate");
		int number=sc.nextInt();
		for(int i=0;i<number;i++) {
			
			int temp=al.get(n-1);
		
			for(int j=n-1;j>0;j--) {
				
				al.set(j, al.get(j-1));
			}
			
			al.set(0, temp);
			
		}
		System.out.println("After rotation of two items list is "+al);
	
	}

}









