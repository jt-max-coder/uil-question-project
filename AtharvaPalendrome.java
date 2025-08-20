public class AtharvaPalendrome{
	public AtharvaPalendrome(){
        return;
    }

    public boolean isPalendrome(String input){
	    String before = input;
	    String after = "";
        after += before.substring(before.length()-1);
	    for(int i = before.length()-1; i > 0; i--){
            after += before.substring(i-1, i);
	    }
	    if(before.equals(after))
		    return true;
	    return false;
    }

    public String onlyPalendromes(String input){
	    String[] words = input.split(" ");
        String retString = "";
        for(int i = 0; i < words.length; i++){
            String thisWord = words[i].replaceAll("\\p{Punct}", "");
            if(isPalendrome(thisWord))     
                retString += words[i] + " ";
        }
        retString = retString.substring(0, retString.length());
        return retString;
    }
}
	
