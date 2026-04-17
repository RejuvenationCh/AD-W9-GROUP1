
package week.kamen.raideh;

import java.util.ArrayList;
import java.util.List;

import week.kamen.raideh.CoreMedal.SlotType;

public class TransformationEngine {
   private final ComboCatalogue catalogue;
   private String lastResult = null;
   private final List<String> history = new ArrayList<>();

   public TransformationEngine(ComboCatalogue catalogue) {
      this.catalogue = catalogue;
   }

   public List<String> getHistory() {
      return this.history;
   }

   public TransformationResult transform(OOODriver driver) {
      if (!driver.isComplete()) {
         return new TransformationResult("Cannot Scan", null);
      } else {
        CoreMedal head = driver.getMedals().get(SlotType.HEAD);
        CoreMedal arms = driver.getMedals().get(SlotType.ARMS);
        CoreMedal legs = driver.getMedals().get(SlotType.LEGS);
        
        ComboRule combo = this.catalogue.findMatch(head, arms, legs);
        String result;
        String chant;

     if (combo != null) {
         result = combo.getComboName(); 
         chant = combo.getChant();
      } else {
         result = "Mixed Form";
         chant = null;
      }

         if (result.equals(this.lastResult)) {
            this.history.add("Scanning Charge"); 
            return new TransformationResult("Scanning Charge", null);
         } else {
            this.lastResult = result;
            this.history.add(result);
            return new TransformationResult(result, chant);
         }
      }
   }
}
