import java.util.*;
import java.lang.*;
public class CollectionAnswer2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("how");
		list.add("are");
		list.add("you");
		Object string[]=list.toArray();
		for(int i=0;i<string.length;i++) {
			System.out.print(string[i]);
		}
	}

}
