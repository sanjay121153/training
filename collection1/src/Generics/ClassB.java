package Generics;

public class ClassB extends ClassA<String> {
	
	public void set(String s) {
		super.setValue(s);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ClassA<String> a=new ClassB();
		a.setValue("XZ");
		System.out.println(a.getValue());
	}
}
