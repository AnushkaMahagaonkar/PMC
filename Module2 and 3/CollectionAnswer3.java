import java.util.*;

public class CollectionAnswer3 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "hello");
		hm.put(2, "how");
		hm.put(3, "are");
		hm.put(4, "you");
		hm.forEach(
				(key, value)->System.out.println(key+" " +value));

	}
}


// forEach is interface so to use this interface we need to use lamda function.