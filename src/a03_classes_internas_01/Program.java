package a03_classes_internas_01;

public class Program {

	public static void main(String[] args) {
		Outer_place outer = new Outer_place();
		outer.display_Inner();

		outer.my_Method();
		
		
		InternaAnonima anonima = new InternaAnonima() {
			public void asbtractMethod() {
				System.out.println("Método abstrato implementado na anonima");
			}
			
			public void method() {
				super.method();
				System.out.println("Método não abstrato implementado na anonima");
			}
		};
		anonima.asbtractMethod();
		anonima.method();
		
		
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Minha implementação de run");
			}
		};
		runnable.run();
	}

}
