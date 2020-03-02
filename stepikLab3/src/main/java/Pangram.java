import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pangram {
    public boolean check(String inputString) {

        if(inputString == null)
            throw new IllegalArgumentException();
        if(inputString == "")
            throw new IllegalArgumentException();

        char[] chars = inputString.toLowerCase().toCharArray();

        int alphabetSize = 'z' - 'a' + 1;
        boolean[] crossedOut = new boolean[alphabetSize];
        Arrays.fill(crossedOut, Boolean.FALSE);

        int startOfAsciiLetters = 'a';
        for (char sign : chars) {
            if (Character.isDigit(sign))
                throw new IllegalArgumentException();
            if(Character.isLetter(sign)){
                crossedOut[sign - startOfAsciiLetters] = true;
            }
        }

        for (boolean value : crossedOut) {
            if(!value){
                return false;
            }
        }
        return true;
    }

    public List<Boolean> checkList(List<String> input){
        List<Boolean> output = new ArrayList<Boolean>();
        for (String string : input) {
            output.add(check(string));
        }
        return output;
    }
}