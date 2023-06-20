import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fach fach1 = new Fach("rot"); /*Hier wird neues objekt fach1 von Klasse Fach erstellt*/
        Fach fach2 = new Fach("blau");
        Fach fach3 = new Fach("grün");
        Fach fach4 = new Fach("gelb");

        Schachtel schachtel_mit_faecher = new Schachtel(); /*Hier wird neues Objekt schachtel von Klasse Schachtel erstellt*/

        /*Hier werden 5 LegoSteine erstellt*/
        LegoStein LegoStein1 = new LegoStein(5, 3, "rot");
        LegoStein LegoStein2 = new LegoStein(2, 4, "blau");
        LegoStein LegoStein3 = new LegoStein(1, 1, "grün");
        LegoStein LegoStein4 = new LegoStein(7, 2, "gelb");
        LegoStein LegoStein5 = new LegoStein(4, 4, "rot");



        schachtel_mit_faecher.addFach(fach1);  /*Hier fügen wir Object fach1 zu der faecherListe*/
        schachtel_mit_faecher.addFach(fach2);
        schachtel_mit_faecher.addFach(fach3);
        schachtel_mit_faecher.addFach(fach4);


        schachtel_mit_faecher.addLegoStein(LegoStein1); /*Hier wird erster*/
        schachtel_mit_faecher.addLegoStein(LegoStein2);
        schachtel_mit_faecher.addLegoStein(LegoStein3);
        schachtel_mit_faecher.addLegoStein(LegoStein4);




        List<Fach> faecherListeSpeicherOrt = schachtel_mit_faecher.getFaecherliste();
        for (Fach fach: faecherListeSpeicherOrt){
            System.out.println("Fach 1 steht für die Farbe " + fach1.get_Farbe_des_Faches() + " bereit");

            for (LegoStein legoStein : fach.getLegosteineListe()) {
                System.out.println("Lego-Stein: GrößeX=" + legoStein.get_Groesse_X() + ", GrößeY=" + legoStein.get_Groesse_Y() + ", Farbe=" + legoStein.get_Farbe_des_LegoSteines());
            }
        }

    }

}