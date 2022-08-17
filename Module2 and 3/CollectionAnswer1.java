import java.util.Arrays;
import java.util.List;
public class CollectionAnswer1 {

	public static void main(String[] args) {
		String array[]={"Good","Day"};
		System.out.println("Before converting array to collection "+Arrays.toString(array));
		List<String> list=Arrays.asList(array);
		System.out.println("After converting array to list "+list);
	}

}

