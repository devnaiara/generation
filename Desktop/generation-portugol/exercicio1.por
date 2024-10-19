programa {
  funcao inicio() {
   
    inteiro vetor[10]
    inteiro i, j, temp

    para i de 1 ate 10 faca
        escreva("Digite o 10 números!",i)
        leia(vetor[i])

    para i de 1 ate 9 faca
        para j de i+1 ate 10 faca
            se vetor[i] < vetor[j] entao
                temp < vetor[i]
                vetor[i] < vetor[j]
                vetor[j] < temp

    escreva("Ordem decrescente: ")
    para i de 1 ate 10 faca
        escreva(vetor[i], " ")

  }
}
