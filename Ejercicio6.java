import java.util.*;

public class Ejercicio6 {

	public static void main(String args[]) {
		//Variables globales del algoritmo
		int i, n;
		int promed1, promed2;
		int edadTotalMenores25= 0;
		int edadTotalMayores25= 0;
		int numPersonasMen = 0;
		int numPersonasMay = 0;
		Scanner scanner = new Scanner(System.in);


		for (i=1;i<=100;i++) {
			System.out.print("Registro "+i+") Ingrese la edad: ");
			n = scanner.nextInt();


			if (n<25) {
				edadTotalMenores25+=n;
				numPersonasMen++;
				
			}
			if (n>25) {
				edadTotalMayores25+=n;
				numPersonasMay++;
				
			}

			
		}
		promed1 = edadTotalMenores25/numPersonasMen;
		promed2 = edadTotalMayores25/numPersonasMay;
		System.out.println("El promedio de edades de las personas menores a 25 años es = "+promed1+".");
		System.out.println("El promedio de edades de las personas mayores a 25 años es = "+promed2+".");
	}
}

