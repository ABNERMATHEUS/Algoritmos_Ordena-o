package com.company;

// link: https://pt.wikipedia.org/wiki/Insertion_sort

public class insertionSort {
	
	public insertionSort(int[] vetor){
		
		for (int i = 1; i < vetor.length; i++){
			
			int aux = vetor[i];
			int j = i;
			
			while ((j > 0) && (vetor[j-1] > aux)){
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = aux;

		}
	
	}

}
