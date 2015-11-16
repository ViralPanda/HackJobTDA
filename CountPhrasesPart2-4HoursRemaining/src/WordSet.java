import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Program to create a set of frequently used English words that are not
 * relevant to our resume/job ad program.
 *
 * @author Charlette Lin, Katie Dragga, Viral Patel
 * @version 20151114
 */

public class WordSet {

    // public constructor
    public WordSet() {
    }

    public Set<String> returnSet() {
        Set commonWordSet = new HashSet<String>();
        BufferedReader input = null;

        // attempt to open file; throw error if it fails
        try {
            input = new BufferedReader(new FileReader("data/commonWords"));
            String line;
            while ((line = input.readLine()) != null) {
                commonWordSet.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close commonWords file
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return commonWordSet;
    }
}
