import java.util.*;

	//Answer2 this will accept values of number as well as integer as well as double type because of <?extends Number> this is upper wildcard generics

public class Answer2 {
	
		public static void print(List <? extends Number> list) 
		{
		
			for (Number n : list)
				System.out.print(n + " ");
			System.out.println();
		}	
		public static void main(String args[]) {
			List l=new ArrayList();
			l.add(1.888888888888);
			l.add(2);
			l.add(3.03);
			print(l);	
			
		}

		
}
