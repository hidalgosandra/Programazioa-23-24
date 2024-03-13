public class App {
    public static void main(String[] args) throws Exception {
        Herriak taula = new Herriak();

        taula.irakurriDatuBakarra();

        taula.txertatu("Saldibar");
        taula.irakurriDatuBakarra();

        taula.irakurriDatuAnitzak();

        taula.aldatu("Saldibar", "Zaldibar");
        taula.irakurriDatuAnitzak();

        taula.ezabatu("Zaldibar");
        taula.irakurriDatuAnitzak();
    }
}
