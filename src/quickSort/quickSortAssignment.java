package quickSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class quickSortAssignment {
	public static void main (String argv[]) {
		
		BufferedReader bufReader = null; 
		PrintWriter outputStream = null;
		toSort A1 = new toSort(); // initialize an array
		
		try {
			bufReader = new BufferedReader (new FileReader ("C:\\users/Shelly/Desktop/sampleDataToSort.dat"));
		} catch (FileNotFoundException e) {
		System.err.println ("could not open file");
		}
		try {
			outputStream = new PrintWriter(new FileOutputStream("C:\\users/Shelly/Desktop/outputQSort.dat"));
		} catch(Exception e){
			System.out.println("Error opening the file outputQSort.dat");
		}
		int i = 1;
		while (true) {
		try {
			String currLine = bufReader.readLine ();
			if(currLine != "\0"){
			int temp1=Integer.parseInt (currLine);
			A1.A[i]=temp1;
			i++;
			}
		} catch (Exception e) {
		break;}
		}
		
		int c=1;
		A1.quickSort(A1.A, 1,i-1);
		
		for(c=1;c<i;c++){
			outputStream.println(A1.A[c]);
		}
		outputStream.close();
	}

}
