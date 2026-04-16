// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package week.kamen.raideh;

import java.util.ArrayList;
import java.util.List;
import week.kamen.raideh.CoreMedal.MedalName;

public class ComboCatalogue {
   private List<ComboRule> rules = new ArrayList();

   // TODO : print a chant or announcement for each full combo
   public ComboCatalogue() {
      this.rules.add(new ComboRule("Tatoba", MedalName.TAKA, MedalName.TORA, MedalName.BATTA));
      this.rules.add(new ComboRule("Gatakiriba", MedalName.KUWAGATA, MedalName.KAMAKIRI, MedalName.BATTA));
      this.rules.add(new ComboRule("Latorartar", MedalName.LION, MedalName.TORA, MedalName.CHEETAH));
      this.rules.add(new ComboRule("Sagohzo", MedalName.SAI, MedalName.GORILLA, MedalName.ZOU));
      this.rules.add(new ComboRule("Shauta", MedalName.SHACHI, MedalName.UNAGI, MedalName.TAKO));
      this.rules.add(new ComboRule("Tajadol", MedalName.TAKA, MedalName.KUJAKU, MedalName.CONDOR));
      this.rules.add(new ComboRule("Putotyra", MedalName.PTERA, MedalName.TRICERA, MedalName.TYRANNO));
      this.rules.add(new ComboRule("Burakawani", MedalName.COBRA, MedalName.KAME, MedalName.WANI));
   }

   public String findMatch(CoreMedal head, CoreMedal arms, CoreMedal legs) {
      for(ComboRule rule : this.rules) {
         if (rule.matches(head, arms, legs)) {
            return rule.getComboName();
         }
      }

      return null;
   }
}
