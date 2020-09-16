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


### Link github
https://github.com/lucasserain/dining-philosophers
