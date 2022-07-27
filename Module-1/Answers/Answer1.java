enum Subjects{
	DBMS,
	DSA,
	NETWORKING,
	OPERATINGSYSTEM;
	
}
public class Answer1 {
	public static void main(String args[]) {
		//Answer of a
			for(Subjects s:Subjects.values()) {
				System.out.println("The values in enum are " +s +" and their index is " +s.ordinal());
			}
		
		//Answer b
//			Subjects s=Subjects.CompilerDesignThe code ;
//			System.out.println(s);
		
		
			
	}
}

