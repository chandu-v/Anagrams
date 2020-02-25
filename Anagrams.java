import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.next();
        int counter = 0;
        ArrayList<String> combinations = new ArrayList<>();
        for(int i = 0 ; i < input.length() ; i++){
            for(int k = i+1; k < input.length() ; k++){
                String e = input.substring(i, k);
                combinations.add(e);
            }
            counter++;
        }
        for(String s : combinations){
            System.out.println(s);
        }
        for(int i = 0; i < combinations.size(); i++){
            for(int j = i+1 ; j < combinations.size() ; j++){
                if(combinations.get(i).length() == combinations.get(j).length()){
                    System.out.println(combinations.get(i)+"\t"+combinations.get(j));
                }
            }
        }
        in.close();
        
    }
}