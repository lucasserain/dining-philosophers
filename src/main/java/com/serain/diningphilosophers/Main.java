package com.serain.diningphilosophers;

import com.serain.diningphilosophers.model.Barbearia;
import com.serain.diningphilosophers.model.Barbeiro;
import com.serain.diningphilosophers.model.Cliente;


public class Main {

	public static void main(String[] args) {
		Barbearia barbearia = new Barbearia();

		Barbeiro barb = new Barbeiro(barbearia);

		Cliente cli1 = new Cliente(barbearia, "[ Cliente 01 ]");
		Cliente cli2 = new Cliente(barbearia, "[ Cliente 02 ]");
		Cliente cli3 = new Cliente(barbearia, "[ Cliente 03 ]");
		Cliente cli4 = new Cliente(barbearia, "[ Cliente 04 ]");
		Cliente cli5 = new Cliente(barbearia, "[ Cliente 05 ]");
		Cliente cli6 = new Cliente(barbearia, "[ Cliente 06 ]");
		Cliente cli7 = new Cliente(barbearia, "[ Cliente 07 ]");
		Cliente cli8 = new Cliente(barbearia, "[ Cliente 08 ]");
		Cliente cli9 = new Cliente(barbearia, "[ Cliente 09 ]");
		Cliente cli10 = new Cliente(barbearia, "[ Cliente 10 ]");
		Cliente cli11 = new Cliente(barbearia, "[ Cliente 11 ]");
		Cliente cli12 = new Cliente(barbearia, "[ Cliente 12 ]");
		Cliente cli13 = new Cliente(barbearia, "[ Cliente 13 ]");
		Cliente cli14 = new Cliente(barbearia, "[ Cliente 14 ]");
		Cliente cli15 = new Cliente(barbearia, "[ Cliente 15 ]");
		Cliente cli16 = new Cliente(barbearia, "[ Cliente 16 ]");
		Cliente cli17 = new Cliente(barbearia, "[ Cliente 17 ]");
		Cliente cli18 = new Cliente(barbearia, "[ Cliente 18 ]");
		Cliente cli19 = new Cliente(barbearia, "[ Cliente 19 ]");
		Cliente cli20 = new Cliente(barbearia, "[ Cliente 20 ]");
		Cliente cli21 = new Cliente(barbearia, "[ Cliente 21 ]");
		Cliente cli22 = new Cliente(barbearia, "[ Cliente 22 ]");
		Cliente cli23 = new Cliente(barbearia, "[ Cliente 23 ]");
		Cliente cli24 = new Cliente(barbearia, "[ Cliente 24 ]");
		Cliente cli25 = new Cliente(barbearia, "[ Cliente 25 ]");
		Cliente cli26 = new Cliente(barbearia, "[ Cliente 26 ]");
		Cliente cli27 = new Cliente(barbearia, "[ Cliente 27 ]");
		Cliente cli28 = new Cliente(barbearia, "[ Cliente 28 ]");
		Cliente cli29 = new Cliente(barbearia, "[ Cliente 29 ]");
		Cliente cli30 = new Cliente(barbearia, "[ Cliente 30 ]");
		Cliente cli31 = new Cliente(barbearia, "[ Cliente 31 ]");
		Cliente cli32 = new Cliente(barbearia, "[ Cliente 32 ]");
		Cliente cli33 = new Cliente(barbearia, "[ Cliente 33 ]");
		Cliente cli34 = new Cliente(barbearia, "[ Cliente 34 ]");
		Cliente cli35 = new Cliente(barbearia, "[ Cliente 35 ]");
		Cliente cli36 = new Cliente(barbearia, "[ Cliente 36 ]");
		Cliente cli37 = new Cliente(barbearia, "[ Cliente 37 ]");
		Cliente cli38 = new Cliente(barbearia, "[ Cliente 38 ]");
		Cliente cli39 = new Cliente(barbearia, "[ Cliente 39 ]");
		Cliente cli40 = new Cliente(barbearia, "[ Cliente 40 ]");
		Cliente cli41 = new Cliente(barbearia, "[ Cliente 41 ]");
		Cliente cli42 = new Cliente(barbearia, "[ Cliente 42 ]");
		Cliente cli43 = new Cliente(barbearia, "[ Cliente 43 ]");
		Cliente cli44 = new Cliente(barbearia, "[ Cliente 44 ]");
		Cliente cli45 = new Cliente(barbearia, "[ Cliente 45 ]");
		Cliente cli46 = new Cliente(barbearia, "[ Cliente 46 ]");
		Cliente cli47 = new Cliente(barbearia, "[ Cliente 47 ]");
		Cliente cli48 = new Cliente(barbearia, "[ Cliente 48 ]");

		long start =System.currentTimeMillis();

		barb.start();
		cli1.start();
		cli2.start();
		cli3.start();
		cli4.start();
		cli5.start();
		cli6.start();
		cli7.start();
		cli8.start();
		cli9.start();
		cli10.start();
		cli11.start();
		cli12.start();
		cli13.start();
		cli14.start();
		cli15.start();
		cli16.start();
		cli17.start();
		cli18.start();
		cli19.start();
		cli20.start();
		cli21.start();
		cli22.start();
		cli23.start();
		cli24.start();
		cli25.start();
		cli26.start();
		cli27.start();
		cli28.start();
		cli29.start();
		cli30.start();
		cli31.start();
		cli32.start();
		cli33.start();
		cli34.start();
		cli35.start();
		cli36.start();
		cli37.start();
		cli38.start();
		cli39.start();
		cli40.start();
		cli41.start();
		cli42.start();
		cli43.start();
		cli44.start();
		cli45.start();
		cli46.start();
		cli47.start();
		cli48.start();


		long finish =System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println(timeElapsed);

		while (true) {
			int qtd = barbearia.getFilaClientes().size();
			int atendidos = barbearia.getAtendidos();
			boolean dormindo = barbearia.isDormindo();
		}

	}

}
