import java.io.*;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/app/java/homework7/src/midterm_in1.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String content = line.replaceAll(" ", "").trim();
                if (content.length() != 0) {
                    char[] contentArr = content.toCharArray();
                    Arrays.sort(contentArr);
                    StringBuilder sorted = new StringBuilder();
                    sorted.append(contentArr);
                    sorted.reverse();
                    System.out.println(sorted);
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}