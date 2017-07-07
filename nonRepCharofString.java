//done by Krishna Kanth
/**Print first non-repeated character in String?*/
public class nonRepCharofString {

	public static void main(String[] args) {

		String str ="Krishna Kanth";
		for(int i=0;i<str.length()-1;i++){
			int count =0;
			for(int j=1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					count++;
			}
			if(count==1)
				System.out.println(str.charAt(i)+" is the first non repeated character of given string.");
			break;
			
		}

	}	

}
