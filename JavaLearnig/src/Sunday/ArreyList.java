package Sunday;

import java.util.ArrayList;

public class ArreyList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
		al.add("Abdul");
		al.add(96);
		al.add(25.25);
		
		System.out.println(al.size());
		
		al.set(0, "Abdul Majid");
		System.out.println(al);
	}
}
