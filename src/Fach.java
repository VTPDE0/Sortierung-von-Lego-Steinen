import java.util.ArrayList;
import java.util.List;

public class Fach {
    private List <LegoStein> LegosteineListe=new ArrayList<LegoStein>(); /* eine Liste mit Datentyp "Legostein" ist gleich neue ArrayList von Datentyp Legostein (ohne Parameter) */
    private String farbe_des_Faches;
    private LegoStein legoStein;

    public Fach (String farbe_des_Faches){
        this.farbe_des_Faches = farbe_des_Faches;
    }

    public List<LegoStein> getLegosteineListe() {
        return LegosteineListe;
    }

    public String get_Farbe_des_Faches(){
        return farbe_des_Faches;
    }


    /*Dies ist die Methodendeklaration, die besagt, dass die Methode ob_LegoStein_passt_zu_Fach einen LegoStein als
    Parameter (legoStein ist der Name des Parameters, der hat Typ Legostein) akzeptiert und
    einen boolean-Wert zurückgibt (entweder true oder false).*/
    public boolean ob_LegoStein_passt_zu_Fach (LegoStein legoStein) {
        return legoStein.get_Farbe_des_LegoSteines().equals(this.farbe_des_Faches);
    }

    public void addLegoStein (LegoStein legoStein){
        LegosteineListe.add(legoStein);
    }
}
