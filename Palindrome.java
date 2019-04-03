import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Palindrome {
    public static boolean isPalindrome(String word) {
        List<Object> array = new ArrayList();
		char[] woe = word.toCharArray();
    	for(int i = woe.length-1; i>=0; i--) {
    		array.add(woe[i]);
    	}
    	String arrays = array.toString();
    	String words = listToString(array);
    	if(word.toLowerCase().equals(words.toLowerCase())) {
        	return true;
        	}else {
        		return false;
    }
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
    public static String listToString(List<Object> list) {
        StringBuilder sb = new StringBuilder();

        for (Object object : list) {
            if (object != null) {
                if (object.getClass().isArray()) {
                    sb.append(Arrays.toString((Object[]) object));
                } else {
                    sb.append(object.toString());
                }
            }
        }
        return sb.toString();
    }
}
