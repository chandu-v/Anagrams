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



class Result {

    /*
     * Complete the 'calculateScore' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING text
     *  2. STRING prefixString
     *  3. STRING suffixString
     */

    public static String calculateScore(String text, String prefixString, String suffixString) {
        String result = "";
        String suffixResultString = "";
        String prefixResulString = "";
        char [] textChar = text.toCharArray();
        char [] preChar = prefixString.toCharArray();
        char [] suffChar = suffixString.toCharArray();
        int j = preChar.length ;
        int prefixScore = 0 ;
        // PrefixScore
        for(int i = 0 ; i < textChar.length ; i++){
            if(j-i<0){
                break;
            }
            System.out.println(text.substring(0, i)+"\t"+prefixString.substring(j-i, j));
            // Compare text.subString(0,i) with prefixString.subString(j-i,j);
            if(text.substring(0, i).equalsIgnoreCase(prefixString.substring(j-i, j))){
                System.out.println("Equals");
                prefixResulString = text.substring(0, i);
                prefixScore++;
            }

        }

        // SuffixScore
        for(int i = 0 ; i < textChar.length ; i++){
            if(j-i<0){
                break;
            }
            System.out.println(text.substring(0, i)+"\t"+prefixString.substring(j-i, j));
            // Compare text.subString(0,i) with prefixString.subString(j-i,j);
            if(suffixString.substring(0, i).equalsIgnoreCase(text.substring(j-i, j))){
                System.out.println("Equals");
                suffixResultString = text.substring(j-i, j);
                prefixScore++;
            }

        }

        if(prefixResulString.length() > suffixResultString.length())
        return prefixResulString;
        else
        return suffixResultString;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner in = new Scanner(System.in);

        String text = in.next();

        String prefixString = in.next();

        String suffixString = in.next();

        String result = Result.calculateScore(text, prefixString, suffixString);

        System.out.println(result);
        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
