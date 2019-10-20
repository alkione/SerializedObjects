import java.io.*;

public class ArchiwatorStanuGry {
    public static void main (String[] args) {
        Bohater postac1 = new Bohater(50, "Elf", new String[] {"łuk", "miesz", "pył"});
        Bohater postac2 = new Bohater(200, "Trol", new String[] {"pięści", "wielki topór"});
        Bohater postac3 = new Bohater(120, "Magik", new String[] {"czary", "niewidzialność"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Gra.ser"));
            os.writeObject(postac1);
            os.writeObject(postac2);
            os.writeObject(postac3);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        postac1 = null;
        postac2 = null;
        postac3 = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Gra.ser"));
            Bohater p1 = (Bohater) is.readObject();
            Bohater p2 = (Bohater) is.readObject();
            Bohater p3 = (Bohater) is.readObject();

            System.out.println("typ postaci 1.:" + p1.getTyp());
            System.out.println("typ postaci 2.:" + p2.getTyp());
            System.out.println("typ postaci 3.:" + p3.getTyp());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
