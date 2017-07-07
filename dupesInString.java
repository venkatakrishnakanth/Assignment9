//done by Krishna Kanth
/**Find Duplicate Characters in a String   
for ex: 
 If you enter 'Repeated' output should be
  e – 3 times
 If you enter 'Ramsamkamdamyumnum'
   a -4 times
   m – 6 
   u – 2 */
public class dupesInString {

	public static void main(String[] args) {
		String str ="Krishna Kanth";
		for(int i=0;i<str.length()-1;i++){
			int count =0;
			for(int j=1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					count++;
			}
			if(count>1)
				System.out.println(str.charAt(i)+" repeated "+count+" number of times.");
			str=str.replaceAll(str.substring(i,i+1), "");
			
		}

	}

}
