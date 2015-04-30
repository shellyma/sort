package buildHeap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;



public class buildHeapAssignment {
	public static void main (String argv[]) {
		
		BufferedReader bufReader = null; 
		PrintWriter outputStream = null;
		heap newHeap=new heap();
		
		try {
			bufReader = new BufferedReader (new FileReader ("C:\\users/Shelly/Desktop/sampleDataToSort.dat"));
		} catch (FileNotFoundException e) {
		System.err.println ("could not open file");
		}
		try {
			outputStream = new PrintWriter(new FileOutputStream("C:\\users/Shelly/Desktop/outputbuildHeap.dat"));
		} catch(Exception e){
			System.out.println("Error opening the file outputbuildHeap.dat");
		}
		
		int i = 1;
		
		while (true) {
		try {
			
			String currLine = bufReader.readLine ();
			if(currLine != "\0"){
			int temp1=Integer.parseInt (currLine);
			newHeap.heap[i]=temp1;
			i++;
			}
		} catch (Exception e) {
		break;}
		}
		
		newHeap.buildHeap(newHeap.heap,i-1);
		int c=1;
		for(c=1;c<=i-1;c++){
			outputStream.println(newHeap.heap[c]);
		}
		outputStream.close();
	}
}
