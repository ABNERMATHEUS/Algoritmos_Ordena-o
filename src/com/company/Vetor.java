package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Random;

public class Vetor {

    private int vetorQuaseOrdenado[];
    private int vetorDesordenado[];
    private int vetorDecrescente[];
    private Random random;

    public Vetor() {
        random = new Random();
        this.vetorDecrescente = new int[1000];
        this.vetorQuaseOrdenado = new int[1000];
        this.vetorDesordenado = new int[10000];
        preencherDecrescente(this.vetorDecrescente);
        preencherQuaseOrdenado(this.vetorQuaseOrdenado);
        preencherDesordenado(this.vetorDesordenado);
    }

    public void preencherDecrescente(int vet []){
        int cont = 0;
        for (int i = vet.length-1; i>=0; i--){
            vet[i]=cont++;
           // System.out.println("indice"+i+"="+vet[i]);
        }
    }


    public void preencherQuaseOrdenado(int vet[]){
        for(int i = 0; i <( (vet.length*95)/100) ; i++){
            vet[i]=i;
        }

        for (int a = (((vet.length)*95)/100) ; a< vet.length; a++ ){
            vet[a]=random.nextInt(1000);
        }

    }

    public void preencherDesordenado(int vet[]){
        for(int b= 0;b<vet.length;b++){
            vet[b]=random.nextInt(10000);
        }

    }



}
