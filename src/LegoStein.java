/*
Klasse Legostein mit 3 Felder (Parameters)
 */
public class LegoStein {

    private int groesseX; /* +nicht aktuell+ Float anstatt int, weil theoretisch hier die Werte werden statt Ganzzahlen als Gleitkommazahlen definiert */
    private int groesseY; /* +nicht aktuell+ Ich muss dann die Werte für Datentyp float mit "f" am Ende bezeichnen? */
    private String Farbe_des_LegoSteines; /* String hier, weil Farbe wird als Zeichenkette (Wort) bezeichnet */

    /* Konstruktor für LegoSteine mit 3 Felder (Parameters). Konstruktor ist ein Teil der Klasse LegoStein */
    public LegoStein (int groesseX, int groesseY, String Farbe_des_LegoSteines){
        this.groesseX = groesseX;
        this.groesseY = groesseY;
        this.Farbe_des_LegoSteines = Farbe_des_LegoSteines;
    }
    /*Getter Methoden*/
    public String get_Farbe_des_LegoSteines(){
        return Farbe_des_LegoSteines;
    }
    public int get_Groesse_X(){
        return groesseX;
    }
    public int get_Groesse_Y(){
        return groesseY;
    }

}
