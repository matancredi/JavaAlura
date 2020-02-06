package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
		conta.saca(201.1);
		
		System.out.println(conta.getSaldo());
	}
}
