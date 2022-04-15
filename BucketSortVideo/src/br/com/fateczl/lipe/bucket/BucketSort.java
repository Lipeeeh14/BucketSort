package br.com.fateczl.lipe.bucket;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	public int[] bucketSort(int[] elementos, int numeroBaldes) {
		if (numeroBaldes <= 0)
			return null;
		
		ArrayList<Integer>[] baldes = new ArrayList[numeroBaldes];
		
		baldes = criarBaldesVazios(baldes, numeroBaldes);
		baldes = adicionarElementos(baldes, elementos, numeroBaldes);
		baldes = ordenarBaldes(baldes, numeroBaldes);
		
		return obterElementosOrdenados(baldes, elementos, numeroBaldes);
	}
	
	private ArrayList<Integer>[] criarBaldesVazios(ArrayList<Integer>[] baldes, int numeroBaldes){
	    for (int i = 0; i < numeroBaldes; i++)
	    	baldes[i] = new ArrayList<Integer>();
	    
	    return baldes;
	}
	
	private ArrayList<Integer>[] adicionarElementos(ArrayList<Integer>[] baldes, int[] elementos, int numeroBaldes){
		int index;
		
		for (int elemento : elementos) {
			index = elemento / numeroBaldes;
			baldes[index].add(elemento);
		}
	    
	    return baldes;
	}
	
	private ArrayList<Integer>[] ordenarBaldes(ArrayList<Integer>[] baldes, int numeroBaldes){
		for (int i = 0; i < numeroBaldes; i++) {
	    	Collections.sort((baldes[i]));
	    }
		
		return baldes;
	}
	
	private int[] obterElementosOrdenados(ArrayList<Integer>[] baldes, int[] elementos, int numeroBaldes) {
	    int index = 0;
	    
	    for (int i = 0; i < numeroBaldes; i++) {
	    	for (int j = 0, size = baldes[i].size(); j < size; j++) {
	    		elementos[index++] = baldes[i].get(j);
	    	}
	    }
	    
	    return elementos;
	}
}
