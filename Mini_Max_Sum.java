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

class Mini_Max_Sum {


    public static void miniMaxSum(List<Integer> arr) {
    
    int[] array = new int[arr.size()];
    
    for( int i=0; i<arr.size(); i++) {
        array[i] = arr.get(i);
    }
    long sum=0;
    
    for( int i=0; i<array.length;i++){
        sum+=array[i];
    }
    
    int max  = Arrays.stream(array).max().getAsInt();
 
    int min = Arrays.stream(array).min().getAsInt();
    
    long    maxsum = sum - min;
    long    minsum = sum - max;
    
    System.out.println(minsum+" "+maxsum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
