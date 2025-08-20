import java.util.*;
public Class AtharvaPalendrome {
	Public AtharvaPalendrome(){

    }

    public boolean isPalendrome(String input){
	    String before = input;
	    String after = "";
	    for(int i = before.length()-1; i >= 0; i--){
		    after += before;
	    }
	    if(before.equals(after))
		    return true;
	    return false;
    }

    public String onlyPalendromes(String input){
	    String[] words = String.split(" ");
        String retString = "";
        for(int i = 0; i < words.length; i++){
            wordsTest = words[i];
            if(isPalendrome(wordsTest.remove("\\p{Punct}")))     
                retString += words[i] + " ";
        }
        retString.remove(retString.length-1);
        return retString;
    }
}
	
