//done by Krishna Kanth
/**Find duplicates in an array if there is more than one duplicate?*/


import java.util.ArrayList;


public class dupesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {6,4,5,7,3,6,4,7,6,2,9,6,9,9,9,9,9,9,9};
		int count[]=new int[array.length];
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				if(array[i]==array[j])
					count[i]++;
			}
		}
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<array.length;i++)
			if(count[i]>2)
				if(!(al.contains(array[i])))
					al.add(array[i]);
		
		
		for(Integer i:al)
			System.out.println("Element "+i+" from the given arraylist has more than one duplicates");
		
		
	

	}

}
