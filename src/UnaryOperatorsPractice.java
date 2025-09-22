public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        int counter = 5;
        System.out.println("Pre-increment (++counter): " + (++counter)); // 6
        System.out.println("Post-increment (counter++): " + (counter++)); // 6
        System.out.println("Setelah post-increment, counter: " + counter); // 7

        counter = 5;
        System.out.println("Pre-decrement (--counter): " + (--counter)); // 4
        System.out.println("Post-decrement (counter--): " + (counter--)); // 4
        System.out.println("Setelah post-decrement, counter: " + counter); // 3

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST INCREMENT ===");

        int a = 10, b = 10;
        int result1 = ++a;
        System.out.println("a setelah ++a: " + a + ", result1: " + result1);

        int result2 = b++;
        System.out.println("b setelah b++: " + b + ", result2: " + result2);

        // Perbedaan:
        // Pre-increment: variabel dinaikkan dulu, lalu dipakai.
        // Post-increment: variabel dipakai dulu, lalu dinaikkan.

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST DECREMENT ===");

        int x = 8, y = 8;
        System.out.println("Nilai --x: " + (--x)); // 7
        System.out.println("x sekarang: " + x);    // 7

        System.out.println("Nilai y--: " + (y--)); // 8
        System.out.println("y sekarang: " + y);    // 7

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\n=== UNARY PLUS DAN MINUS ===");

        int positive = 42;
        int negative = -positive;
        int backToPositive = -negative;
        int plusOp = +positive;

        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
        System.out.println("backToPositive: " + backToPositive);
        System.out.println("unary plus (+positive): " + plusOp);

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\n=== OPERATOR BOOLEAN NOT ===");

        boolean isReady = true;
        boolean isNotReady = !isReady;

        System.out.println("isReady: " + isReady);
        System.out.println("isNotReady: " + isNotReady);

        int number = 7;
        System.out.println("Apakah number != 0? " + (number != 0));
        System.out.println("!!isReady: " + (!!isReady));

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int attempts = 0;
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);

        int lives = 3;
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);

        System.out.println("\nLoop dengan post-increment:");
        int i = 1;
        while (i <= 5) {
            System.out.println("i: " + i);
            i++;
        }

        System.out.println("\nCountdown dengan post-decrement:");
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\n=== SKENARIO MENANTANG ===");

        int value = 5;
        int result3 = value++ + ++value; // 5 + 7 = 12
        System.out.println("Hasil value++ + ++value: " + result3);
        System.out.println("Nilai akhir value: " + value); // 7

        value = 5;
        int result4 = --value + value--; // 4 + 4 = 8
        System.out.println("Hasil --value + value--: " + result4);
        System.out.println("Nilai akhir value: " + value); // 3

        // ===== Latihan 9 =====
        System.out.println("\n=== Latihan 9: Increment/Decrement dengan Method ===");

        int score = 10;
        System.out.println("Math.max(++score, 12): " + Math.max(++score, 12)); // ++score = 11
        System.out.println("Nilai score sekarang: " + score);

        score = 10;
        System.out.println("Math.max(score++, 12): " + Math.max(score++, 12)); // score++ = 10
        System.out.println("Nilai score sekarang: " + score);
    }
}
