package ivysaur.dataExtractor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlExtractor {

    private File input;
    private Document doc;
    
    private ArrayList<String> idString;
    private ArrayList<String> nameString;
    private ArrayList<String> healPointsString;
    private ArrayList<String> attackString;
    private ArrayList<String> defenseString;
    private ArrayList<String> specialAttackString;
    private ArrayList<String> specialDefenseString;
    private ArrayList<String> speedString;
    private ArrayList<String> imagesString;

    public HtmlExtractor(){
        try {
            input = new File("../IVysaurHTML/pokemonBaseStat.htm");
            doc = Jsoup.parse(input, "UTF-8");
            extractAllStatsText();
        } catch (IOException ex) {
            Logger.getLogger(HtmlExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private ArrayList<String> extractAttribute(Elements elements,String attribute) {
        ArrayList<String> stringArray = new ArrayList<>();
        for (Element element : elements) {
            stringArray.add(element.attr(attribute));
        }
        return stringArray;
    }

    private void extractAllStatsText() {
        idString = extractStat(findStat("td[align=right]"));
        nameString = extractStat(findStat("a[title*=(Pokémon)"));
        healPointsString = extractStat(findStat("td[style=background:#FF5959]"));
        attackString = extractStat(findStat("td[style=background:#F5AC78]"));
        defenseString = extractStat(findStat("td[style=background:#FAE078]"));
        specialAttackString = extractStat(findStat("td[style=background:#9DB7F5]"));
        specialDefenseString = extractStat(findStat("td[style=background:#A7DB8D]"));
        speedString = extractStat(findStat("td[style=background:#FA92B2]"));
        imagesString = extractAttribute(findStat("img[src*=http://cdn.bulbagarden.net/upload/][width=32][height=32]"),"src");
    }

    public ArrayList<String> getIdString() {
        return idString;
    }

    public ArrayList<String> getNameString() {
        return nameString;
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
