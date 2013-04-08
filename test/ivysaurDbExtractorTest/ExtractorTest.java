package ivysaurDbExtractorTest;

import ivysaur.dataExtractor.HtmlExtractor;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;

public class ExtractorTest {

    @Test
    public void gettingDataTest() throws IOException {
        HtmlExtractor htmlExtractor = new HtmlExtractor();
        ArrayList<String> idString= htmlExtractor.getIdString();
        ArrayList<String> nameString= htmlExtractor.getNameString();
        ArrayList<String> healPointsString= htmlExtractor.getHealPointsString();
        ArrayList<String> attackString= htmlExtractor.getAttackString();
        ArrayList<String> defenseString=htmlExtractor.getDefenseString();
        ArrayList<String> specialAttackString=htmlExtractor.getSpecialAttackString();
        ArrayList<String> specialDefenseString=htmlExtractor.getSpecialDefenseString();
        ArrayList<String> speedString=htmlExtractor.getSpeedString();
        ArrayList<String> imageStringUrl=htmlExtractor.getImagesString();

        System.out.print("Break");
    }
}
