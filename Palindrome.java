import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Palindrome {
    private static Boolean Palindrome(String word){
        String[] wa = word.split("");
        int count =0;
        int len = word.length();

        for (int i = 0; i<word.length(); i++){
            if (wa[i].toLowerCase().equals(wa[len-i-1].toLowerCase())){
                count++;
                //count++;
            }else {
                count = 0;
                break;
            }
        }
        if (count>0){
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
