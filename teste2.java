
Teste 2
public class Main {
	public static void main(String[] args) {


		int a = 1;
		int b = 0;
		int aux;

		for (int i = 0; i < 100; i++) {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
		}
	}
}

