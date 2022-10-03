package aplicaçãoDaFuncionalidadeHerança;

public class Carro {
	
	boolean ligado = false;
	int velocidadeAtual;
	int velocidadeMaxima;
	int turbo = 15;
	
	Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + turbo < velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		} else {
			velocidadeAtual += turbo;
		}
	}
	
	void frear() {
		if(velocidadeAtual > 5) {
			velocidadeAtual -= 25;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "KM/h";
	}
	

}
