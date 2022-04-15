package br.com.fateczl.lipe.bucket;

public class Principal {

	public static void main(String[] args) {
		BucketSort bucket = new BucketSort();
		
		int[] elementos = {88, 34, 77, 8, 72, 12, 2, 45, 92, 91};
		bucket.bucketSort(elementos, 10);
		
		for (int elemento : elementos) {
			System.out.print(elemento + " ");
		}
	}

}
