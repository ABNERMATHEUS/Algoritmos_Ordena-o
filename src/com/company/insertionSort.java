package com.company;

// link: https://pt.wikipedia.org/wiki/Insertion_sort

public class insertionSort {
	
	long tempInicial = System.currentTimeMillis();
	//long tempFinal = System.currentTimeMillis();
	
	public insertionSort(int[] vetor){
		
		System.out.println("O tempo inicial é de: " +tempInicial+ ".");
		
		for (int i = 1; i < vetor.length; i++){
			
			int aux = vetor[i];
			int j = i;
			
			while ((j > 0) && (vetor[j-1] > aux)){
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = aux;
			System.out.println("O tempo de execução é de: " + (System.currentTimeMillis() - tempInicial) + ".");
		}
		
	}
	

}
