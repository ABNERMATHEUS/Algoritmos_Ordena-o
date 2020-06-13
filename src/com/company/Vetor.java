package com.company;

public class Vetor {

    private int vetorQuaseOrdenado[];
    private int vetorDesordenado[];
    private int vetorDecrescente[];

    public Vetor() {
        this.vetorQuaseOrdenado = new int[1000] ;
        this.vetorDesordenado = new int[1000];
        this.vetorDecrescente = new int[1000];
    }

    public void preencherDecrescente(int vet []){
        for (int i = vet.length; i>0; i--){
            vet[i]=i;
        }
    }

}
