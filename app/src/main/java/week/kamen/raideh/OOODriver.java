// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package week.kamen.raideh;

import java.util.EnumMap;

public class OOODriver {
   private EnumMap<CoreMedal.SlotType, CoreMedal> slots = new EnumMap(CoreMedal.SlotType.class);

   public OOODriver() {
   }

   public void insertMedal(CoreMedal medal) {
      this.slots.put(medal.getSlotType(), medal);
   }

   public boolean isComplete() {
      return this.slots.size() == 3;
   }

   public EnumMap<CoreMedal.SlotType, CoreMedal> getMedals() {
      return this.slots;
   }
}
