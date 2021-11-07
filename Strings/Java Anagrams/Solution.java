import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean res = true;
        if(a.length() != b.length()){ 
            res = false; 
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int freq[] = new int [256];
        for(char c : a.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c : b.toCharArray()){
            freq[c - 'a']--;
        }
        for(int i = 0; i < 256; i++){
            if(freq[i] != 0){
                res = false;
                break;
            }
        }
        return res;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
