package a03_classes_internas_02;

import a03_classes_internas_02.Outer_place.Inner_place;

public class Program {

	public static void main(String[] args) {
		Outer_place outer = new Outer_place();
		outer.display_Inner();
		
		Inner_place inner = new Outer_place.Inner_place();
		inner.print();
	}
}
