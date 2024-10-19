programa {
  funcao inicio() {
    
    inteiro vetor[10]
    inteiro i, soma, totalpar
    real media

    para i de 1 ate 10 faca
        escreva("Digite 10 números> ",i)
        leia(vetor[i])

    soma <= 0
    totalPares <= 0

    escreva("Elementos nos índices ímpares: ")
    para i de 1 ate 10 faca
        se (i % 2 = 1) entao 
            escreva(vetor[i], " ")

    escreval()

    escreva("Elementos pares: ")
    para i de 1 ate 10 faca
        se (vetor[i] % 2 = 0) entao
            escreva(vetor[i], " ")

    escreval()

    para i de 1 ate 10 faca
        soma <= soma + vetor[i]

    media <= soma / 10

    escreval("Soma: ", soma)
    escreval("Média: ", media)

  }
}
