package lab4.QF;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import lab4.QuadraticFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class QuadraticFunctionWithInputFileJU5Test {

    @Test
    void testFunctionHasTwoZeroPlaces(){
        ArrayList<ArrayList<Integer>> data = fileToDataList("src/test/java/lab4/QF/files/2Places.txt");
        for (ArrayList<Integer> arguments : data) {
            QuadraticFunction qf = new QuadraticFunction(arguments.get(0), arguments.get(1), arguments.get(2));
            assertNotEquals(qf.getX1(), qf.getX2(), 0);
        }
    }

    @Test
    void testFunctionHasOneZeroPlace(){
        ArrayList<ArrayList<Integer>> data = fileToDataList("src/test/java/lab4/QF/files/1Place.txt");
        for (ArrayList<Integer> arguments : data) {
            QuadraticFunction qf = new QuadraticFunction(arguments.get(0), arguments.get(1), arguments.get(2));
            assertEquals(qf.getX1(), qf.getX2(), 0);
        }
    }

    @Test
    void testFunctionHasNoZeroPlaces(){
        ArrayList<ArrayList<Integer>> data = fileToDataList("src/test/java/lab4/QF/files/0Places.txt");
        for (ArrayList<Integer> arguments : data) {
            Assertions.assertThrows(IllegalArgumentException.class, () -> new QuadraticFunction(arguments.get(0), arguments.get(1), arguments.get(2)));
        }
    }

    private ArrayList<ArrayList<Integer>> fileToDataList(String path){
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        try{
            BufferedReader rdr = new BufferedReader(new FileReader(path));
            String line;
            while((line = rdr.readLine()) != null) {
                data.add(stringToList(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private ArrayList<Integer> stringToList(String line){
        StringTokenizer st = new StringTokenizer(line);
        ArrayList<Integer> arguments = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arguments.add(Integer.valueOf(st.nextToken()));
        }
        return arguments;
    }
}