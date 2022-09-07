package view;

import controller.ExQuickSort;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
	
		ExQuickSort quicksort =  new ExQuickSort();
        vetor = quicksort.Ordenacao(vetor, 0, vetor.length - 1);   
        
        
        for ( int cont : vetor) {
        	System.out.println (cont);
            System.out.println (" ");
        }
	}

}
