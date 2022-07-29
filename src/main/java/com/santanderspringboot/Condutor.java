package com.santanderspringboot;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

	public static void main(String[] args) {
		Condutor condutor = new Condutor (new Carro());
		Condutor condutor1 = new Condutor (new Moto());
		Condutor condutor2 = new Condutor (new Caminhao());
		condutor.automovel();
		condutor1.automovel();
		condutor2.automovel();
		
	}

	@Autowired
	private Veiculo veiculo;
	
	
	public Condutor(Veiculo objct) {
		this.veiculo = objct;
	}
	
	public void automovel() {
		veiculo.acao();
		veiculo.velocidade();
	}
}
