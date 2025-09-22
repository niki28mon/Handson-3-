public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        int num1 = 25;
        int num2 = 4;

        int penjumlahan = num1 + num2;
        int pengurangan = num1 - num2;
        int perkalian = num1 * num2;
        int pembagian = num1 / num2; // pembagian integer
        int sisaBagi = num1 % num2;

        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println("Pengurangan: " + pengurangan);
        System.out.println("Perkalian: " + perkalian);
        System.out.println("Pembagian (integer): " + pembagian);
        System.out.println("Sisa bagi (modulus): " + sisaBagi);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        int hasilInt = 17 / 5;
        double hasilDouble1 = 17.0 / 5;
        double hasilDouble2 = (double) 17.0 / 5;

        System.out.println("Hasil pembagian integer 17 / 5:" + hasilInt);
        System.out.println("Hasil pembagian floating-point 17.0 / 5:" + hasilDouble1);
        System.out.println("Hasil pembagian dengan casting (double) 17 / 5:" + hasilDouble2);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\\n=== KALKULASI PRAKTIS ===");

        double panjang = 12.5;
        double lebar = 8.3;
        double luas = panjang * lebar;
        double keliling = 2* (panjang + lebar);

        double hargaBarang = 15.99;
        int jumlahBarang = 3;
        double pajak = 0.08;
        double totalHarga = jumlahBarang * hargaBarang * (1 + pajak);

        double celcius = 25;
        double fahrenheit = (celcius * 9 / 5) + 32;

        int totalHari = 50;
        int minggu = totalHari / 7;
        int sisaHari = totalHari % 7;

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
        System.out.printf("Total harga dengan pajak: $%.2f\n", totalHarga);
        System.out.printf("Suhu %.1f°C = %.1f°F\n", celcius, fahrenheit);
        System.out.println("50 hari = " + minggu + " minggu dan " + sisaHari + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\\n=== KALKULASI KOMPLEKS ===");

        double kecepatan = 65.5; // km/jam
        double waktu = 2.75; // jam
        double jarak = kecepatan * waktu;

        double pokok = 1000;
        double sukuBunga = 0.05;
        int tahun = 3;
        double jumlah = pokok * Math.pow(1 + sukuBunga,tahun);

        int nilai1 = 85, nilai2 = 92, nilai3 = 78, nilai4 = 96, nilai5 = 88;
        double rataRata = (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5.0;

        System.out.printf("Jarak tempuh: %.2f km\n", jarak);
        System.out.printf("Jumlah uang setelah 3 tahun (bunga majemuk): $%.2f\n", jumlah);
        System.out.printf("Rata-rata nilai ujian: %.2f\n", rataRata);
    }
}
