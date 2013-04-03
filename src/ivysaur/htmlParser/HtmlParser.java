package ivysaur.htmlParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParser {

    private File input;
    private Document doc;
    private ArrayList<String> healPointsString;
    private ArrayList<String> attackString;
    private ArrayList<String> defenseString;
    private ArrayList<String> specialAttackString;
    private ArrayList<String> specialDefenseString;
    private ArrayList<String> speedString;
    private ArrayList<String> imagesString;

    public HtmlParser() throws IOException {
        input = new File("./html/pokemonBaseStat.htm");
        doc = Jsoup.parse(input, "UTF-8");
        extractAllStatsText();
    }

    private Elements findStat(String cssQuery) {
        return doc.select(cssQuery);
    }

    private ArrayList<String> extractStat(Elements elements) {
        ArrayList<String> stringArray = new ArrayList<>();
        for (Element element : elements) {
            stringArray.add(element.text());
        }
        return stringArray;
    }

    private ArrayList<String> extractImageUrl(Elements elements) {
        ArrayList<String> stringArray = new ArrayList<>();
        for (Element element : elements) {
            stringArray.add(element.attr("src"));
        }
        return stringArray;
    }

    private void extractAllStatsText() {
        healPointsString = extractStat(findStat("td[style=background:#FF5959]"));
        attackString = extractStat(findStat("td[style=background:#F5AC78]"));
        defenseString = extractStat(findStat("td[style=background:#FAE078]"));
        specialAttackString = extractStat(findStat("td[style=background:#9DB7F5]"));
        specialDefenseString = extractStat(findStat("td[style=background:#A7DB8D]"));
        speedString = extractStat(findStat("td[style=background:#FA92B2]"));
        imagesString = extractImageUrl(findStat("img[src*=http://cdn.bulbagarden.net/upload/][width=32][height=32]"));
    }

    public ArrayList<String> getHealPointsString() {
        return healPointsString;
    }

    public ArrayList<String> getAttackString() {
        return attackString;
    }

    public ArrayList<String> getDefenseString() {
        return defenseString;
    }

    public ArrayList<String> getSpecialAttackString() {
        return specialAttackString;
    }

    public ArrayList<String> getSpecialDefenseString() {
        return specialDefenseString;
    }

    public ArrayList<String> getSpeedString() {
        return speedString;
    }

    public ArrayList<String> getImagesString() {
        return imagesString;
    }
}
