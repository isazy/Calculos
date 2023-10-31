package interfaceCalculos;

public class Principal {

	public static void main(String[] args) {
,
		Adicionar add = new Adicionar();
		System.out.println("SOMA:");
		System.out.println(add.somar(10,10));

		Subtrair sub = new Subtrair();
		System.out.println("SUBTRAÇÂO:");
		System.out.println(sub.sub(10, 10));
		
		calculando cal = new calculando();
		System.out.println("DIVISÂO:");
		System.out.println(cal.div(10, 2));
		System.out.println("MULTIPLICAÇÂO:");
		System.out.println(cal.mult(10, 10));
		
		Expo exp = new Expo();
		System.out.println("EXPO:");
		System.out.println(exp.exp(10, 10));
	}

}
