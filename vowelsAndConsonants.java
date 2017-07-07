//done by Krishna Kanth
/**Write a program to find a number of vowels and consonents in a String?*/
public class vowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Krishna Kanth";
		char[] vowels={'a','e','i','o','u'};
		int vcount=0,ccount=0;
		str=str.replaceAll(" ", "");
		str=str.trim();
		str=str.toLowerCase();		
		for(int i=0;i<str.length();i++){
			boolean flag=true;
			for(int j=0;j<vowels.length;j++){
				if(str.charAt(i)==vowels[j])
					flag=false;					
			}
			if(flag)
				ccount++;
			else
				vcount++;
		}
		System.out.println("Number of vowels: "+vcount);
		System.out.println("Number of consonants: "+ccount);

	}

}
