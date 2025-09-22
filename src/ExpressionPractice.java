public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * perbedaan antara expressions, statements, dan blocks.
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        int a = 10;
        int b = 5;

        // - Buat expression yang menjumlahkan a dan b, simpan dalam variabel 'sum'
        int sum = a + b;

        // - Buat expression yang mengalikan a dan b, simpan dalam variabel 'product'
        int product = a * b;

        // - Buat boolean expression yang mengecek apakah a lebih besar dari b
        boolean isAGreater = a > b;

        // - Buat string expression yang menggabungkan "Hello" dan "World"
        String greeting = "Hello" + " " + "World";

        // - Buat method call expression menggunakan Math.pow(2, 3)
        double power = Math.pow(2, 3);

        // - Print semua hasil expression dengan label yang deskriptif
        System.out.println("Sum (a+b): " + sum);
        System.out.println("Product (a*b): " + product);
        System.out.println("Is a > b?: " + isAGreater);
        System.out.println("Greeting: " + greeting);
        System.out.println("2^3 = " + power);

        // ===== STATEMENTS =====
        System.out.println("\n=== STATEMENTS ===");

        // - Buat declaration statement untuk variabel integer 'score'
        int score;

        // - Buat assignment statement untuk memberikan nilai 85 ke score
        score = 85;

        // - Buat conditional statement yang mencetak "Pass" jika score >= 60, "Fail" jika sebaliknya
        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // - Buat loop statement yang mencetak angka 1 sampai 3
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // ===== BLOCKS =====
        System.out.println("\n=== BLOCKS ===");

        int x = 15;

        // - Buat if block yang mengecek apakah x > 10
        if (x > 10) {
            String category = "High";
            System.out.println("x: " + x + ", category: " + category);
        }

        // - Buat for loop block yang melakukan iterasi 3 kali
        for (int i = 1; i <= 3; i++) {
            int iteration = i;
            System.out.println("Iteration number: " + iteration);
        }

        // Latihan 4: Demonstrasikan variable scope dengan blocks
        int outerVariable = 100;

        {
            // - Di dalam block ini, deklarasikan variabel 'innerVariable' dengan nilai 50
            int innerVariable = 50;
            // - Print kedua outerVariable dan innerVariable
            System.out.println("Inside block -> outerVariable: " + outerVariable + ", innerVariable: " + innerVariable);
            // - Modifikasi outerVariable di dalam block ini (tambahkan 25)
            outerVariable += 25;
        }

        // - Print outerVariable setelah block (seharusnya menunjukkan nilai yang sudah dimodifikasi)
        System.out.println("After block -> outerVariable: " + outerVariable);

        // - Coba print innerVariable di sini - apa yang terjadi?
        // System.out.println(innerVariable); // ERROR: innerVariable tidak dikenal di luar block
    }
}
