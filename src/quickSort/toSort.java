package quickSort;

public class toSort {
	int size;
	int[] A;
	
	public toSort(){
		size=50;
		A=new int[size];
	}
	
	
	/** quickSort an array
	 * 
	 * @param A, the Array to sort
	 * @param p, the beginning of the Array
	 * @param r, the end of the Array
	 * @return a sorted Array
	 */
	public int[] quickSort(int[] A,int p,int r){
			int q;
			if(p<r){
				q = partition(A,p,r);
				quickSort(A,p,q-1);
				quickSort(A,q+1,r);
			}
			else return A;
			return A;
		}

	
	/** partition sort
	 * 
	 * @param A, the Array to partition
	 * @param p, the beginning of the array
	 * @param r, the break point of the array
	 * @return the next pivot
	 */
	public int partition(int[] A,int p,int r){
		int x=A[r]; //choose pivot, the last element
		int i=p-1;
		int temp;
		
		for(int j=p;j<=r-1;j++){
			if (A[j]<=x){
				i+=1;
				
				temp=A[i]; //swap A[i] and A[j]
				A[i]=A[j];
				A[j]=temp;
			}
		}
		
		temp=A[i+1]; //swap A[i+1] and A[r]
		A[i+1]=A[r];
		A[r]=temp;
		
		return i+1;
	}
	
	
	/**print out an Array
	 * 
	 * @param A, the array to print
	 * @param r, elements in the array
	 */
	public void printArray(int[] A, int r){
		for(int i=0; i<r; i++){
			System.out.println(A[i]);
		}
	}
}
