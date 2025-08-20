Public class AtharvaPalendrome{
	Public KingArthur(){

    }

    Public boolean isPalendrome(String input){
	    String before = input.remove(“ “);
	    String after = “”;
	    for(int i = before.length()-1; i >= 0; i--){
		    after += before.getIndex(i);
	    }
	    if(before.equals(after))
		    Return true;
	    Return false
    }

    Public String onlyPalendromes(String input){
	    String[] words = String.split(“ “);
        string retString = "";
        for(int i = 0; i < words.length; i++){
            wordsTest = words[i];
            if(isPalendrome(wordsTest.remove("\\p{Punct}")))     
                retString += words[i] + " "
        }
        retString.remove(retString.length-1);
        return retString
    }
}
	
