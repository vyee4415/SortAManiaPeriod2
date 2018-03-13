import java.util.Arrays;

public abstract class Team3SortCompetition extends SortCompetition {
	public String greeting() {
		return("We winning this lol");
	}
	
//----------------------------------------------------------------------//	
	
	public int challengeOne(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                	int x = arr[j];
               		arr[j] = arr[j-1];
            		arr[j-1] = x;
                }
            }
        }
		int what = (arr.length+1)/2;
		if(arr.length%2==1){ // if length of newarr is odd
		        return(arr[(arr.length-1)/2]);
		}else{
		        return((((arr[what]+arr[what-1])/2)));
		}
	}
	
//----------------------------------------------------------------------//	
	
	//Jacky Chen 
	public int challengeTwo(String[] arr, String query) { 
        String[]  mergeResult=mergeSort(arr);
        for(int i=0;i<mergeResult.length;i++)	
		{
			if(query.equals(mergeResult[i]))
			{
				return i;
			}			
		}
		
		return -1;
	}
	public static String[] mergeSort(String[] list1)
	{
		//base case
		if(list1.length==1) {
			return list1;
		}
		
		//recursive
		String [] left = Arrays.copyOfRange(list1, 0, list1.length/2);
		String [] right = Arrays.copyOfRange(list1, list1.length/2, list1.length);
		return(merge(mergeSort(left),mergeSort(right)));
	}
	
	public static String[] merge(String[]list1,String[]list2)
	{
		
		String empty[] = new String[list1.length + list2.length];
		int i=0;
		int li=0;
		int ri=0;
		while((li<list1.length)&&(ri<list2.length))
		{
			if(list1[li].compareTo(list2[ri])>0)
			{
				empty[i]=list2[ri];
				ri++;
				i++;
			}
			else if(list1[li].compareTo(list2[ri])<=0) 
			{
				empty[i]=list1[li];
				li++;
				i++;
			}
		}
		while(li<list1.length)
		{
			empty[i]=list1[li];
			li++;
			i++;
			
		}
		while(ri<list2.length)
		{
			empty[i]=list2[ri];
			ri++;
			i++;
		}
		return empty;
	}
	
// ------------------------------------------------------------------//	
	
	public int challengeThree(int[] arr){
		insertionSort(arr);
		int what = (arr.length+1)/2;
		if(arr.length%2==1){ // if length of newarr is odd
		        return(arr[(arr.length-1)/2]);
		}else{
		        return((((arr[what]+arr[what-1])/2)));
		}
	}
	public static void insertionSort(int[] list1)
	{
        for (int i = 1; i < list1.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(list1[j] < list1[j-1]){
                    xinsertionSort(list1,j,j-1);
                }
            }
        }
	}
	
	public static void xinsertionSort(int[]arr, int index1, int index2)
	{
		int temp;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
//------------------------------------------------------------//	
	
	// Vivian Yee
	public int challengeFour(int[][] arr){
		int key, j, big; 
		for(int z = 0; z < arr.length; z++) {
			for(int i = 0; i < arr[0].length; i++) {
				key = arr[z][i]; 
				j = i - 1; 
				while((j>=0)&&(arr[z][j] > key)) {
					SwapInt(arr[z], j+1, j);
					
					j = j - 1; 
				}
				arr[z][j+1] = key;
			}
		}
		
		// if arr length is odd
		if(arr[0].length%2==1){
		    // create new array
		    big = (arr[0].length-1)/2;
		    int[] newarr = new int[arr.length];
		    for(int z = 0; z < newarr.length; z++) {
		        newarr[z] = arr[z][big];
		    }
            // sorts newarr
            for(int i = 1; i < newarr.length; i++) {
		    	key = newarr[i];
			    j = i - 1;
			    while((j>=0)&&(newarr[j] > key)) {
				    SwapInt(newarr, j+1, j);
				    j = j - 1;
			    }
			newarr[j+1] = key;
		    }
		    int what = (newarr.length+1)/2;
            if(newarr.length%2==1){ // if length of newarr is odd
		        return(newarr[(newarr.length-1)/2]);
		    }else{
		        return((((newarr[what]+newarr[what-1])/2)));
		    }
		}else{ // if array length is even
		    // create new array
		    big = (arr[0].length+1)/2;
		    int[] newarr = new int[arr.length];
		    for(int z = 0; z < newarr.length; z++) {
		        newarr[z] = (arr[z][big]+arr[z][big-1])/2;
		    }
            // sorts newarr
		    for(int i = 1; i <newarr.length; i++) {
		    	key = newarr[i];
			    j = i - 1;
			    while((j>=0)&&(newarr[j] > key)) {
				    SwapInt(newarr, j+1, j);
				    j = j - 1;
			    }
			newarr[j+1] = key;
		    }
            int what = (newarr.length+1)/2;
            if(newarr.length%2==1){ // if length of newarr is odd
		        return(newarr[(newarr.length-1)/2]);
		    }else{
		        return((((newarr[what]+newarr[what-1])/2)));
		    }
		}
	}
	public static void SwapInt(int[] arr, int index, int index2) {
		int x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
	
//--------------------------------------------------------------------------//
	// Vivian Yee
	public int challengeFive(Comparable[] arr, Comparable query){
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j].compareTo(arr[j-1])<0){
                	Comparable x = arr[j];
               		arr[j] = arr[j-1];
            		arr[j-1] = x;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
        	if(query.compareTo(arr[i])==0) {
        		return i;
        	}
        }
        return -1;
	}
}


