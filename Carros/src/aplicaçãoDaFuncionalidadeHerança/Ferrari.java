package aplicaçãoDaFuncionalidadeHerança;

public class Ferrari extends Carro {
	
	Ferrari() {
		super(378);
	}

	void acelerar() {
		velocidadeAtual += 50;
	}
}
