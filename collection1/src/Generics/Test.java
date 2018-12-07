package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> al=new ArrayList();
		al.add("A");
		List<Integer> al2=new ArrayList(al);
		al2.stream()
				.forEach(e->System.out.println(e)); //throws the classCastException.

	}
}
