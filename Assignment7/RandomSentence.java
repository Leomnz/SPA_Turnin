import com.sun.jdi.request.StepRequest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RandomSentence {
    public static ArrayList<String> uploadFile(String filename) throws FileNotFoundException {

        String token1 = "";
        System.out.println(filename);

        Scanner inFile1 = new Scanner(new File("src/"+filename));
        ArrayList<String> temps = new ArrayList<String>();

        // while loop
        while (inFile1.hasNext()) {
            token1 = inFile1.next().replaceAll("[^\\p{IsAlphabetic}]", "").toLowerCase();
            if(token1!=""||token1!=" "||token1!=null){
                temps.add(token1);
            }
        }

        inFile1.close();


        return temps;

    }

    public static HashMap<String, ArrayList<String>> trainData(ArrayList<String> text){
        HashMap<String, ArrayList<String>> dictionary = new HashMap<String, ArrayList<String>>();

        for(int i = 0;i<text.size()-2;i++){
            if(dictionary.containsKey(text.get(i))){
                dictionary.get(text.get(i)).add(text.get(i+1));
            }
            else{
                dictionary.computeIfAbsent(text.get(i),k -> new ArrayList<String>()).add(text.get(i+1));
            }
        }
        //Do your thing


        return dictionary;
    }

    public static String generateSentence(HashMap<String, ArrayList<String>> dictionary, ArrayList<String> textData) {
        Random rand = new Random();
        int h = rand.nextInt(dictionary.size());
        String result = "";
        String previous = textData.get(rand.nextInt(textData.size()-1));
        for(int i = 0;i<10;i++){
            result = result+" "+(dictionary.get(previous).get(rand.nextInt(dictionary.get(previous).size())));
        }
        return result;
    }
}
