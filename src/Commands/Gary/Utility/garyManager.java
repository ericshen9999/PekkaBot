package Commands.Gary.Utility;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class garyManager {
    private static Map<String, String> garyFile = new HashMap<>();

    public static void initialize() {
        garyFile.put("may","https://i.imgur.com/Afmxg6B.png");
        garyFile.put("prai","https://i.imgur.com/r6nGV9w.png");
        garyFile.put("rufus","https://i.imgur.com/incFa4k.png");
        garyFile.put("darunis","https://i.imgur.com/DCxG1Iw.png");
        garyFile.put("parisa","https://i.imgur.com/Ve2PuPH.png");
        garyFile.put("foran","https://i.imgur.com/IQ7Y2XQ.png");
        garyFile.put("nomar","https://i.imgur.com/c89ceDS.png");
        garyFile.put("soira","https://i.imgur.com/0KBk4rq.png");
        garyFile.put("komachi","https://i.imgur.com/SBa82Qn.png");
        garyFile.put("lingli","https://i.imgur.com/mLLKUWf.png");
        garyFile.put("rovella","https://i.imgur.com/TXSyFfn.png");
        garyFile.put("cyuca","https://i.imgur.com/vUJlL03.png");
        garyFile.put("miranda","https://i.imgur.com/Fu6PbUm.png");
        garyFile.put("denny","https://i.imgur.com/dzEU0ut.png");
        garyFile.put("benedict","https://i.imgur.com/AZ1eBoX.png");
        garyFile.put("otoha","https://i.imgur.com/mCeaxCz.png");
        garyFile.put("nikeh","https://i.imgur.com/QKO3ucb.png");
        garyFile.put("akane","https://i.imgur.com/MijpYYI.png");
        garyFile.put("akane as","https://i.imgur.com/uhrSDuw.png");
        garyFile.put("nikeh as","https://i.imgur.com/umA5QAg.png");
        garyFile.put("myron","https://i.imgur.com/xlfVix8.png");
        garyFile.put("breeno","https://i.imgur.com/tTegxJQ.png");
        garyFile.put("pom","https://i.imgur.com/1TsRF6Q.png");
        garyFile.put("lele","https://i.imgur.com/diKdhcq.png");
        garyFile.put("kreevo","https://i.imgur.com/n1k4TvG.png");
        garyFile.put("sevyn","https://i.imgur.com/dQuUVNK.png");
        garyFile.put("bivette","https://i.imgur.com/ih6HJ7S.png");
        garyFile.put("amy","https://i.imgur.com/IrzZyMb.png");
        garyFile.put("suzette","https://i.imgur.com/P7osbW7.png");
        garyFile.put("aldo","https://i.imgur.com/QTdtVJg.png");
        garyFile.put("helena","https://i.imgur.com/XzSJiNb.png");
        garyFile.put("miyu","https://i.imgur.com/SBVaUMe.png");
        garyFile.put("shion","https://i.imgur.com/veHmT72.png");
        garyFile.put("toova","https://i.imgur.com/L62LD8S.png");
        garyFile.put("mariel","https://i.imgur.com/ahcejA0.png");
        garyFile.put("nero","https://i.imgur.com/xorW8L3.png");
        garyFile.put("deirdre","https://i.imgur.com/ygRClih.png");
        garyFile.put("laclair","https://i.imgur.com/vdk0Ds0.png");
        garyFile.put("anabel","https://i.imgur.com/kLPImX7.png");
        garyFile.put("isuka","https://i.imgur.com/sZ3MRh5.png");
        garyFile.put("azami","https://i.imgur.com/pQLXf3L.png");
        garyFile.put("jade","https://i.imgur.com/1L1RwV0.png");
        garyFile.put("ruina","https://i.imgur.com/7ULq5Iv.png");
        garyFile.put("lovina","https://i.imgur.com/OJkZdml.png");
        garyFile.put("yuna","https://i.imgur.com/rS3bcCk.png");
        garyFile.put("ewan","https://i.imgur.com/ceY1YSU.png");
        garyFile.put("chiyo","https://i.imgur.com/Mo7COuv.png");
        garyFile.put("cerrine","https://i.imgur.com/C33WSbi.png");
        garyFile.put("cetie","https://i.imgur.com/R5fGXx2.png");
        garyFile.put("nonold","https://i.imgur.com/jQpw310.png");
        garyFile.put("zilva","https://i.imgur.com/065N93P.png");
        garyFile.put("melina","https://i.imgur.com/c4qAY2U.png");
        garyFile.put("good macky","https://i.imgur.com/vjAvg5r.png");
        garyFile.put("guildna","https://i.imgur.com/CmKKWR9.png");
        garyFile.put("suzette as","https://i.imgur.com/XBK8nvF.png");
        garyFile.put("felmina","https://i.imgur.com/58xllQy.png");
        garyFile.put("bertrand","https://i.imgur.com/fhnuIrJ.png");
        garyFile.put("tsukiha","https://i.imgur.com/udzGpTC.png");
        garyFile.put("claude","https://i.imgur.com/AxEvijl.png");
        garyFile.put("isuka as","https://i.imgur.com/Q3sZ3BK.png");
        garyFile.put("shannon","https://i.imgur.com/mB0v5zx.png");
        garyFile.put("saki as","https://i.imgur.com/hWOt01t.png");
        garyFile.put("renri","https://i.imgur.com/r1GfabQ.png");
        garyFile.put("elga","https://i.imgur.com/SucBDaK.png");
        garyFile.put("toova as","https://i.imgur.com/Fg5XYVp.jpg");
        garyFile.put("veina","https://i.imgur.com/pW3npDy.png");
        garyFile.put("dewey","https://i.imgur.com/iquVmxi.png");
        garyFile.put("shion as","https://i.imgur.com/T1jxp6b.png");
        garyFile.put("nopaew","https://i.imgur.com/Pu94aV8.png");
        garyFile.put("ilulu","https://i.imgur.com/AFd7PGw.png");
        garyFile.put("lucklair as","https://i.imgur.com/2IGRCwK.png");
        garyFile.put("hozuki","https://i.imgur.com/Vmw07Oc.png");
        garyFile.put("galliard","https://i.imgur.com/Ywy8aMu.png");
        garyFile.put("melina as","https://i.imgur.com/LyG6Y7c.png");
        garyFile.put("biaka","https://i.imgur.com/oNkyDob.png");
        garyFile.put("joker","https://i.imgur.com/KyU9Wu7.png");
        garyFile.put("tsubame","https://i.imgur.com/K7nbaE9.png");
        garyFile.put("shigure","https://i.imgur.com/Tka0e05.png");
        garyFile.put("morgana","https://i.imgur.com/e4Mvivn.png");
        garyFile.put("lovely","https://i.imgur.com/BewTiKL.png");
        garyFile.put("nagi as","https://i.imgur.com/sziVdvF.png");
        garyFile.put("rosetta","https://i.imgur.com/j1p5Tsc.png");
        garyFile.put("philo","https://i.imgur.com/0aogd4a.png");
        garyFile.put("lokido as","https://i.imgur.com/wRTDH0R.png");
        garyFile.put("hismena","https://i.imgur.com/4wbn8qe.png");
        garyFile.put("dunarith","https://i.imgur.com/gJg2kkY.png");
        garyFile.put("mana","https://i.imgur.com/ZwpNS2m.png");
        garyFile.put("ruina as","https://i.imgur.com/fqCQDoE.png");
        garyFile.put("kikyo","https://i.imgur.com/VbBl3Fh.png");
        garyFile.put("mariel as","https://i.imgur.com/3Z3PjJ9.png");
        garyFile.put("shanie as","https://i.imgur.com/UcB9n6b.png");
        garyFile.put("altema","https://i.imgur.com/2T50X4R.png");
        garyFile.put("felmina as","https://i.imgur.com/Vw7l0Ca.png");
        garyFile.put("cetie as","https://i.imgur.com/1DvXRTo.png");
        garyFile.put("myunfa","https://i.imgur.com/RHi4Rtf.png");
        garyFile.put("tiramisu","https://i.imgur.com/G13xVXF.png");
        garyFile.put("elga as","https://i.imgur.com/c9mSrqz.png");
        garyFile.put("renri as","https://i.imgur.com/yKtxtqd.png");
        garyFile.put("myrus as","https://i.imgur.com/13R5uXW.png");
        garyFile.put("zeviiro","https://i.imgur.com/Scjmk6B.png");
        garyFile.put("radius","https://i.imgur.com/hbQb1ov.png");
        garyFile.put("bria","https://i.imgur.com/ZFiAY6d.png");
        garyFile.put("anabel as","https://i.imgur.com/IwIbMa4.jpg");
        garyFile.put("cynthia","https://i.imgur.com/S9hsm0Z.png");
        garyFile.put("shannon as","https://i.imgur.com/u1YoDuq.png");
        garyFile.put("veina as","https://i.imgur.com/4BV0aAd.png");
        garyFile.put("???","https://i.imgur.com/FEC8CzC.png");
        garyFile.put("cyrus","https://i.imgur.com/pnRRH2O.png");
        garyFile.put("raven","https://i.imgur.com/iTutBid.png");
        garyFile.put("riica","https://i.imgur.com/aRvpFjs.png");
        garyFile.put("feinne","https://i.imgur.com/kj1rzLY.png");
        garyFile.put("lokido","https://i.imgur.com/7QZzAR2.png");
        garyFile.put("ciel","https://i.imgur.com/CtjNMRi.png");
        garyFile.put("mighty","https://i.imgur.com/DRlwNiH.png");
        garyFile.put("samora","https://i.imgur.com/9sYH5Ma.png");
        garyFile.put("saki","https://i.imgur.com/7MbmLTY.png");
        garyFile.put("nagi","https://i.imgur.com/xUBlqCy.png");
        garyFile.put("shelia","https://i.imgur.com/A6nNbqk.png");
        garyFile.put("erina","https://i.imgur.com/Sg8UNqX.png");
        garyFile.put("radica","https://i.imgur.com/P74VDlF.png");
        garyFile.put("premaya","https://i.imgur.com/kmAktav.png");
        garyFile.put("mighty as","https://i.imgur.com/6EQTE2d.png");
        garyFile.put("yazuku","https://i.imgur.com/mORVjbf.png");
        garyFile.put("levia","https://i.imgur.com/r8HUBdF.png");
        garyFile.put("shanie","https://i.imgur.com/yaUorfQ.png");
        garyFile.put("myrus","https://i.imgur.com/xQPXkeg.png");
        garyFile.put("yuna as","https://i.imgur.com/QaNuuLG.png");
        garyFile.put("yio","https://i.imgur.com/fy3qHo9.png");
        garyFile.put("claude as","https://i.imgur.com/822pXbL.png");
        garyFile.put("sophia","https://i.imgur.com/vgApxTs.png");
        garyFile.put("hardy","https://i.imgur.com/mAFS00X.png");
        garyFile.put("ciel as","https://i.imgur.com/t7h7iQ9.png");
        garyFile.put("foran as","https://i.imgur.com/Zwp6Poh.png");
        garyFile.put("chiruriru","https://i.imgur.com/71BxXeW.png");
        garyFile.put("victor","https://i.imgur.com/mCq6pWp.png");
        garyFile.put("clarte","https://i.imgur.com/mI8dc5k.png");
        garyFile.put("mistrea","https://i.imgur.com/ITZQLvu.png");
        garyFile.put("tsukiha as","https://i.imgur.com/EmewgOQ.png");
        garyFile.put("yukino","https://i.imgur.com/Qtci9vY.png");
        garyFile.put("hiina","https://i.imgur.com/Uy4zssE.png");
        garyFile.put("rosetta as","https://i.imgur.com/QaTfTqk.png");
        garyFile.put("bertrand as","https://i.imgur.com/EPEEJ3R.png");
        garyFile.put("aoife","https://i.imgur.com/ttuTVi8.png");
        garyFile.put("hozuki as","https://i.imgur.com/yvzHUrQ.png");
        garyFile.put("ilulu as","https://i.imgur.com/ERTxIC0.png");
        garyFile.put("ewan as","https://i.imgur.com/JDRvfP7.png");
        garyFile.put("mirusha","https://i.imgur.com/nlzoNiD.png");
        garyFile.put("violet","https://i.imgur.com/Pk3RbRD.png");
        garyFile.put("skull","https://i.imgur.com/zKfepX4.png");
        garyFile.put("hismena as","https://i.imgur.com/9XuocXc.png");
    }
    public static String callMe(String message, boolean name){
        String link;
        if(name){
            link = findMe(message);
        } else {
            Random rand = new Random();
            Object[] links = garyFile.values().toArray();
            link = (String) links[rand.nextInt(links.length)];
        }
        //System.out.println("Debug: " + link);
        return link;
    }
    public static String findMe(String unit){
        if(garyFile.containsKey(unit)){
            return garyFile.get(unit);
        }
        return garyFile.get("???");
    }
}
