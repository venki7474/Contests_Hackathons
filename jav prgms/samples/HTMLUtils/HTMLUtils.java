import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLUtils {
  private HTMLUtils() {}

  public static List<String>extractLinks(String url) throws IOException {
    final ArrayList<String> result = new ArrayList<String>();

    Document doc = Jsoup.connect(url).get();

    Elements links = doc.select("a[href]");
    // href ...
    for (Element link : links) {
      result.add(link.attr("abs:href"));
    }
    return result;
  }


  public final static void main(String[] args) throws Exception{
    String site = "http://minigoogle.msitprogram.net/";
    List<String> links = HTMLUtils.extractLinks(site);
    for (String link : links) {
      System.out.println(link);
    }
  }
}