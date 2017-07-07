//done by Krishna Kanth
/**In an Array – Find an element which appeared most. 
for Ex: int array[] = {6,4,5,7,3,6,4,7,6,2,9,6}
  in this 6 is the most appeared number and appeared 4 times. */
public class popularElement {

	public static void main(String[] args) {
		int array[] = {6,4,5,7,3,6,4,7,6,2,9,6,9,9,9,9,9,9,9};
		int count[]=new int[array.length];
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				if(array[i]==array[j])
					count[i]++;
			}
		}
		int popElem =0; int pos=0;
		for(int i=0;i<count.length;i++){
			if(count[i]>popElem){
				popElem = count[i]; pos=i;}
		}
		
		System.out.println("The element that is repeated most number of times in arraylist is");
		System.out.println(array[pos]+" is repeated "+popElem+" times");

	}

}
