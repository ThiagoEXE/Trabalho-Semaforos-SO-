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
		
		Carro.t1.join();
		Carro.t2.join();
		Carro.t3.join();
		Carro.t4.join();
	}

}
