package numbers;

public class properties {

    boolean buzz(long number) {
        String num = String.valueOf(number);
        return num.endsWith("7") || number % 7 == 0;
    }
    boolean duck(long number) {
        String num = String.valueOf(number);
        return num.contains("0");
    }
    boolean palindromic(long number) {
        boolean checkPalindromic = true;
        String num = String.valueOf(number);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                checkPalindromic = false;
                break;
            }
        }
        return checkPalindromic;
    }

    boolean gapful(long number) {
        if (number < 100) {
            return false;
        } else {
            String num = String.valueOf(number);
            String denominator = num.charAt(0) + Character.toString(num.charAt(num.length() - 1));
            long newDenominator = Long.parseLong(denominator);
            return number % newDenominator == 0;
        }
    }

    boolean spy (String num) {
        StringBuilder spyNum = new StringBuilder(num);
        long sum = 0;
        long prod = 1;
        for (int i = 0; i < spyNum.length(); i++) {
            sum += Long.parseLong(Character.toString(spyNum.charAt(i)));
        }

        for (int i = 0; i < spyNum.length(); i++) {
            prod *= Long.parseLong(Character.toString(spyNum.charAt(i)));
        }

        return sum == prod;
    }

    boolean sunny(long number) {
        return (long)Math.sqrt(number + 1) ==  Math.sqrt((number + 1));
    }

    boolean square(long number) {
        return (long)Math.sqrt(number) ==  Math.sqrt(number);
    }

    boolean jumping(long number) {
        boolean check = true;
        if (number < 10) {
            check = true;
        } else {
            String num = String.valueOf(number);
            int differ;
            for (int i = 0; i < num.length() - 1; i++) {
                differ = Integer.parseInt(String.valueOf(num.charAt(i + 1))) - Integer.parseInt(String.valueOf(num.charAt(i)));
                if (differ != 1 && differ != -1) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    boolean happy(long number) {
        // integer n in string umwandeln
        String HappyNum  = String.valueOf(number);
        int sum = 0;

        /* alle Quadrate der Ziffer von n werden aufsummiert, n wird danach den Wert der Summe übergeben,
        solange die Summe nicht eine einstellige Zahl ist, wird der Vorgang weiter ausgeführt */
        while (HappyNum.length() >= 1) {
            sum = 0;
            for (int i = 0; i < HappyNum.length(); i++) {
                int digit = Integer.parseInt(Character.toString(HappyNum.charAt(i)));
                sum += digit * digit ;
            }
            HappyNum = String.valueOf(sum);
            if (HappyNum.length() == 1) {
                break;
            }
        }

        // wenn die Summe nach n-mal Durchführungen gleich 1 oder 7 ist, ist die Zahl eine fröhliche Zahl, sonst ist die Zahl nicht fröhlich
        if (sum == 1 || sum == 7) {
            return true;
        } else {
            return false;
        }

    }
}
