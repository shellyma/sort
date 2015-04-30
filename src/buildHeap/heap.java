package buildHeap;

public class heap {
	int[] heap;
	int size;
	
	public heap(){
		size=10000;
		heap=new int[size];
	}
	
	public void minHeapify(int[] A, int n, int i){
		int min=0;
		int temp=0;
		
		if((2*i<=n)&&(A[2*i]<A[i])){
			min=2*i;
		}else min=i;
		if(((2*i+1)<=n)&&(A[2*i+1]<A[min])){
			min=2*i+1;
		}else
			min=min;
		if(min != i){
			temp=A[i];
			A[i]=A[min];
			A[min]=temp;
			
			minHeapify(A,n,min);
		}
	}
	
	public void buildHeap(int[] A, int n){
		int i;
		for(i=n/2;i>=1;i--){
			minHeapify(A,n,i);
		}
	}
	
}
