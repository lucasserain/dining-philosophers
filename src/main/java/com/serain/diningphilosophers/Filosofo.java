package com.serain.diningphilosophers;

public class Filosofo implements Runnable {

	private Object garfoEsquerdo;
	private Object garfoDireito;

	public Filosofo(Object garfoEsquerdo, Object garfoDireito ){
		this.garfoEsquerdo = garfoEsquerdo;
		this.garfoDireito = garfoDireito;
	}

	private void agir(String acao) throws InterruptedException {
		System.out.println(
				Thread.currentThread().getName() + " " + acao);
		Thread.sleep(((int) (Math.random() * 100)));
	}
	
	@Override
	public void run() {
		try{
			while(true){
				agir(System.nanoTime() + ": Pensando");
				synchronized (garfoEsquerdo){
					agir(System.nanoTime() + ": Pegou o garfo esquerdo");
					synchronized (garfoDireito){
						agir(System.nanoTime() + ": Pegou o garfo direito - Comendo...");
						agir(System.nanoTime() + ": Largou o garfo direito");
					}
					agir(System.nanoTime() + ": Largou o garfo esquerdo. Voltando a pensar...");
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) throws Exception {

		Filosofo[] filosofos = new Filosofo[5];
		Object[] garfos = new Object[filosofos.length];

		for (int i = 0; i < garfos.length; i++) {
			garfos[i] = new Object();
		}

		for (int i = 0; i < filosofos.length; i++) {
			Object garfoEsquerdo = garfos[i];
			Object garfoDireito = garfos[(i + 1) % garfos.length];

			filosofos[i] = new Filosofo(garfoEsquerdo, garfoDireito);

			Thread t
					= new Thread(filosofos[i], "Filósofo " + (i + 1));
			t.start();
		}
	}
}
