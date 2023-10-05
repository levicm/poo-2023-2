package a03_classes_internas_02;

public class Outer_place {
	
	static double PI = 3.1415f;

	static class Inner_place {
		public void print() {
			System.out.println("It is an inner class" + PI);
		}
	}

	int num;

	void display_Inner() {
		Inner_place inner = new Inner_place();
		inner.print();
	}
}
