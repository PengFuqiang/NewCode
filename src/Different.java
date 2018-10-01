import java.util.*;

public class Different {
    public boolean checkDifferent(String iniString) {
        // write code here
        if (iniString == null){
            return true;
        } else if (iniString.length() == 1){
            return true;
        } else {
            for(int i = 0; i < iniString.length() - 1; i++){
                for(int j = i+1; j < iniString.length(); j++){
                    if (iniString.charAt(i) == iniString.charAt(j)) {
                        return false;
                    }
                }
            }
            return true;
        }
  }
}