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

class Sparse_Arrays {


    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    
    String[] newstrings = new String[strings.size()];
        newstrings = strings.toArray(newstrings);
        
    String[] newqueries = new String[queries.size()];
        newqueries = queries.toArray(newqueries);
    
    int results[] = new int[newqueries.length];
    
    HashMap<String , Integer> hash = new HashMap<>();
    
    for (String string:newstrings) {
        
        hash.put(string, hash.getOrDefault(string, 0)+1);    
    }
    for (int i=0; i<newqueries.length; i++){
            
            results[i] = hash.getOrDefault(newqueries[i], 0);
        }
        System.out.println(results);
        List<Integer> list = Arrays.stream(results).boxed().collect(Collectors.toList());
        
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Sparse_Arrays.matchingStrings(strings, queries);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}