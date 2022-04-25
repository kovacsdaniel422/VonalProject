package vonal;

public class Vonal {

    private int hossz, eltolas;
    private String szin, tipus;

    public Vonal() {
        this(1);
    }

    public Vonal(int hossz) {
        this(hossz, "Fekete");
    }

    public Vonal(int hossz, String szin) {
        this(hossz, szin, "Szimpla");
    }

    public Vonal(int hossz, String szin, String típus) {
        this(hossz, 0, szin, típus);
    }

    public Vonal(int hossz, int eltolas, String szin, String tipus) {
        this.hossz = hossz;
        this.eltolas = eltolas;
        this.szin = szin;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Vonal{" + "hossz=" + hossz + ", eltolas=" + eltolas + ", szin=" + szin + ", tipus=" + tipus + '}';
    }

    public void setHossz(int hossz) {
        if (hossz < 1) {
            hossz = 1;
        }
        this.hossz = hossz;
    }

    public void setEltolas(int eltolas) {
        if (eltolas < 1) {
            eltolas = 1;
        }
        this.eltolas = eltolas;
    }

    public void rajzol() {
        char jel;
        if (tipus.equals("pont")) {
            jel = '.';
        } else if (tipus.equals("dupla")) {
            jel = '=';
        } else if (tipus.equals("szaggatott")) {
            jel = '-';
        } else {
            jel = '_';
        }

        final String RESET = "\u001B[0m";
        String konzolSzin = RESET;
        if (szin.equals("Piros")) {
            konzolSzin = "\u001B[32m";
        } else if (szin.equals("Zold")) {
            konzolSzin = "\u001B[32m";
        }
        for (int i = 0; i < hossz; i++) {
            System.out.print(jel);

        }
        System.out.println("");
    }

    public void eltolas() {
        for (int i = 0; i < eltolas; i++) {
            System.out.print(" ");

        }
        System.out.println("");
    }
}
