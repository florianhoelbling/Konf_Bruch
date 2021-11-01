public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        // TODO: Setzen Sie die Attribute entsprechend
        this.numerator = numerator; // set numerator value from parameter
        this.denominator = denominator; // set denominator value from parameter
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        return (double) numerator / denominator; // fraction to decimal
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        return numerator + " / " + denominator; // returning fraction string
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
         *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
         *   => Übergeben Sie im Konstruktur für numerator den
         *       eigenen numerator multipliziert mit b2.getNumerator()
         *   => Selbige auch für denominator
         *  Retournieren Sie ihre neue Bruch-Variable
         * */
        int num = this.numerator * b2.getNumerator(); // multiply numeration with numeration from parameter
        int den = this.denominator * b2.getDenominator(); // multiply denominator with denominator from parameter

        return new Bruch(num, den); // creating new fraction and returning
    }

    public Bruch multiplicate(Bruch b2, Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3

        int num = this.numerator * b2.getNumerator() * b3.getNumerator(); // multiply numeration with numeration from parameter
        int den = this.denominator * b2.getDenominator() * b3.getDenominator(); // multiply denominator with denominator from parameter

        return new Bruch(num, den); // creating new fraction and returning
    }
}
