import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String entrada = sc.next();
		String saida = "";

		for (int i = entrada.length() - 1; i >= 0; i--) {
			saida = saida + entrada.charAt(i);
		}
		System.out.println(saida);

	}
}
