public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Operator AND
        boolean isLoggedIn = true;
        boolean hasPermission = false;
        boolean canAccessAdmin = isLoggedIn && hasPermission;
        System.out.println("User bisa akses admin panel? " + canAccessAdmin);

        // Test kombinasi AND
        System.out.println("true && true   = " + (true && true));
        System.out.println("true && false  = " + (true && false));
        System.out.println("false && true  = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // Latihan 2: Operator OR
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isDayOff = isWeekend || isHoliday;
        System.out.println("Apakah hari libur? " + isDayOff);

        // Test kombinasi OR
        System.out.println("true || true   = " + (true || true));
        System.out.println("true || false  = " + (true || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // Latihan 3: Operator NOT
        boolean isRaining = true;
        boolean isSunny = !isRaining;
        System.out.println("isRaining: " + isRaining);
        System.out.println("isSunny: " + isSunny);
        System.out.println("!!isRaining = " + (!!isRaining));
        System.out.println("!(5 > 3) = " + (!(5 > 3))); // false, karena 5 > 3 bernilai true lalu dibalik

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;

        boolean isOutstanding = attendanceGood && gradesHigh && behaviorGood;
        boolean isSatisfactory = attendanceGood && (gradesHigh || behaviorGood);
        boolean needsImprovement = !attendanceGood || !behaviorGood;

        System.out.println("Siswa Outstanding? " + isOutstanding);
        System.out.println("Siswa Memuaskan? " + isSatisfactory);
        System.out.println("Siswa Perlu Perbaikan? " + needsImprovement);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;

        boolean normalAccess = hasKeyCard && knowsPassword && isAuthorizedTime;
        boolean emergencyAccess = isEmergency || (hasKeyCard && isAuthorizedTime);
        boolean accessDenied = !(normalAccess || emergencyAccess);

        System.out.println("Normal access? " + normalAccess);
        System.out.println("Emergency access? " + emergencyAccess);
        System.out.println("Access denied? " + accessDenied);

        // Latihan 6: Cuaca
        isRaining = false;
        boolean isSnowing = true;
        int temperature = -5;
        boolean isCloudy = true;

        boolean goodWeather = !isRaining && !isSnowing && temperature > 0;
        boolean needUmbrella = isRaining || (isCloudy && temperature > 20);
        boolean dangerousRoads = isSnowing || (isRaining && temperature < 5);

        System.out.println("Cuaca bagus untuk outdoor? " + goodWeather);
        System.out.println("Butuh payung? " + needUmbrella);
        System.out.println("Jalan berbahaya? " + dangerousRoads);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7
        int a = 5, b = 0;
        boolean expr1 = (b != 0) && (a / b > 2); // tidak error, karena b != 0 = false -> langsung stop
        boolean expr2 = (b == 0) || (a / b > 2); // tidak error, karena b == 0 = true -> langsung stop
        System.out.println("Expr1 (b != 0 && a/b > 2): " + expr1);
        System.out.println("Expr2 (b == 0 || a/b > 2): " + expr2);
        // Aman karena short-circuit menghentikan evaluasi sebelum division by zero terjadi.

        // Latihan 8
        boolean expensiveCheck1 = false;
        boolean expensiveCheck2 = true;

        boolean andShortCircuit = expensiveCheck1 && expensiveCheck2;
        System.out.println("expensiveCheck1 && expensiveCheck2 = " + andShortCircuit);
        // Karena expensiveCheck1 = false, maka expensiveCheck2 TIDAK dievaluasi lagi.

        boolean orShortCircuit = expensiveCheck2 || expensiveCheck1;
        System.out.println("expensiveCheck2 || expensiveCheck1 = " + orShortCircuit);
        // Karena expensiveCheck2 = true, maka expensiveCheck1 TIDAK dievaluasi lagi.
    }
}
