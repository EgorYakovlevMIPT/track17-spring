package track.lessons.lesson1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 
 *
 */

public class CountWords {

    public long countNumbers(File file) throws Exception {
        FileReader reader = new FileReader(file);
        BufferedReader in = new BufferedReader(reader);
        StringBuilder str = new StringBuilder();
        int currentNum = 0;
        String st;
        while ((st = in.readLine()) != null) {
            currentNum = currentNum + Integer.parseInt(st);
        }
        in.close();
        return currentNum;
    }

    public String concatWords(File file) throws Exception {
        FileReader reader = new FileReader(file);
        BufferedReader in = new BufferedReader(reader);
        StringBuilder str = new StringBuilder();
        int num = 0;
        String st;
        while ((st = in.readLine()) != null) {
            try {
                num = Integer.parseInt(st);
            } catch (NumberFormatException e) {
                if (!"".equals(st.trim())) {
                    str.append(st.trim() + " ");
                }
            }
        }
        in.close();
        return str.toString();
    }

}
