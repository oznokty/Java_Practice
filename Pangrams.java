import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Pangrams {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        
    boolean[] alph = new boolean[26]; 
    int index=0;
    int check=1;
    
    String yes = "pangram";
    String no = "not pangram";
    
    for (int i = 0; i < s.length(); i++) {
        if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
            index = s.charAt(i) - 'A';
         }
        else if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
            index = s.charAt(i) - 'a';
      }
       alph[index] = true;
    }
    
    for (int i = 0; i <= 25; i++) {
        if (!alph[i]){
            check = 0;}   
    }
    
    if(check == 1){
        return yes;
    }
    else{
        return no;
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Pangrams.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
