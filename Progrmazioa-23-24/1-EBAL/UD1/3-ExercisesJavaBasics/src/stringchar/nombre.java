public class nombre {
    public static void main(String[] args) throws Exception {
        int batuketa = 0;
String hitza = "Lesaka";
for (int i = 0; i < hitza.length(); i++) {
    if (hitza.charAt(i) == 'a' || hitza.charAt(i) == 'e' ||
        hitza.charAt(i) == 'i' || hitza.charAt(i) == 'o' ||
        hitza.charAt(i) == 'u') {
        batuketa = batuketa + i;
    }
}
System.out.println(batuketa);
    }
}
