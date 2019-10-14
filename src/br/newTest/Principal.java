package br.newTest;

import java.util.concurrent.Semaphore;

public class Principal {

	public static void main(String[] args) throws InterruptedException {


		int numeroPermissoes = 1;
		RegiaoCritica.semaforo = new Semaphore(numeroPermissoes);
		Carro.t1.start();
		Carro.t2.start();
		Carro.t3.start();
		Carro.t4.start();

	}

}
