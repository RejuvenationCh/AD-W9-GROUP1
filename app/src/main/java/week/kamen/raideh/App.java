package week.kamen.raideh;
import java.util.Map;
import java.util.Scanner;

import week.kamen.raideh.CoreMedal.MedalName;
import week.kamen.raideh.CoreMedal.SlotType;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

public static void main(String[] args) {
    OOODriver driver = new OOODriver();
    ComboCatalogue catalogue = new ComboCatalogue();
    TransformationEngine engine = new TransformationEngine(catalogue);
    OScanner scanner = new OScanner(engine);
    Scanner input = new Scanner(System.in);
    System.out.println(scanner.scan(driver));
    driver.insertMedal(new CoreMedal(MedalName.TAKA));
    driver.insertMedal(new CoreMedal(MedalName.TORA));
    driver.insertMedal(new CoreMedal(MedalName.BATTA));

      
while (true) {
         System.out.println("--- OOO Driver Training Simulation ---");
         Map<SlotType, CoreMedal> currentMedals = driver.getMedals();
         if (currentMedals.containsKey(SlotType.HEAD)) {
             System.out.println("HEAD: " + currentMedals.get(SlotType.HEAD).getName());
         } else {
             System.out.println("HEAD: [EMPTY]");
         }
         if (currentMedals.containsKey(SlotType.ARMS)) {
             System.out.println("ARMS: " + currentMedals.get(SlotType.ARMS).getName());
         } else {
             System.out.println("ARMS: [EMPTY]");
         }
         if (currentMedals.containsKey(SlotType.LEGS)) {
             System.out.println("LEGS: " + currentMedals.get(SlotType.LEGS).getName());
         } else {
             System.out.println("LEGS: [EMPTY]");
         }
         
         System.out.println("--- Actions ---");
         System.out.println("1. Insert Medal");
         System.out.println("2. Remove Single Medal");
         System.out.println("3. Remove All Medals");
         System.out.println("4. Scan Driver");
         System.out.println("5. View History");
         System.out.println("6. Exit");
         System.out.print("Select action: ");
         
         String choice = input.nextLine();
         if (choice.equals("1")) {
             if (currentMedals.size() >= 3) {
                 System.out.println("Error: Driver is full. Remove a medal first.");
                 continue;
             }
             System.out.print("Enter Medal Name (e.g., TAKA, TORA, BATTA): ");
             String medalInput = input.nextLine().toUpperCase();
             try {
                 MedalName name = MedalName.valueOf(medalInput);
                 boolean success = driver.insertMedal(new CoreMedal(name));
                 if (!success) {
                     System.out.println("Error: Slot " + name.getSlot() + " is already occupied.");
                 } else {
                     System.out.println("Success: " + name + " inserted.");
                 }
             } catch (IllegalArgumentException e) {
                 System.out.println("Error: Invalid Medal Name.");
             }
         } else if (choice.equals("2")) {
             System.out.print("Enter Slot to Remove (HEAD, ARMS, LEGS): ");
             String slotInput = input.nextLine().toUpperCase();
             try {
                 SlotType slot = SlotType.valueOf(slotInput);
                 CoreMedal ejected = driver.ejectMedal(slot);
                 
                 if (ejected != null) {
                     System.out.println("Success: Removed " + ejected.getName() + " from " + slot + ".");
                 } else {
                     System.out.println("Error: Slot is already empty.");
                 }
             } catch (IllegalArgumentException e) {
                 System.out.println("Error: Invalid Slot.");
             }
         } else if (choice.equals("3")) {
             if (currentMedals.isEmpty()) {
                 System.out.println("Error: Driver is already empty.");
             } else {
                 currentMedals.clear();
                 System.out.println("Success: All medals have been removed.");
             }
         } else if (choice.equals("4")) {
             System.out.println(">>> SCAN RESULT:");
             System.out.println(scanner.scan(driver));
         } else if (choice.equals("5")) {
             System.out.println(">>> SCAN HISTORY:");
             System.out.println(engine.getHistory());
         } else if (choice.equals("6")) {
             System.out.println("Exiting.");
             break;
         } else {
             System.out.println("Error: Invalid selection.");
         }
    }
        input.close();
    }
}