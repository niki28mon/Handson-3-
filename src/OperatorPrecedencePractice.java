public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        int a = 10, b = 5, c = 2;

        // a + b * c
        // Prediksi: b * c = 5 * 2 = 10, lalu a + 10 = 20
        System.out.println("a + b * c (prediksi 20) = " + (a + b * c));

        // (a + b) * c
        // Prediksi: (a + b) = 15, 15 * 2 = 30
        System.out.println("(a + b) * c (prediksi 30) = " + ((a + b) * c));

        // a * b + c / 2
        // Prediksi: a*b = 10*5 =50; c/2 = 2/2 =1; total = 51
        System.out.println("a * b + c / 2 (prediksi 51) = " + (a * b + c / 2));

        // a / b + c * 2
        // Evaluasi step-by-step: a/b = 10/5 =2; c*2 = 4; hasil = 2 + 4 = 6
        System.out.println("a / b + c * 2 (prediksi 6) = " + (a / b + c * 2));

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        int x = 15, y = 10, z = 20;

        // x + y > z - 5
        // x+y = 25 ; z-5 = 15 ; 25 > 15 => true
        System.out.println("x + y > z - 5 (prediksi true) = " + (x + y > z - 5));

        // x > y + z / 4
        // z/4 = 5 ; y + 5 = 15 ; x > 15 ? (15 > 15) => false
        System.out.println("x > y + z / 4 (prediksi false) = " + (x > y + z / 4));

        // (x + y) > (z - 5) && x < z
        // (25 > 15) && (15 < 20) => true && true => true
        System.out.println("(x + y) > (z - 5) && x < z (prediksi true) = " +
                ((x + y) > (z - 5) && x < z));

        // x * 2 + y > z && y < x + 5
        // x*2 + y = 30 + 10 = 40 -> 40 > 20 true ; y < x+5 => 10 < 20 true => overall true
        System.out.println("x * 2 + y > z && y < x + 5 (prediksi true) = " +
                (x * 2 + y > z && y < x + 5));

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        boolean p = true, q = false, r = true;

        // p && q || r  => (p && q) || r  because && memiliki precedence lebih tinggi
        // (true && false) => false ; false || true => true
        System.out.println("p && q || r (prediksi true) = " + (p && q || r));

        // p || q && r => p || (q && r)
        // q && r = false && true = false ; p || false = true
        System.out.println("p || q && r (prediksi true) = " + (p || q && r));

        // !p && q || r => ((!p) && q) || r ; !p = false
        System.out.println("!p && q || r (prediksi true) = " + (!p && q || r));

        // p && (q || r)  vs  p && q || r
        System.out.println("p && (q || r) (prediksi true) = " + (p && (q || r)));
        System.out.println("p && q || r (prediksi true)    = " + (p && q || r));

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        int num1 = 25, num2 = 15, num3 = 30;

        // num1 > num2 + 5 && num3 / 2 < num1
        // num2 + 5 = 20 -> 25 > 20 true ; num3/2 = 15 -> 15 < 25 true -> overall true
        System.out.println("num1 > num2 + 5 && num3 / 2 < num1 (prediksi true) = " +
                (num1 > num2 + 5 && num3 / 2 < num1));

        // num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        // Precedence: && lebih tinggi dari ||
        // Left: num1+num2 > 30 => 40 > 30 => true -> karena OR dan sisi kiri true, short-circuit => true
        System.out.println("num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10 (prediksi true) = " +
                (num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10));

        // Dengan tanda kurung untuk memaksa evaluasi
        boolean grouped = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        // (true || true) && true => true && true => true
        System.out.println("(num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10 (prediksi true) = " +
                grouped);

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        int value = 8;

        // ++value * 2 -> ++value menjadi 9, lalu 9 * 2 = 18
        System.out.println("++value * 2 (prediksi 18) = " + (++value)); // print ++value to show value changed
        // Note: the above line prints the incremented value only; better do explicit calculation:
        value = 8;
        int result1 = ++value * 2; // ++value => 9 -> 9*2 = 18
        System.out.println("Setelah reset, ++value * 2 (prediksi 18) = " + result1 + " (value sekarang " + value + ")");

        // value++ * 2 -> returns 8 * 2 = 16, value becomes 9 afterwards
        value = 8;
        int result2 = value++ * 2; // uses 8, then increments to 9
        System.out.println("value++ * 2 (prediksi 16) = " + result2 + " (value sekarang " + value + ")");

        // 2 * ++value -> ++value => 9, 2*9 = 18
        value = 8;
        int result3 = 2 * ++value;
        System.out.println("2 * ++value (prediksi 18) = " + result3 + " (value sekarang " + value + ")");

        // -value + 10 -> -8 + 10 = 2
        value = 8;
        System.out.println("-value + 10 (prediksi 2) = " + (-value + 10));

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        a = 5; b = 10;
        // a += b * 2 -> b*2 = 20, then a = a + 20 = 25
        a += b * 2;
        System.out.println("a += b * 2 (prediksi a = 25) -> a = " + a);

        // reset and test a *= b + 3
        a = 5;
        a *= b + 3; // b+3 = 13 ; a = 5 * 13 = 65
        System.out.println("a *= b + 3 (prediksi a = 65) -> a = " + a);

        // ternary: a = b > 5 ? b * 2 : b / 2
        // with b = 10 -> b > 5 true -> a = 20
        int ternaryResult = (b > 5 ? b * 2 : b / 2);
        System.out.println("a = b > 5 ? b * 2 : b / 2 (prediksi 20) -> result = " + ternaryResult);

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        a = 8; b = 4; c = 2; int d = 6;

        // a + b * c - d  => 8 + 4*2 -6 => 8 + 8 -6 = 10
        System.out.println("a + b * c - d (prediksi 10) = " + (a + b * c - d));

        // (a + b) * (c - d) => (8+4)*(2-6) => 12 * -4 = -48
        System.out.println("(a + b) * (c - d) (prediksi -48) = " + ((a + b) * (c - d)));

        // boolean examples with/without parentheses
        // a > b && c < d || a == b  => (a > b && c < d) || a == b
        System.out.println("a > b && c < d || a == b (prediksi true) = " + (a > b && c < d || a == b));
        System.out.println("a > b && (c < d || a == b) (prediksi true) = " + (a > b && (c < d || a == b)));

        // nested complex example:
        // ((a + b) * c) / (d - 2) > (a - b)
        // step: (8+4)=12 *2 =24 ; d-2=4 ; 24/4=6 ; a-b = 4 ; 6 > 4 => true
        boolean nested = ((a + b) * c) / (d - 2) > (a - b);
        System.out.println("((a + b) * c) / (d - 2) > (a - b) (prediksi true) = " + nested);

        System.out.println("\n--- Selesai: semua latihan precedence dan contoh hasil tercetak di atas ---");
    }
}
