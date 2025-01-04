/*** Erklärung ***/
// Der Fehler in deinem Code liegt darin, wie die Tiere zur Evakuierungsreihenfolge hinzugefügt werden.
// Momentan setzt man nur die Löwen an den Anfang der Liste, während alle anderen Tiere einfach der
// Liste hinzugefügt werden. Dadurch wird die Reihenfolge nicht korrekt eingehalten.

import java.util.ArrayList;
import java.util.List;

public class ZooEvacuationLoesung {

  // Tier-Prioritäten: 1 ist höchste Priorität, 4 ist niedrigste
  private static final String[] ANIMAL_PRIORITY = {"Löwe", "Elefant", "Giraffe", "Hase"};

  public static void evacuateAnimals(String[] animals) {
    List<String> evacuationOrder = new ArrayList<>();

    // Zuerst alle Tiere nach Priorität gruppieren
    List<String> priorityOne = new ArrayList<>();
    List<String> priorityTwo = new ArrayList<>();
    List<String> priorityThree = new ArrayList<>();
    List<String> priorityFour = new ArrayList<>();

    for (String animal : animals) {
      int priority = getAnimalPriority(animal);
      if (priority == 1) {
        priorityOne.add(animal);
      } else if (priority == 2) {
        priorityTwo.add(animal);
      } else if (priority == 3) {
        priorityThree.add(animal);
      } else if (priority == 4) {
        priorityFour.add(animal);
      }
    }

    // Alle Gruppen der Tiere in der richtigen Reihenfolge zusammenfügen
    evacuationOrder.addAll(priorityOne);
    evacuationOrder.addAll(priorityTwo);
    evacuationOrder.addAll(priorityThree);
    evacuationOrder.addAll(priorityFour);

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

