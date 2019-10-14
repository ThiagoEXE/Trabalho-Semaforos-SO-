package br.newTest;

import java.util.concurrent.Semaphore;

public class Carro {
	
	static String threadNome;
	static String sentido;

	static Thread t1 = new Thread() {

		public void run() {

			try {
				RegiaoCritica.semaforo.acquire();
				threadNome = "Carro Vermelho";
				sentido = "Direita";
				System.out.println("Thread " + threadNome + " segue a: " + sentido);
				t1.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				RegiaoCritica.semaforo.release();
			}
		}
	};
	
	static Thread t2 = new Thread() {

		public void run() {

			try {
				RegiaoCritica.semaforo.acquire();
				threadNome = "Carro Verde";
                sentido = "Esquerda";
				System.out.println("Thread " + threadNome + " segue a: " + sentido);
				t2.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				RegiaoCritica.semaforo.release();
			}
		}
	};

	static Thread t3 = new Thread() {

		public void run() {

			try {
				RegiaoCritica.semaforo.acquire();
				threadNome = "Carro Azul";
                sentido = "Direto";
				System.out.println("Thread " + threadNome + " segue: " + sentido);
				t3.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				RegiaoCritica.semaforo.release();
			}
		}
	};

	static Thread t4 = new Thread() {

		public void run() {

			try {
				RegiaoCritica.semaforo.acquire();
				threadNome = "Carro Amarelo";
                sentido = "Direto";
				System.out.println("Thread " + threadNome + " segue: " + sentido);
				t4.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				RegiaoCritica.semaforo.release();
			}
		}
	};

}
