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

class Plus_Minus {


    public static void plusMinus(List<Integer> arr) {
   
    float posnum = 0;
    float negnum = 0;
    float zeros = 0;
    
    int n=arr.size();
    
    for (Integer i : arr) {
        if(i>0){
            posnum++;
        }
        else if (i<0) {
            negnum++;
        }
        else{
            zeros++;
        }
        
    }
    
    System.out.printf("%.6f\n",posnum/n);
    System.out.printf("%.6f\n",negnum/n);
    System.out.printf("%.6f\n",zeros/n);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
