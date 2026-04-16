// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package week.kamen.raideh;

public class ComboRule {
   private final CoreMedal.MedalName head;
   private final CoreMedal.MedalName arms;
   private final CoreMedal.MedalName legs;
   private final String comboName;

   public ComboRule(String comboName, CoreMedal.MedalName head, CoreMedal.MedalName arms, CoreMedal.MedalName legs) {
      this.comboName = comboName;
      this.head = head;
      this.arms = arms;
      this.legs = legs;
   }

   public boolean matches(CoreMedal head, CoreMedal arms, CoreMedal legs) {
      return head.getName() == this.head && arms.getName() == this.arms && legs.getName() == this.legs;
   }

   public String getComboName() {
      return this.comboName;
   }
}
