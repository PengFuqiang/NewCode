import java.util.*;

public class Reverse {
    public String reverseString(String iniString) {
        // write code here
    	if (iniString == null || iniString.length() > 5000 || iniString.length() == 1) {
    		return iniString;
    	}
    	String newStr = "";
    	int i = 0;
    	int len = iniString.length();
    	
    	for ( ; i < len ; i++) {
    		char c = iniString.charAt(len - 1 - i);
    		newStr = newStr + c;
    	}
    	return newStr;
    }
}