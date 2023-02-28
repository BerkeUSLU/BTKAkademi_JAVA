public class Main {

    // This program uses multi-dimensional array.
    // A loop is created to search given data.
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Antalya";
        sehirler[1][0] = "Los Angeles";
        sehirler[1][1] = "New York";
        sehirler[1][2] = "Seattle";
        sehirler[2][0] = "Vancouver";
        sehirler[2][1] = "Virginia Beach";
        sehirler[2][2] = "Ankara";

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}