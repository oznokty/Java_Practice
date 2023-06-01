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

class Time_Conversion {

    public static String time;
    public static String replace;
    
    public static String timeConversion(String s) {
    
    if(s.endsWith("AM") && s.substring(0,2).equals("12")){
        replace = "00";
        time = replace + s.substring(2);
    }
    
    else if(s.endsWith("PM") && !s.substring(0,2).equals("12")){
    replace = String.valueOf(Integer.parseInt(s.substring(0,2))+12);
    time = replace + s.substring(2);
    }
    
    else {
        time = s;
    }  
    System.out.println(time);
    
    return time.substring(0,8);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Time_Conversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}