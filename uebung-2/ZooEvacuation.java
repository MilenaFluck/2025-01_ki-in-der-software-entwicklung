/*** Aufgabe ***/
//Zoo-Evakuierung – Der versteckte Logikfehler

/*** Story ***/
//Es ist Chaos im Zoo! Ein Erdbeben hat einige Gehege beschädigt, und Tiere sind ausgebrochen.
// Der Zoo-Manager hat dir die Aufgabe übertragen, das Evakuierungsprogramm zu schreiben.
// Du musst sicherstellen, dass die Tiere entsprechend ihrer
// Gefährlichkeit und Größe evakuiert werden. Dabei gibt es jedoch einen Fehler im Evakuierungsplan,
// der das Programm in bestimmten Szenarien versagen lässt.

//Die Tiere sollen wie folgt evakuiert werden:
//Löwen – hohe Priorität (sehr gefährlich).
//Elefanten – ebenfalls hohe Priorität (sehr groß und schwer, blockieren den Weg).
//Giraffen – mittlere Priorität (lang und können den Weg blockieren).
//Hasen – niedrige Priorität (friedlich und klein, können zuletzt evakuiert werden).

//Finde den Fehler!

import java.util.ArrayList;
import java.util.List;

public class ZooEvacuation {

  // Tier-Prioritäten: 1 ist höchste Priorität, 4 ist niedrigste
  private static final String[] ANIMAL_PRIORITY = {"Löwe", "Elefant", "Giraffe", "Hase"};

  public static void evacuateAnimals(String[] animals) {
    List<String> evacuationOrder = new ArrayList<>();

    // Tiere entsprechend ihrer Priorität evakuieren
    for (String animal : animals) {
      int priority = getAnimalPriority(animal);
      if (priority == 1) {
        evacuationOrder.add(0, animal);  // Löwen immer an den Anfang setzen
      } else if (priority == 2) {
        evacuationOrder.add(animal);  // Elefanten hinten anfügen
      } else if (priority == 3) {
        evacuationOrder.add(animal);  // Giraffen hinten anfügen
      } else if (priority == 4) {
        evacuationOrder.add(animal);  // Hasen hinten anfügen
      }
    }

    // Ausgabe der evakuierten Tiere in der richtigen Reihenfolge
    System.out.println("Evakuierungsplan:");
    for (String animal : evacuationOrder) {
      System.out.println(animal);
    }
  }

  // Bestimmt die Priorität des Tiers
  private static int getAnimalPriority(String animal) {
    switch (animal) {
      case "Löwe":
        return 1;  // Höchste Priorität
      case "Elefant":
        return 2;  // Zweithöchste Priorität
      case "Giraffe":
        return 3;  // Mittlere Priorität
      case "Hase":
        return 4;  // Niedrigste Priorität
      default:
        return -1;  // Unbekanntes Tier
    }
  }

  public static void main(String[] args) {
    String[] zooAnimals = {"Giraffe", "Hase", "Löwe", "Elefant", "Giraffe", "Hase"};
    evacuateAnimals(zooAnimals);
  }
}

