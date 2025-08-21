import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class AtuvPalindrome{
	public AtuvPalindrome(){
        return;
    }//end of method

    public static void main(String args[]){
        File thisFile = new File("test cases.txt");
        Scanner tests = null;
        try {
            tests = new Scanner(thisFile);
        } catch (FileNotFoundException e) {}
        tests.next();

        int amount = tests.nextInt();
        for(int i = 0; i <= amount; i++){
            System.out.println(onlyPalendromes(tests.nextLine()));
        }
    }//end of method

    public static boolean isPalendrome(String input){
	    String before = input;
	    String after = "";
        if(before.equals(""))
            return true;
        after += before.substring(before.length()-1);
	    for(int i = before.length()-1; i > 0; i--){
            after += before.substring(i-1, i);
	    }
	    if(before.equals(after))
		    return true;
	    return false;
    }//end of method

    public static String onlyPalendromes(String input){
	    String[] words = input.split(" ");
        String retString = "";
        for(int i = 0; i < words.length; i++){
            String thisWord = words[i].replaceAll("\\p{Punct}", "");
            thisWord = thisWord.toLowerCase();
            if(isPalendrome(thisWord))     
                retString += words[i] + " ";
        }
        retString = retString.substring(0, retString.length());
        return retString;
    }//end of method
}//end of method