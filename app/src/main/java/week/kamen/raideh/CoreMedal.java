// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package week.kamen.raideh;

public class CoreMedal {
   private final MedalName name;

   public CoreMedal(MedalName name) {
      this.name = name;
   }

   public MedalName getName() {
      return this.name;
   }

   public SlotType getSlotType() {
      return this.name.getSlot();
   }

   public String toString() {
      return this.name.toString();
   }

   public static enum SlotType {
      HEAD,
      ARMS,
      LEGS;

      private SlotType() {
      }
   }

   public static enum MedalName {
      TAKA(CoreMedal.SlotType.HEAD),
      LION(CoreMedal.SlotType.HEAD),
      SAI(CoreMedal.SlotType.HEAD),
      SHACHI(CoreMedal.SlotType.HEAD),
      KUWAGATA(CoreMedal.SlotType.HEAD),
      PTERA(CoreMedal.SlotType.HEAD),
      COBRA(CoreMedal.SlotType.HEAD),
      TORA(CoreMedal.SlotType.ARMS),
      KAMAKIRI(CoreMedal.SlotType.ARMS),
      GORILLA(CoreMedal.SlotType.ARMS),
      UNAGI(CoreMedal.SlotType.ARMS),
      KUJAKU(CoreMedal.SlotType.ARMS),
      TRICERA(CoreMedal.SlotType.ARMS),
      KAME(CoreMedal.SlotType.ARMS),
      BATTA(CoreMedal.SlotType.LEGS),
      CHEETAH(CoreMedal.SlotType.LEGS),
      ZOU(CoreMedal.SlotType.LEGS),
      TAKO(CoreMedal.SlotType.LEGS),
      CONDOR(CoreMedal.SlotType.LEGS),
      TYRANNO(CoreMedal.SlotType.LEGS),
      WANI(CoreMedal.SlotType.LEGS);

      private final SlotType slot;

      private MedalName(SlotType slot) {
         this.slot = slot;
      }

      public SlotType getSlot() {
         return this.slot;
      }
   }
}
