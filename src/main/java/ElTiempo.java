import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


import java.io.IOException;

public class ElTiempo {

public static void main(String[] args) throws IOException {

    Document doc = Jsoup.connect("http://www.google.com").userAgent("Mozilla").get();
    Element miElemento = doc.select("div").first();
    String miTexto = miElemento.text();
    System.out.println(miTexto);
}

}
