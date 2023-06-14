/*
Klasse Legostein mit 3 Felder (Parameters)
 */
public class LegoStein {

    private float groesseX; /* Float anstatt int, weil theoretisch hier die Werte werden statt Ganzzahlen als Gleitkommazahlen definiert */
    private float groesseY; /* Ich muss dann die Werte für Datentyp float mit "f" am Ende bezeichnen? */
    private String farbe; /* String hier, weil Farbe wird als Zeichenkette (Wort) bezeichnet */

    /* Konstruktor für LegoSteine mit 3 Felder (Parameters). Konstruktor ist ein Teil der Klasse LegoStein */
    public LegoStein (float groesseX, float groesseY, String farbe){
        this.groesseX = groesseX;
        this.groesseY = groesseY;
        this.farbe = farbe;
    }
}
