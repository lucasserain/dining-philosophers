# Atividade 3 - Jantar dos filósofos

## Lucas Machado Serain RA: 22.217.007-8

### Deadlock
No meu código, o deadlock ocorreu porque o filosofo 3,4,2,5,1 pegaram o garfo esquerdo.
Assim, ninguém conseguiu pegar o garfo direito e comer.
Dessa forma, gerando o deadlock.

```
Filósofo 3 199251397810500: Pensando
Filósofo 5 199251398109300: Pensando
Filósofo 1 199251394780000: Pensando
Filósofo 2 199251398030400: Pensando
Filósofo 4 199251398295500: Pensando
Filósofo 3 199251418315200: Pegou o garfo esquerdo
Filósofo 4 199251420307200: Pegou o garfo esquerdo
Filósofo 2 199251426311300: Pegou o garfo esquerdo
Filósofo 5 199251443321500: Pegou o garfo esquerdo
Filósofo 1 199251465357900: Pegou o garfo esquerdo
``` 

### Sobre o código
Crio uma instancia de filosofos com a quantidade de filosofos definidos(5).

A cada iteração do for, é startado uma thread para cada filosofo.

Todo filosofo inicia pensando e cada vez que o garfo esquerdo estiver disponivel e o direito também, então o mesmo come.


# Exercício 2 
| tpensando/ tcomendo 	| 10% 	| 20% 	| 30% 	| 40% 	| 50% 	| 60% 	| 70% 	| 80% 	| 90% 	| 100% 	|
|:-------------------:	|:---:	|:---:	|:---:	|:---:	|:---:	|:---:	|:---:	|:---:	|:---:	|:----:	|
| Ciclos até deadlock 	|  53 	| 368 	| 465 	| 517 	|  9  	|  10 	| 438 	| 350 	| 293 	|   4  	|

## 10% (0.1ms pensando/1ms comendo)
``` java 
	private void agir(String acao,Integer status) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " " + acao);
		if(status == 1){
			Thread.sleep((long) 0.1);
		}else if(status == 4){
			Thread.sleep((long) 0.9);
		}
	}
```
## Outros tempos
Pra não repetir código, só alterei o sleep de cada status, status=1 para pensando e status=3 para comendo.

# Exercicio 3
Quanto mais tempo os filosofos passam comendo, maior a chance de deadlock.



### Link github
https://github.com/lucasserain/dining-philosophers