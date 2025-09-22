public class ComparisonOperationsPractice {
    public static void main(String[] args) {

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        int firstNum = 25;
        int secondNum = 18;

        System.out.println(firstNum + " > " + secondNum + " : " + (firstNum > secondNum));
        System.out.println(firstNum + " < " + secondNum + " : " + (firstNum < secondNum));
        System.out.println(firstNum + " >= " + secondNum + " : " + (firstNum >= secondNum));
        System.out.println(firstNum + " <= " + secondNum + " : " + (firstNum <= secondNum));
        System.out.println(firstNum + " == " + secondNum + " : " + (firstNum == secondNum));
        System.out.println(firstNum + " != " + secondNum + " : " + (firstNum != secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");

        double price1 = 19.99;
        double price2 = 20.0;

        System.out.println("price1 < price2 : " + (price1 < price2));
        System.out.println("Math.abs(price1 - price2) < 1.0 : " + (Math.abs(price1 - price2) < 1.0));

        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3 : " + (sum == 0.3)); // false karena presisi floating-point

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\n=== PERBANDINGAN KARAKTER ===");

        char letter1 = 'A';
        char letter2 = 'B';

        System.out.println("letter1 < letter2 : " + (letter1 < letter2)); // A(65) < B(66)
        System.out.println("'a' > 'A' : " + ('a' > 'A')); // 97 > 65

        char digit = '5';
        System.out.println("Apakah '5' digit? : " + (digit >= '0' && digit <= '9'));

        // ===== PERBANDINGAN STRING =====
        System.out.println("\n=== PERBANDINGAN STRING ===");

        String name1 = "Java";
        String name2 = "Java";

        System.out.println("name1 == name2 : " + (name1 == name2)); // true, interned string

        String name3 = new String("Java");
        System.out.println("name1 == name3 : " + (name1 == name3)); // false, objek berbeda

        System.out.println("name1.equals(name3) : " + name1.equals(name3)); // true, konten sama
        System.out.println("name1.equals(\"java\") : " + name1.equals("java")); // false, case-sensitive
        System.out.println("name1.equalsIgnoreCase(\"java\") : " + name1.equalsIgnoreCase("java")); // true

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int grade = 85;
        int passingGrade = 60;
        int honorRoll = 90;

        System.out.println("Lulus? " + (grade >= passingGrade));
        System.out.println("Honor Roll? " + (grade >= honorRoll));

        int age = 17;
        int drivingAge = 16;
        int votingAge = 18;
        int drinkingAge = 21;

        System.out.println("Boleh mengemudi? " + (age >= drivingAge));
        System.out.println("Boleh memilih? " + (age >= votingAge));
        System.out.println("Boleh minum? " + (age >= drinkingAge));

        int originalPrice = 100;
        int discountThreshold = 50;
        int customerAge = 65;
        int seniorAge = 60;

        System.out.println("Diskon bulk? " + (originalPrice > discountThreshold));
        System.out.println("Diskon senior? " + (customerAge >= seniorAge));
        System.out.println("Diskon akhir? " + ((originalPrice > discountThreshold) || (customerAge >= seniorAge)));

        // ===== PENGUJIAN BATAS =====
        System.out.println("\n=== PENGUJIAN BATAS ===");

        int score = 100;
        System.out.println("Score valid? " + (score >= 0 && score <= 100));

        int[] testScores = {0, 100, -1, 101};
        for (int s : testScores) {
            System.out.println("Score " + s + " valid? " + (s >= 0 && s <= 100));
        }

        int temp = 25;
        System.out.println("Suhu valid? " + (temp >= -10 && temp <= 40));

        // Rantai perbandingan & sistem penilaian
        int height = 175, minHeight = 160, maxHeight = 200;
        System.out.println("Tinggi diterima? " + (height >= minHeight && height <= maxHeight));

        score = 87;
        String gradeLetter;
        if (score >= 90) gradeLetter = "A";
        else if (score >= 80) gradeLetter = "B";
        else if (score >= 70) gradeLetter = "C";
        else if (score >= 60) gradeLetter = "D";
        else gradeLetter = "F";
        System.out.println("Grade: " + gradeLetter);
    }
}