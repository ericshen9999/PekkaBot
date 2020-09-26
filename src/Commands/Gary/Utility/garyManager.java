package Commands.Gary.Utility;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class garyManager {
    private static Map<String, String> garyFile = new HashMap<>();

    public static void initialize() {
        garyFile.put("may","assets/Gary/gariyu1.png");
        garyFile.put("prai","assets/Gary/gariyu2.png");
        garyFile.put("rufus","assets/Gary/gariyu3.png");
        garyFile.put("darunis","assets/Gary/gariyu4.png");
        garyFile.put("parisa","assets/Gary/gariyu5.png");
        garyFile.put("foran","assets/Gary/gariyu6.png");
        garyFile.put("nomar","assets/Gary/gariyu7.png");
        garyFile.put("soira","assets/Gary/gariyu8.png");
        garyFile.put("komachi","assets/Gary/gariyu9.png");
        garyFile.put("lingli","assets/Gary/gariyu10.png");
        garyFile.put("rovella","assets/Gary/gariyu11.png");
        garyFile.put("cyuca","assets/Gary/gariyu12.png");
        garyFile.put("miranda","assets/Gary/gariyu13.png");
        garyFile.put("denny","assets/Gary/gariyu14.png");
        garyFile.put("benedict","assets/Gary/gariyu15.png");
        garyFile.put("otoha","assets/Gary/gariyu16.png");
        garyFile.put("nikeh","assets/Gary/gariyu17.png");
        garyFile.put("akane","assets/Gary/gariyu18.png");
        garyFile.put("akane as","assets/Gary/gariyu19.png");
        garyFile.put("nikeh as","assets/Gary/gariyu20.png");
        garyFile.put("myron","assets/Gary/gariyu21.png");
        garyFile.put("breeno","assets/Gary/gariyu22.png");
        garyFile.put("pom","assets/Gary/gariyu23.png");
        garyFile.put("lele","assets/Gary/gariyu24.png");
        garyFile.put("kreevo","assets/Gary/gariyu25.png");
        garyFile.put("sevyn","assets/Gary/gariyu26.png");
        garyFile.put("bivette","assets/Gary/gariyu27.png");
        garyFile.put("amy","assets/Gary/gariyu28.png");
        garyFile.put("suzette","assets/Gary/gariyu29.png");
        garyFile.put("aldo","assets/Gary/gariyu30.png");
        garyFile.put("helena","assets/Gary/gariyu31.png");
        garyFile.put("miyu","assets/Gary/gariyu32.png");
        garyFile.put("shion","assets/Gary/gariyu33.png");
        garyFile.put("toova","assets/Gary/gariyu34.png");
        garyFile.put("mariel","assets/Gary/gariyu35.png");
        garyFile.put("nero","assets/Gary/gariyu36.png");
        garyFile.put("deirdre","assets/Gary/gariyu37.png");
        garyFile.put("laclair","assets/Gary/gariyu38.png");
        garyFile.put("anabel","assets/Gary/gariyu39.png");
        garyFile.put("isuka","assets/Gary/gariyu40.png");
        garyFile.put("azami","assets/Gary/gariyu41.png");
        garyFile.put("jade","assets/Gary/gariyu42.png");
        garyFile.put("ruina","assets/Gary/gariyu43.png");
        garyFile.put("lovina","assets/Gary/gariyu44.png");
        garyFile.put("yuna","assets/Gary/gariyu45.png");
        garyFile.put("ewan","assets/Gary/gariyu46.png");
        garyFile.put("chiyo","assets/Gary/gariyu47.png");
        garyFile.put("cerrine","assets/Gary/gariyu48.png");
        garyFile.put("cetie","assets/Gary/gariyu49.png");
        garyFile.put("nonold","assets/Gary/gariyu50.png");
        garyFile.put("zilva","assets/Gary/gariyu51.png");
        garyFile.put("melina","assets/Gary/gariyu52.png");
        garyFile.put("good macky","assets/Gary/gariyu53.png");
        garyFile.put("guildna","assets/Gary/gariyu54.png");
        garyFile.put("suzette as","assets/Gary/gariyu55.png");
        garyFile.put("felmina","assets/Gary/gariyu56.png");
        garyFile.put("bertrand","assets/Gary/gariyu57.png");
        garyFile.put("tsukiha","assets/Gary/gariyu58.png");
        garyFile.put("claude","assets/Gary/gariyu59.png");
        garyFile.put("isuka as","assets/Gary/gariyu60.png");
        garyFile.put("shannon","assets/Gary/gariyu61.png");
        garyFile.put("saki as","assets/Gary/gariyu62.png");
        garyFile.put("renri","assets/Gary/gariyu63.png");
        garyFile.put("elga","assets/Gary/gariyu64.png");
        garyFile.put("toova as","assets/Gary/gariyu65.png");
        garyFile.put("veina","assets/Gary/gariyu66.png");
        garyFile.put("dewey","assets/Gary/gariyu67.png");
        garyFile.put("shion as","assets/Gary/gariyu68.png");
        garyFile.put("nopaew","assets/Gary/gariyu69.png");
        garyFile.put("ilulu","assets/Gary/gariyu70.png");
        garyFile.put("lucklair as","assets/Gary/gariyu71.png");
        garyFile.put("hozuki","assets/Gary/gariyu72.png");
        garyFile.put("galliard","assets/Gary/gariyu73.png");
        garyFile.put("melina as","assets/Gary/gariyu74.png");
        garyFile.put("biaka","assets/Gary/gariyu75.png");
        garyFile.put("joker","assets/Gary/gariyu76.png");
        garyFile.put("tsubame","assets/Gary/gariyu77.png");
        garyFile.put("shigure","assets/Gary/gariyu78.png");
        garyFile.put("morgana","assets/Gary/gariyu79.png");
        garyFile.put("lovely","assets/Gary/gariyu80.png");
        garyFile.put("nagi as","assets/Gary/gariyu81.png");
        garyFile.put("rosetta","assets/Gary/gariyu82.png");
        garyFile.put("philo","assets/Gary/gariyu83.png");
        garyFile.put("lokido as","assets/Gary/gariyu84.png");
        garyFile.put("hismena","assets/Gary/gariyu85.png");
        garyFile.put("dunarith","assets/Gary/gariyu86.png");
        garyFile.put("mana","assets/Gary/gariyu87.png");
        garyFile.put("ruina as","assets/Gary/gariyu88.png");
        garyFile.put("kikyo","assets/Gary/gariyu89.png");
        garyFile.put("mariel as","assets/Gary/gariyu90.png");
        garyFile.put("shanie as","assets/Gary/gariyu91.png");
        garyFile.put("altema","assets/Gary/gariyu92.png");
        garyFile.put("felmina as","assets/Gary/gariyu93.png");
        garyFile.put("cetie as","assets/Gary/gariyu94.png");
        garyFile.put("myunfa","assets/Gary/gariyu95.png");
        garyFile.put("tiramisu","assets/Gary/gariyu96.png");
        garyFile.put("elga as","assets/Gary/gariyu97.png");
        garyFile.put("renri as","assets/Gary/gariyu98.png");
        garyFile.put("myrus as","assets/Gary/gariyu99.png");
        garyFile.put("zeviiro","assets/Gary/gariyu100.png");
        garyFile.put("radius","assets/Gary/gariyu101.png");
        garyFile.put("bria","assets/Gary/gariyu102.png");
        garyFile.put("anabel as","assets/Gary/gariyu103.png");
        garyFile.put("cynthia","assets/Gary/gariyu104.png");
        garyFile.put("shannon as","assets/Gary/gariyu105.png");
        garyFile.put("veina as","assets/Gary/gariyu106.png");
        garyFile.put("???","assets/Gary/gariyu107.png");
        garyFile.put("cyrus","assets/Gary/gariyu108.png");
        garyFile.put("raven","assets/Gary/gariyu109.png");
        garyFile.put("riica","assets/Gary/gariyu110.png");
        garyFile.put("feinne","assets/Gary/gariyu111.png");
        garyFile.put("lokido","assets/Gary/gariyu112.png");
        garyFile.put("ciel","assets/Gary/gariyu113.png");
        garyFile.put("mighty","assets/Gary/gariyu114.png");
        garyFile.put("samora","assets/Gary/gariyu115.png");
        garyFile.put("saki","assets/Gary/gariyu116.png");
        garyFile.put("nagi","assets/Gary/gariyu117.png");
        garyFile.put("shelia","assets/Gary/gariyu118.png");
        garyFile.put("erina","assets/Gary/gariyu119.png");
        garyFile.put("radica","assets/Gary/gariyu120.png");
        garyFile.put("premaya","assets/Gary/gariyu121.png");
        garyFile.put("mighty as","assets/Gary/gariyu122.png");
        garyFile.put("yazuku","assets/Gary/gariyu123.png");
        garyFile.put("levia","assets/Gary/gariyu124.png");
        garyFile.put("shanie","assets/Gary/gariyu125.png");
        garyFile.put("myrus","assets/Gary/gariyu126.png");
        garyFile.put("yuna as","assets/Gary/gariyu127.png");
        garyFile.put("yio","assets/Gary/gariyu128.png");
        garyFile.put("claude as","assets/Gary/gariyu129.png");
        garyFile.put("sophia","assets/Gary/gariyu130.png");
        garyFile.put("hardy","assets/Gary/gariyu131.png");
        garyFile.put("ciel as","assets/Gary/gariyu132.png");
        garyFile.put("foran as","assets/Gary/gariyu133.png");
        garyFile.put("chiruriru","assets/Gary/gariyu134.png");
        garyFile.put("victor","assets/Gary/gariyu135.png");
        garyFile.put("clarte","assets/Gary/gariyu136.png");
        garyFile.put("mistrea","assets/Gary/gariyu137.png");
        garyFile.put("tsukiha as","assets/Gary/gariyu138.png");
        garyFile.put("yukino","assets/Gary/gariyu139.png");
        garyFile.put("hiina","assets/Gary/gariyu140.png");
        garyFile.put("rosetta as","assets/Gary/gariyu141.png");
        garyFile.put("bertrand as","assets/Gary/gariyu142.png");
        garyFile.put("aoife","assets/Gary/gariyu143.png");
        garyFile.put("hozuki as","assets/Gary/gariyu144.png");
    }
    public static File callMe(String message, boolean name){
        File file;
        if(name){
            file = new File(findMe(message));
        } else {
            int rand = new Random().nextInt(144) + 1;
            file = new File("assets/Gary/gariyu" + rand + ".png");
        }
        return file;
    }
    public static String findMe(String unit){
        if(garyFile.containsKey(unit)){
            return garyFile.get(unit);
        } else {
            return "assets/Gary/gariyu107.png";
        }
    }
}