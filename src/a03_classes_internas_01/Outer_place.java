package a03_classes_internas_01;

public class Outer_place {

	int num;

	public class Inner_place {
		public void print() {
			System.out.println("It is an inner class" + num);
		}
	}

	void display_Inner() {
		Inner_place inner = new Inner_place();
		inner.print();
	}

	void my_Method() {
		int num = 45;
		
		class MethodInner_place {
			public void print() {
				System.out.println("method for inner classes " + num);
			}
		}
		MethodInner_place inner = new MethodInner_place();
		inner.print();
	}

}








