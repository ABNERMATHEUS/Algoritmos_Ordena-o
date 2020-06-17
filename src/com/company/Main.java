package com.company;

public class Main {

    public static void main(String[] args) {
        Vetor vetores = new Vetor();
        
        vetores.getVetorQuaseOrdenado();
        vetores.getVetorDecrescente();
        vetores.getVetorDesordenado();
        
        //10.000
        insertionSort is = new insertionSort(vetores.getVetorDecrescente());
        //heapSort hs = new heapSort(vetores.getVetorQuaseOrdenado());
        //selectionSort ss = new selectionSort(vetores.getVetorDecrescente());
        


    }
}
