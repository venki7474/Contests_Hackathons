import java.io.*;
import java.util.*;
import java.lang.*;

public class FileRead {
	public static void main(String[] args) throws IOException {
	
	// StringBuilder sb = new StringBuilder();
 //      String str="";
 //      String fname = "SocialNetwork.txt";
 //      FileReader file = new FileReader(fname);
 //      FileInputStream in = new FileInputStream(new FileReader(inputStream.file));
 //      String inputLine;
 //      while((inputLine = in.readLine()) != null) {
 //          sb.append(inputLine);
 //      }
 //      str = sb.toString().replaceAll("\\<[^>,;]*>",""); 
 //      in.close();
 //      return str;

      // File file =new File("SocialNetwork.txt");
      // FileInputStream f1 = null;
      // try {
      // 		f1 = new FileInputStream(file);
      // 		int content;
      // 		while((content = f1.read()) != -1)
      // 		{
      // 			//if ((String)content != ('"' ) )
      // 			System.out.print((char)content);
      // 		}
      // } catch (Exception e){System.out.println(e);}
 		

 		FileReader file = new FileReader("SocialNetwork.txt");
 		BufferedReader reader = new BufferedReader(file);
 		StringBuilder sb = new StringBuilder();
 		while(reader.readLine() != null) {
 		String line = reader.readLine();
 		sb = sb .append(line);}
 		String str = "";
 		str = str + sb;
 		//System.out.println(str);

 		ArrayList<String> words = new ArrayList<String>();
 		words.add(str.split("\\s+"));
 		int i = 0;
 		int j = 0;
 		for (words.size() > j) {
 			//words[j] = words[j].replaceAll("[^\\w]","");
 			words.set(j,(words.get(j).replaceAll("[^\\w]","")));
 			// System.out.println(words[j]);
 			j++;

 		}
 		 for (String s : words) {
 		 	System.out.println(s);
 		 }




 	
  }

}

