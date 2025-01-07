# Beispiel-Prompt

## ## Anweisung ## ##
Erstelle Unit Tests mit JUnit für die Funktion add(int a, int b), die die Summe von a und b zurückgibt.

public class Main {
    static int add(int a, int b) {
      return a + b;
    }
}

## ## Kontext ## ##
Die Funktion add(int a, int b) ist eine einfache Java-Funktion, die zwei Zahlen als Parameter entgegennimmt und deren Summe zurückgibt. Es ist wichtig, verschiedene Szenarien zu testen, einschließlich typischer Werte, Grenzwerte und falscher Eingaben.


## ## Beispiel ## ##
Hier ist ein Beispiel für Unit Tests:

Funktion:
```public class Main {
    static int multiply(int a, int b) {
        return a * b;
    }
}

Test:
public class MainTest {
    @Test
    public void testMultiply() {
        // Test case: Multiply two positive numbers
        assertEquals(6, Main.multiply(2, 3), "Multiplying 2 and 3 should return 6");
        // Test case: Multiply a positive number with zero
        assertEquals(0, Main.multiply(0, 5), "Multiplying 0 and 5 should return 0");
        // Test case: Multiply two negative numbers
        assertEquals(6, Main.multiply(-2, -3), "Multiplying -2 and -3 should return 6");
        // Test case: Multiply a positive number with a negative number
        assertEquals(-6, Main.multiply(-2, 3), "Multiplying -2 and 3 should return -6");
    }
}

Bitte folge dieser Struktur für die Funktion add(a, b).

## ## Erwartung ## ##
Gib mir eine vollständige Testsuite, die mindestens die folgenden Szenarien abdeckt: 
- Summe zweier positiver Zahlen, Summe zweier negativer Zahlen, 
- Summe einer positiven und einer negativen Zahl, 
- Umgang mit null als Eingabe, 
- Umgang mit ungültigen Eingaben (z. B. Strings, undefined).
Ich erwarte eine Branch Coverage von 100%.

## ## Ausgabeformat ## ##
Alle Tests sollen dem Arrange, Act, Assert Pattern folgen. Kommentiere dies mit “//Arrange”, “//Act” und “//Assert” im Code.

## ## Einschränkungen ## ##
Halte den Testcode einfach und übersichtlich. Verwende nur native JUnit-Methoden ohne externe Bibliotheken. Testbeschreibungen dürfen aus maximal 10 Wörtern bestehen.

## ## Zielgruppe ## ##
Die Tests werden später von strengen Reviewern geprüft, die die Qualität und Vollständigkeit der Tests bewerten werden. Sie erwarten, dass der Code klar kommentiert ist und die Absicht hinter jedem Testfall deutlich wird.