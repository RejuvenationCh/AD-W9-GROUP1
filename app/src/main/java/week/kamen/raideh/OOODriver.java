// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package week.kamen.raideh;

import java.util.EnumMap;

public class OOODriver {
   private EnumMap<CoreMedal.SlotType, CoreMedal> slots = new EnumMap(CoreMedal.SlotType.class);

   //TODO :  prevent loading a second medal into an already occupied slot unless the first is ejected first
   // Jadi disini mungkin kasih hilang saja restriksinya user, jadi di slot manapun bisa ditaroh medal apapun, tapi kalau misal invalid position ,masuknya ke failed state  & gagal transform
   public OOODriver() {
   }
    public boolean insertMedal(CoreMedal medal) {
        if (this.slots.containsKey(medal.getSlotType())) {
            return false;
        }
        this.slots.put(medal.getSlotType(), medal);
        return true;
    }

   public boolean isComplete() {
      return this.slots.size() == 3;
   }

   public EnumMap<CoreMedal.SlotType, CoreMedal> getMedals() {
      return this.slots;
   }

   public CoreMedal ejectMedal(CoreMedal.SlotType slot) {
      return this.slots.remove(slot);
   }

   
}
