package parserTest;

import ivysaur.htmlParser.HtmlParser;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;

public class ParserTest {

    @Test
    public void firstPngImgTest() throws IOException {
        HtmlParser htmlParser = new HtmlParser();
        ArrayList<String> healPointsString= htmlParser.getHealPointsString();
        ArrayList<String> attackString= htmlParser.getAttackString();
        ArrayList<String> defenseString=htmlParser.getDefenseString();
        ArrayList<String> specialAttackString=htmlParser.getSpecialAttackString();
        ArrayList<String> specialDefenseString=htmlParser.getSpecialDefenseString();
        ArrayList<String> speedString=htmlParser.getSpeedString();
        ArrayList<String> imageStringUrl=htmlParser.getImagesString();

        System.out.print("+");
    }
}
