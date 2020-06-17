package com.company;

// link: https://www.devmedia.com.br/algoritmos-de-ordenacao-em-java/32693

public class selectionSort {
	
	long tempInicial = System.currentTimeMillis();
	
	 public selectionSort(int[] array) {
		 System.out.println("O tempo inicial é de: " +tempInicial+ ".");
		 
		  for (int fixo = 0; fixo < array.length - 1; fixo++) {
		    int menor = fixo;
		   
		    for (int i = menor + 1; i < array.length; i++) {
		       if (array[i] < array[menor]) {
		          menor = i;
		       }
		    }
		    if (menor != fixo) {
		      int t = array[fixo];
		      array[fixo] = array[menor];
		      array[menor] = t;
		    }
		  }
		  System.out.println("O tempo de execução é de: " + (System.currentTimeMillis() - tempInicial) + ".");
		}

}
