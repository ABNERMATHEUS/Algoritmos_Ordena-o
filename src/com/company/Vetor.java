package com.company;

public class Vetor {

    private int vetorQuaseOrdenado[];
    private int vetorDesordenado[];
    private int vetorDecrescente[];

    public Vetor() {

        this.vetorDecrescente = new int[1000];
        preencherDecrescente(this.vetorDecrescente);
    }

    public void preencherDecrescente(int vet []){
        int cont = 0;
        for (int i = vet.length-1; i>=0; i--){
            vet[i]=cont++;
           // System.out.println("indice"+i+"="+vet[i]);
        }
    }

}
