import java.io.Serializable;

public class Bohater implements Serializable {
    int moc;
    String typ;
    String[] bronie;

    public Bohater(int m, String t, String[] b) {
        this.moc = m;
        this.typ = t;
        this.bronie = b;
    }

    public int getMoc() {
        return moc;
    }

    public String getTyp() {
        return typ;
    }

    public String getBronie() {
        String listaBroni = "";
        for (int i = 0; i < bronie.length; i++) {
            listaBroni += bronie[i] + " ";
        }
        return listaBroni;
    }
}
