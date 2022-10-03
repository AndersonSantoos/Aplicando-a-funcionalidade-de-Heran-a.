package aplicaçãoDaFuncionalidadeHerança;

public class CarroRun {
	public static void main(String[] args) {

		System.out.println("Dados HondaCivic");

		Carro c1 = new Civic();

		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.frear();
		System.out.println(c1);

	System.out.println("\nDados Bugatii");

		Carro c2 = new Bugatti();

		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.frear();
		System.out.println(c2);

		System.out.println("\nDados Ferrari");

		Carro c3 = new Ferrari();

		c3.acelerar();
		System.out.println(c3);
		c3.acelerar();
		System.out.println(c3);
		c3.acelerar();
		System.out.println(c3);
		c3.acelerar();
		System.out.println(c3);
		c3.frear();
		System.out.println(c3);

		System.out.println("\nDados Porshe");

		Carro c4 = new Porshe();

		c4.acelerar();
		System.out.println(c4);
		c4.frear();
		System.out.println();

	}

}
