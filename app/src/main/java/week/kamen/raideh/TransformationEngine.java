// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package week.kamen.raideh;

import week.kamen.raideh.CoreMedal.SlotType;

public class TransformationEngine {
   private final ComboCatalogue catalogue;
   private String lastResult = null;

   public TransformationEngine(ComboCatalogue catalogue) {
      this.catalogue = catalogue;
   }

   public TransformationResult transform(OOODriver driver) {
      if (!driver.isComplete()) {
         return new TransformationResult("Cannot Scan");
      } else {
         CoreMedal head = (CoreMedal)driver.getMedals().get(SlotType.HEAD);
         CoreMedal arms = (CoreMedal)driver.getMedals().get(SlotType.ARMS);
         CoreMedal legs = (CoreMedal)driver.getMedals().get(SlotType.LEGS);
         String combo = this.catalogue.findMatch(head, arms, legs);
         String result;
         if (combo != null) {
            result = combo;
         } else {
            result = "Mixed Form";
         }

         if (result.equals(this.lastResult)) {
            return new TransformationResult("Scanning Charge");
         } else {
            this.lastResult = result;
            return new TransformationResult(result);
         }
      }
   }
}
