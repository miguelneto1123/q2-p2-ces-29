# P2 CES-29 - Questão 2:

Vulnerabilidades
-----
1. Em princípio, um `while(true)` é mau cheiro. Podemos substituí-lo por uma condição de execução, além de adicionar uma opção para que o usuário saia do programa.
2. A função `readLine()` do `BufferedReader` pode ocasionar um ataque DoS, já que o buffer não tem tamanho fixo e pode crescer indefinidamente. Isto se resolve passando um argumento adicional ao `BufferedReader`, o tamanho máximo dele, que aqui será colocado como 2048 (isto é, 2KB). Isso garante que o buffer não estoure de tamanho e tenha no máximo 2KB enquanto vai lendo o arquivo. A mesma coisa foi feita no `BufferedWriter`, que só pega 2KB por vez quando vai escrever, impedindo que um usuário mal-intencionado insira um texto com linhas muito grandes que possam causar DoS.
3. `fr` e `br` estavam desnecessariamente declarados duas vezes em algumas partes do código, isso era mau cheiro.
