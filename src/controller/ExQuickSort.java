package controller;

public class ExQuickSort {

	public ExQuickSort() {
		super();	
	}	
	public int[] Ordenacao(int[] vetor, int inicio, int fim) {	
		if (fim > inicio) {
			int pivofixo = dividir(vetor, inicio, fim);
			Ordenacao(vetor, inicio, pivofixo - 1);
			Ordenacao(vetor, pivofixo + 1, fim);
		}
		return vetor;
	}

	
	
  public int dividir(int[] vetor, int inicio, int fim) {
	  
	  int pivo = vetor[inicio];
	  int ponteiroEsquerda = inicio + 1;
	  int ponteiroDireita = fim;
	  
	  while (ponteiroEsquerda <= ponteiroDireita) {
		  while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda]<= pivo) {
			  ponteiroEsquerda++;
			  
		  }
		  while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
			  ponteiroDireita--;
			  
		  }
		  
		  if (ponteiroEsquerda < ponteiroDireita) {
			  trocar(vetor,ponteiroEsquerda, ponteiroDireita);
			  ponteiroEsquerda++;
			  ponteiroDireita--;
		  } 
	  }
	  trocar( vetor, inicio, ponteiroDireita);
	  return ponteiroDireita;
  }

        private void trocar(int[] vetor, int i, int j) {
	  int aux = vetor[j];
	  vetor[j] = vetor[i];
	  vetor[i] = aux;
} 

	
	
	
	
}
