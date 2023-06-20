import java.util.ArrayList;
import java.util.List;

public class Schachtel {
    /*
    Klasse Schachtel muss folgende Eigenschaften enthalten:
    -Fächerliste die enthält 4 Fächer für rot, blau, grün und gelb
    -Methode addLegoStein
    */
    private List <Fach> faecherliste = new ArrayList<Fach>();
    public List <Fach> getFaecherliste(){
        return this.faecherliste;
    }

    public void addFach (Fach fach){
        this.faecherliste.add(fach);
    }
    public void addLegoStein (LegoStein legoStein){ //name von Methode und Parameter dafür
        for (Fach fach: faecherliste){          //Start von Schleife, die muss FaecherListe durchgehen
            if(fach.ob_LegoStein_passt_zu_Fach(legoStein)){     //und für jedes einzelnes Fach es prüft ob farbe von Fach stimmt mit Farbe von Legostein mithilfe Methode "passt"
                fach.addLegoStein(legoStein);                        //hier wird eines Legostein in einem Fach hinzugefügt
                return;
            }
        }
    }
}
