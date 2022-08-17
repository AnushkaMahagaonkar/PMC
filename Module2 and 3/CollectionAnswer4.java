import java.util.*;

public class CollectionAnswer4 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("This");
		list.add("is");
		list.add("Fourth");
		list.add("question");
		list.add("of");
		list.add("collection");
		list.add("class");
		list.add("Fourth");
		list.add("question");
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Fourth");
		list2.add("question");
		System.out.println(list);
		System.out.println(list2);
		int indexofsublist=Collections.indexOfSubList(list, list2);
		System.out.println("The starting index of sublist is "+indexofsublist);
		int endindex=Collections.lastIndexOfSubList(list, list2);
		System.out.println("The ending of last occurance in list is " +endindex);
	}

}


