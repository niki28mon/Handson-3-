public class AugmentedAssignmentsPractice {
    public static void main(String[] args) {

        // ===== AUGMENTED ASSIGNMENTS DASAR =====
        System.out.println("=== AUGMENTED ASSIGNMENTS DASAR ===");

        int score = 100;

        score += 25; // tambah 25
        System.out.println("score += 25 -> " + score); // 125

        score -= 15; // kurang 15
        System.out.println("score -= 15 -> " + score); // 110

        score *= 2; // kali 2
        System.out.println("score *= 2 -> " + score); // 220

        score /= 4; // bagi 4
        System.out.println("score /= 4 -> " + score); // 55

        score %= 10; // sisa bagi 10
        System.out.println("score %= 10 -> " + score); // 5

        // ===== PERBANDINGAN DENGAN REGULAR ASSIGNMENTS =====
        System.out.println("\n=== PERBANDINGAN: AUGMENTED vs REGULAR ===");

        int value1 = 50;
        int value2 = 50;

        value1 = value1 + 30; // regular assignment
        value2 += 30; // augmented assignment
        System.out.println("value1 = " + value1 + ", value2 = " + value2); // 80, 80

        value1 = 80;
        value2 = 80;

        value1 = value1 * 3; // regular
        value2 *= 3; // augmented
        System.out.println("value1 = " + value1 + ", value2 = " + value2); // 240, 240

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int bankBalance = 1000;
        bankBalance += 250; // deposit
        bankBalance -= 75;  // penarikan
        bankBalance *= 1.05; // bunga 5%
        System.out.println("Saldo akhir: " + bankBalance);

        int totalSales = 0;
        totalSales += 150; // hari1
        totalSales += 200; // hari2
        totalSales += 175; // hari3
        System.out.println("Total sales: " + totalSales);

        double productionCount = 1000;
        productionCount -= 25; // barang cacat
        productionCount *= 1.1; // bonus produksi
        System.out.println("Production count akhir: " + productionCount);

        // ===== BEKERJA DENGAN TIPE DATA BERBEDA =====
        System.out.println("\n=== TIPE DATA BERBEDA ===");

        double temperature = 20.5;
        temperature += 5.7;  // tambah
        temperature *= 1.8;  // konversi
        temperature += 32;   // melengkapi Fahrenheit
        System.out.println("Suhu akhir (Fahrenheit): " + temperature);

        String message = "Hello";
        message += " World";
        message += "!";
        System.out.println("Pesan akhir: " + message);

        // ===== TANTANGAN: NILAI MAJEMUK =====
        System.out.println("\n=== TANTANGAN: NILAI MAJEMUK ===");

        double investment = 5000;

        investment *= 1.07; // tahun 1
        investment *= 1.07; // tahun 2
        investment *= 1.07; // tahun 3

        System.out.println("Nilai investasi akhir: " + investment);
        System.out.println("Profit: " + (investment - 5000));
    }
}