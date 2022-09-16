package numbers;

public class propertiesCheck extends properties {
    public void properties(long number) {
        System.out.println("Properties of " + number);
        System.out.print("          even: ");
        System.out.println(number % 2 == 0);
        System.out.print("          odd: ");
        System.out.println(number % 2 == 1);
        System.out.print("          buzz: ");
        System.out.println(buzz(number));
        System.out.print("          duck: ");
        System.out.println(duck(number));
        System.out.print("   palindromic: ");
        System.out.println(palindromic(number));
        System.out.print("        gapful: ");
        System.out.println(gapful(number));
        System.out.print("           spy: ");
        System.out.println(spy(String.valueOf(number)));
        System.out.print("        square: ");
        System.out.println(square(number));
        System.out.print("         sunny: ");
        System.out.println(sunny(number));
        System.out.print("       jumping: ");
        System.out.println(jumping(number));
        System.out.print("       happy: ");
        System.out.println(happy(number));
        System.out.print("       sad: ");
        System.out.println(!happy(number));
    }

    public String propWithPars(long number) {
        String property = String.valueOf(number) + " is";
        if (number % 2 == 0) {
            property = property + " even";
        } else {
            property = property + " odd";
        }
        if (buzz(number)) {
            property = property + ", buzz";
        }
        if (duck(number)) {
            property = property + ", duck";
        }
        if (palindromic(number)) {
            property = property + ", palindromic";
        }
        if (gapful(number)) {
            property = property + ", gapful";
        }
        if (spy(Long.toString(number))) {
            property = property + ", spy";
        }
        if (sunny(number)) {
            property = property + ", sunny";
        }
        if (square(number)) {
            property = property + ", square";
        }
        if (jumping(number)) {
            property = property + ", jumping";
        }
        if (happy(number)) {
            property += ", happy";
        } else {
            property += ", sad";
        }
        return property;
    }
}