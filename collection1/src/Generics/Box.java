package Generics;

public class Box {

	public static <T> void getBoxType(T t){
		System.out.println(" getBoxType ");
	}
	
	public static void main(String[] args) {
		Box.getBoxType(12);
		Box.getBoxType("AXT");
	}
}
