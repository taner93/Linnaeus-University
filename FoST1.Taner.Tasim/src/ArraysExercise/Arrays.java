package ArraysExercise;

public class Arrays {


	public static void main(String[] args) {
		
		int[] a = {2,2,2,3,4,6,7,5};
		reverse(a);
	}
	public static int sum(int [] arr){
		//going through the array and adding each element to sum 
		int sum = 0;
		for(int i = 0; i<arr.length;i++){
			sum = sum + arr[i];
		}
		System.out.println(sum);
		return sum;
		
		}
	public static String toString(int [] arr){
	   String str = java.util.Arrays.toString(arr);
		return "n= " +str;	
	}
	   

	public static int[] addN(int[] arr, int n){
		//adding to each element in arr[i] the integer value n
		for(int i = 0;i<arr.length;i++){
			arr[i] = arr[i]+n;
		}
		String str = Arrays.toString(arr);
		System.out.println("The new array: " + str);
		return arr;
		
	}
	public static int[] reverse(int[] arr){
		String str = Arrays.toString(arr);
		System.out.println("The old array: " + str);
		int counter = arr.length-1;
		int [] b = new int[arr.length];
		
			for(int i = 0; i<b.length; i++){
				b[i]= arr[counter-i];						
			}
			System.out.println("The length is: " +counter);
			String str1 = Arrays.toString(b);
			System.out.println("The new array: " + str1);
		return arr;
		
	}
	public static void replaceAll(int[] arr, int old, int nw){
		for(int i = 0;i<arr.length;i++){
			if(arr[i]==old){
				arr[i] = nw;
			}
		}
		String str = Arrays.toString(arr);
		System.out.println(str);
		
	}
	//i have used already the sorting method which i used in my previous java course
	public static int[] sort(int[] arr){
		//creating the second array with the same size of the input array
		int[] b = new int[arr.length];
		//copy the whole arr to the new array
		for(int i = 0; i<b.length; i++){
			b[i] = arr[i];			
		}
		//go through the new array
	    for (int i = 0; i < b.length; i++) {
	    	//go through the each element which is after i
	        for (int p = i + 1; p < b.length; p++) {
	            int counter = 0;
	            //changing the places of the two indexes if i is bigger than the one next to it
	            if (b[i] > b[p]) {
	                counter = b[i];
	                b[i] = b[p];
	                b[p] = counter;
	            }
	        }
	    }		
		String str = Arrays.toString(b);
		System.out.println(str);
		return arr;
		
	}
public static boolean hasSubsequence(int[] arr, int[] sub){

	boolean loopBreaker=true;	//boolean to control the loop
	boolean isSubSequence = false; //the return value
	int counter = 0;
	int index = 0;
	while(loopBreaker){
		//go through the whole array arr and check if there is a number
		//that matches the first element in the array sub
		//if so, than store the index from arr to the variable int index, so we can 
		//know from where to start to check the elements
		for(int i=0;i<arr.length;i++){
			if(arr[i]==sub[0]){
				loopBreaker=false;			
				index = i;
			}
		}
		//start checking the sub arrays element, if the next element from
		//sub array matches to the index+1(in this case the next element in arr)
		//increase the counter, i created an algorithm to understand whether there is
		//a subsequence or not by checking the counter value if it has the same size as sub
		for(int i=0;i<sub.length;i++){
			if(arr[index]==sub[i]){
				counter++;
				index=index+1;
			}
		}
		if(counter==sub.length){
			System.out.println("Subsequence!");
			isSubSequence = true;
		}else{
		System.out.print("Not subsequence");
		isSubSequence = false;
		}
	}
	return isSubSequence;

	
}
public static int[] absDif(int[] arr1, int[] arr2){
	// i think(hope) here everything is understandable
	int[] c = new int[arr1.length];
	try{
	
	for(int i = 0;i<c.length;i++){
		c[i]=arr1[i]+arr2[i];
	}
	String str = Arrays.toString(c);
	System.out.println(str);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Both array should have the same size");
	}
	return c;
	
}

}



