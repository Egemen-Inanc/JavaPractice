
public class Main {
       static void isVowel(char ch)
       {
    	    boolean lowercase_vowel, uppercase_vowel;
    	    lowercase_vowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    	    uppercase_vowel = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    	    if (lowercase_vowel || uppercase_vowel)
    	        System.out.println(ch+" is a vowel");
    	    else
    	    	System.out.println(ch+" is a consonant");
    	   
       }
	public static void main(String[] args) {
		
		char character = 'B';
		isVowel(character);

	}

}
