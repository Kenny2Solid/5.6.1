

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDateConversion {

    public static void main(String[] args) {

        Locale usLocale = Locale.US;
        Locale franceLocale = Locale.FRANCE;
        Locale japanLocale = Locale.JAPAN;

        LocalDate currentDate = LocalDate.now();

        printFormattedDate(usLocale, currentDate);
        printFormattedDate(franceLocale, currentDate);
        printFormattedDate(japanLocale, currentDate);
    }

    private static void printFormattedDate(Locale locale, LocalDate date) {

        System.out.println("Locale: " + locale.getDisplayLanguage() + ", Country: " + locale.getCountry());

        DateTimeFormatter longFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", locale);
        System.out.println("Long Format: " + date.format(longFormatter));

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", locale);
        System.out.println("Full Format: " + date.format(fullFormatter));

        System.out.println();
    }
}
