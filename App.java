
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="Ashby";
		String word2="yashb";
		
		
	 AnagramFinder t1= new AnagramFinder(word1,word2);
	 System.out.println(t1.compareWords());
		

	}

}






class AnagramFinder{
	String firstWord;
	String secondWord;
	
	AnagramFinder( String a,String b){
		firstWord=a.toLowerCase(); // remember you have to store lowercase string
		secondWord=b.toLowerCase();
	}
	
	public boolean compareWords(){
		
		
		
		if(firstWord.length() != secondWord.length()) {
			return false;
		}
		
		int[] differencesVAL= new int[26];
		
		for(int i=0; i<firstWord.length(); i++) {
			         char current=firstWord.charAt(i);
			         int index =current-'a';
			         differencesVAL[index]++;
		}
		
		for (int i = 0; i <secondWord.length(); i++) {
			 char current=secondWord.charAt(i);
	         int index =current-'a';
	         differencesVAL[index]--;
		}
		
		for(int count=0;count<26;count++) {
			if(differencesVAL[count]!=0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
	
	
}