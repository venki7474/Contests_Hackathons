import java.net.*;
import java.io.*;
import java.lang.*;

public class URLReader {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        URL google = new URL("http://minigoogle.msitprogram.net/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(google.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	sb.append(inputLine);
        }
        String pc = sb.toString().replaceAll("\\<[^>,();]*>","");
            //System.out.println(pc); 
        in.close();
        String[] words = pc.split("\\s+");
        for(int i =0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]","");
            System.out.println(words[i]);
        }
    }
}