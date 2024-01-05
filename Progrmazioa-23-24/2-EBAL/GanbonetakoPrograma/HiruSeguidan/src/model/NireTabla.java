package model;

public class NireTabla {

    private final char J1 = 88;
    private final char J2 = 79;
    private final char hutsa = 45;
    private boolean txanda;
    private char taula[][];

    public NireTabla() {
        this.txanda = true;
        this.taula = new char[3][3];
        this.hasiTaula();
    }

    /**
     * Taula guztiz hutsik dagoenean amaitzen da
     */
    private void hasiTaula() {

        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula.length; j++) {
                taula[i][j] = hutsa;
            }
        }

    }

    /**
     * Jokoa amaitu den edo irabazlea dagoenean bukatu egiten da
     *
     * @return jokoa amaitu den ala ez
     */
    public boolean bukaera() {
        if (taulaBeteta()) {
            return true;
        } else if (lerroanKoinzidentzia() != hutsa) {
            return true;
        } else if (zutabeanKoinzidentzia() != hutsa) {
            return true;
        } else if (diagonalKoinzidentzia() != hutsa) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Taula beteta den ala ez egiaztatzen du, ikur lehenetsia agertzen denean
     * taula beteta dagoela esan behar da
     *
     * @return taula beteta ala ez
     */
    public boolean taulaBeteta() {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[0].length; j++) {
                if (taula[i][j] == hutsa) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Koinzidentzia bat dagoeneko linian irabazlea badago esan
     *
     * @return irabazlearen ikurra, hutsa ez badago
     */
    private char lerroanKoinzidentzia() {

        char ikur;
        boolean koint;

        for (int i = 0; i < taula.length; i++) {

            // Koinzidentziaren egitura berriro hasieratu
            koint = true;
            // Liniaren ikurra hartu
            ikur = taula[i][0];
            if (ikur != hutsa) {
                for (int j = 1; j < taula[0].length; j++) {
                    // Ez datorren bat koinziditzen, ez da irabazleik linian honetan
                    if (ikur != taula[i][j]) {
                        koint = false;
                    }
                }

                // Ez badator if-era, irabazlearen ikurra itzuliko da
                if (koint) {
                    return ikur;
                }

            }

        }

        // Irabazlearen ikurra ez badago, ikur lehenetsia itzuliko da
        return hutsa;

    }

    /**
     * Koinzidentzia bat dagoeneko zutabean irabazlea badago esan
     *
     * @return irabazlearen ikurra, hutsa ez badago
     */
    private char zutabeanKoinzidentzia() {

        char ikur;
        boolean koint;

        for (int j = 0; j < taula.length; j++) {

            // Koinzidentziaren egitura berriro hasieratu
            koint = true;
            // Zutabearen ikurra hartu
            ikur = taula[0][j];
            if (ikur != hutsa) {
                for (int i = 1; i < taula[0].length; i++) {
                    // Ez datorren bat koinziditzen, ez da irabazleik zutabe honetan
                    if (ikur != taula[i][j]) {
                        koint = false;
                    }
                }

                // Ez badator if-era, irabazlearen ikurra itzuliko da
                if (koint) {
                    return ikur;
                }

            }

        }

        // Irabazlearen ikurra ez badago, ikur lehenetsia itzuliko da
        return hutsa;

    }

    /**
     * Diagonalak egiaztatu
     *
     * @return irabazlearen ikurra, hutsa ez badago
     */
    private char diagonalKoinzidentzia() {

        char ikur;
        boolean koint = true;

        // Diagonal nagusia
        ikur = taula[0][0];
        if (ikur != hutsa) {
            for (int i = 1; i < taula.length; i++) {
                // Ez datorren bat koinziditzen, ez da irabazleik lerro honetan
                if (ikur != taula[i][i]) {
                    koint = false;
                }
            }

            // Ez badator if-era, irabazlearen ikurra itzuliko da
            if (koint) {
                return ikur;
            }

        }

        koint = true;

        // Diagonal inbertsua
        ikur = taula[0][2];
        if (ikur != hutsa) {
            for (int i = 1, j = 1; i < taula.length; i++, j--) {
                // Ez datorren bat koinziditzen, ez da irabazleik lerro honetan
                if (ikur != taula[i][j]) {
                    koint = false;
                }
            }

            // Ez badator if-era, irabazlearen ikurra itzuliko da
            if (koint) {
                return ikur;
            }
        }

        // Irabazlearen ikurra ez badago, ikur lehenetsia itzuliko da
        return hutsa;

    }

    /**
     * Jokalariaren ikurra erakutsi
     */
    public void erakutsiIrabazlea() {

        char ikur = lerroanKoinzidentzia();

        if (ikur != hutsa) {

            irabazlea(ikur, 1);

            return;

        }

        ikur = zutabeanKoinzidentzia();

        if (ikur != hutsa) {

            irabazlea(ikur, 2);

            return;

        }

        ikur = diagonalKoinzidentzia();

        if (ikur != hutsa) {

            irabazlea(ikur, 3);

            return;

        }

        System.out.println("Berbera daukagu");

    }

    /**
     * Aurreko funtzioaren bidezko laguntzailea
     *
     * @param ikur
     * @param mota
     */
    private void irabazlea(char ikur, int mota) {

        switch (mota) {
            case 1:
                if (ikur == J1) {
                    System.out.println("1. Jokalariak irabazi du lerro batean");
                } else {
                    System.out.println("2. Jokalariak irabazi du lerro batean");
                }

                break;
            case 2:
                if (ikur == J1) {
                    System.out.println("1. Jokalariak irabazi du zutabe batean");
                } else {
                    System.out.println("2. Jokalariak irabazi du zutabe batean");
                }
                break;
            case 3:
                if (ikur == J1) {
                    System.out.println("1. Jokalariak irabazi du diagonal batean");
                } else {
                    System.out.println("2. Jokalariak irabazi du diagonal batean");
                }
                break;
        }

    }

    /**
     * Matrizean posizio bati ikur bat sartzen du
     *
     * @param lerro
     * @param zutabe
     */
    public void betePos(int lerro, int zutabe) {
        if (txanda) {
            this.taula[lerro][zutabe] = J1;
        } else {
            this.taula[lerro][zutabe] = J2;
        }
    }

    /**
     * Matrizea erakutsi
     *
     */
    public void taulaErakutsi() {

        for (int i = 0; i < this.taula.length; i++) {
            for (int j = 0; j < this.taula[0].length; j++) {
                System.out.print(this.taula[i][j] + " ");
            }
            System.out.println("");
        }

    }

    /**
     * Uneko txanda erakutsi
     */
    public void txandaErakutsi() {

        if (txanda) {
            System.out.println("1. Jokalariak jolasten du");
        } else {
            System.out.println("2. Jokalariak jolasten du");
        }

    }

    /**
     * Txanda aldatu
     */
    public void txandaAldatu() {
        this.txanda = !this.txanda;
    }

    /**
     * Sartutako posizioa balioztatu
     *
     * @param lerro
     * @param zutabe
     * @return
     */
    public boolean balidatuPos(int lerro, int zutabe) {

        if (lerro >= 0 && lerro < taula.length && zutabe >= 0 && zutabe < taula.length) {
            return true;
        }
        return false;

    }

    /**
     * Posizio batean marka bat dagoen ala ez adierazi
     *
     * @param lerro
     * @param zutabe
     * @return
     */
    public boolean balioaPos(int lerro, int zutabe) {
        if (this.taula[lerro][zutabe] != hutsa) {
            return true;
        }

        return false;
    }

}
