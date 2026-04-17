
package week.kamen.raideh;

import java.util.ArrayList;
import java.util.List;
import week.kamen.raideh.CoreMedal.MedalName;

public class ComboCatalogue {
   private List<ComboRule> rules = new ArrayList();

   public ComboCatalogue() {
      this.rules.add(new ComboRule("Tatoba", MedalName.TAKA, MedalName.TORA, MedalName.BATTA, "Taka! Tora! Batta! Ta-To-Ba! Tatoba, Ta-To-Ba!"));
      this.rules.add(new ComboRule("Gatakiriba", MedalName.KUWAGATA, MedalName.KAMAKIRI, MedalName.BATTA, "Kuwagata! Kamakiri! Batta! Ga-Ta-Ga-Ta-Gatakiriba Gatakiriba!"));
      this.rules.add(new ComboRule("Latorartar", MedalName.LION, MedalName.TORA, MedalName.CHEETAH, "Lion! Tora! Cheetah! Latah Latah! Latorartar!"));
      this.rules.add(new ComboRule("Sagohzo", MedalName.SAI, MedalName.GORILLA, MedalName.ZOU, "Sai! Gorilla! Zou! Sagohzo... Sagohzo!"));
      this.rules.add(new ComboRule("Shauta", MedalName.SHACHI, MedalName.UNAGI, MedalName.TAKO, "Shachi! Unagi! Tako! Sha-Sha-Shauta! Sha-Sha-Shauta!"));
      this.rules.add(new ComboRule("Tajadol", MedalName.TAKA, MedalName.KUJAKU, MedalName.CONDOR, "Taka! Kujaku! Condor! Ta-Ja-Dol!"));
      this.rules.add(new ComboRule("Putotyra", MedalName.PTERA, MedalName.TRICERA, MedalName.TYRANNO, "Ptera! Tricera! Tyranno! Pu-To-Tyrannosaurus!"));
      this.rules.add(new ComboRule("Burakawani", MedalName.COBRA, MedalName.KAME, MedalName.WANI, "Cobra! Kame! Wani! BuraKaWani!"));
   }

   public ComboRule findMatch(CoreMedal head, CoreMedal arms, CoreMedal legs) {
      for(ComboRule rule : this.rules) {
         if (rule.matches(head, arms, legs)) {
            return rule;
         }
      }
      return null;
   }
}
