package com.serain.diningphilosophers;

public class Filosofo implements Runnable {

	private Object garfoEsquerdo;
	private Object garfoDireito;
	private Object garfoMeio;
	private Integer ciclo = 0;

	public Filosofo(Object garfoEsquerdo, Object garfoDireito, Object garfoMeio ){
		this.garfoEsquerdo = garfoEsquerdo;
		this.garfoDireito = garfoDireito;
		this.garfoMeio = garfoMeio;
	}

	private void agir(String acao,Integer status) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " " + acao);
		if(status == 1){
			Thread.sleep((long) 0.9);
		}else if(status == 4){
			Thread.sleep((long) 0.1);
		}
	}
	
	@Override
	public void run() {
		try{
			while(true){
				System.out.println("Ciclo:" + ++ciclo);
				agir(System.nanoTime() + ": Pensando",1);
				synchronized (garfoEsquerdo){
					agir(System.nanoTime() + ": Pegou o garfo esquerdo",2);
					synchronized (garfoDireito){
						agir(System.nanoTime() + ": Pegou o garfo direito - Comendo...",3);
						agir(System.nanoTime() + ": Largou o garfo direito",4);
					}
					synchronized (garfoMeio){
                        agir(System.nanoTime() + ": Pegou o garfo do meio",6);
                    }
					agir(System.nanoTime() + ": Largou o garfo esquerdo. Voltando a pensar...",5);
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) throws Exception {

		Filosofo[] filosofos = new Filosofo[5];
		Object[] garfos = new Object[6];

		for (int i = 0; i < garfos.length; i++) {
			garfos[i] = new Object();
		}

		for (int i = 0; i < filosofos.length; i++) {
			Object garfoEsquerdo = garfos[i];
            Object garfoMeio = garfos[i];
			Object garfoDireito = garfos[(i + 1) % garfos.length];

			filosofos[i] = new Filosofo(garfoEsquerdo, garfoDireito,garfoMeio);

			Thread t
					= new Thread(filosofos[i], "Filósofo " + (i + 1));
			t.start();
		}
	}
}
