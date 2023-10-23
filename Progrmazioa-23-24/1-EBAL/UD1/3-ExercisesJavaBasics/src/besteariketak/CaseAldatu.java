package besteariketak;

public class CaseAldatu {
    public static void main(String[] args) {
        String aldaketak1 = caseAldatu("EIBAR", 'm');
        String aldaketak2 = caseAldatu("ermua", 'M');
        String aldaketak3 = caseAldatu("Elgoibar", 'G');
        String aldaketak4 = caseAldatu("gaindituko dut", 'M');

        System.out.println(aldaketak1);
        System.out.println(aldaketak2);
        System.out.println(aldaketak3);
        System.out.println(aldaketak4);
    }

    public static String caseAldatu(String testua, char letra) {
        char[] karaktereak = testua.toCharArray(); // String-a karaktereetan banatu
        for (int i = 0; i < karaktereak.length; i++) {
            char letraKaraktere = karaktereak[i];
            if (letra == 'M') {
                if (letraKaraktere >= 'a' && letraKaraktere <= 'z') {
                    karaktereak[i] = (char) (letraKaraktere - 'a' + 'A');
                }
            } else if (letra == 'm') {
                if (letraKaraktere >= 'A' && letraKaraktere <= 'Z') {
                    karaktereak[i] = (char) (letraKaraktere - 'A' + 'a');
                }
            } else if (letra == 'G') {
                if (letraKaraktere >= 'a' && letraKaraktere <= 'z') {
                    karaktereak[i] = (char) (letraKaraktere - 'a' + 'A');
                } else if (letraKaraktere >= 'A' && letraKaraktere <= 'Z') {
                    karaktereak[i] = (char) (letraKaraktere - 'A' + 'a');
                }
            }
        }
        return new String(karaktereak); // Aldatutako karaktereak String bihurtu eta itzuli
    }
}
