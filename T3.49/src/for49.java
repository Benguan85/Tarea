//DIEGO ALCALDE TEBAR
import java.util.Scanner;

public class for49 {

	public static void main(String[] args) {
		int psoF, psoR, paga = 0, totalmaleta, total = 0, coste;
		Scanner s = new Scanner(System.in);
		System.out.print("Cuántas maletas llevas: ");
		totalmaleta = s.nextInt();
		for (int numMaleta = 1; numMaleta <= totalmaleta; numMaleta++) {
			coste = 0;
			System.out.print("Introduce peso máximo facturado: ");
			psoF = s.nextInt();
			System.out.print("Introduce peso de la maleta: ");
			psoR = s.nextInt();
			paga = psoR - psoF;

			if (paga > 0) {
				coste = 12 * paga;
			}
			total += coste;
		}
		System.out.println("Coste total: " + total + " €");
	}

}
