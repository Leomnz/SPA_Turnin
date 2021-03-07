import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> textData = RandomSentence.uploadFile("book_1.txt");
        System.out.println(textData);
        HashMap<String, ArrayList<String>> trainedData = RandomSentence.trainData(textData);
        for (String name: trainedData.keySet()){
            String key = name.toString();
            String value = trainedData.get(name).toString();
            System.out.println(key + " " + value);
        }
        for(int i = 1; i<=5;i++){
            System.out.println("Random Sentence "+i);
            System.out.println(RandomSentence.generateSentence(trainedData,textData));
        }
    }
}
