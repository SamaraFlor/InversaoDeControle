package com.santanderspringboot;

public class Carro implements Veiculo{

	@Override
	public void acao() {
		System.out.println("Carro: ");
		
	}

	@Override
	public void velocidade() {
		System.out.println("Ate 120km ");
		
	}

}
