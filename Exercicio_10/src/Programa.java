
public class Programa {

	public static void main(String[] args) {
		Forma circulo = new Circulo(5.0);
		Forma quadrado = new Quadrado(4.0);

		System.out.printf("Área do círculo: %.2f%n", circulo.calcularArea());
		System.out.printf("Área do quadrado: %.2f%n", quadrado.calcularArea());

	}

}
