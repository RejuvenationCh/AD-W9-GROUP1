
package week.kamen.raideh;

import java.util.EnumMap;

public class OOODriver {
   private EnumMap<CoreMedal.SlotType, CoreMedal> slots = new EnumMap(CoreMedal.SlotType.class);

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
