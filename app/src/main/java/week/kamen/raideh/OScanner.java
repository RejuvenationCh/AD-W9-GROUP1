
package week.kamen.raideh;

public class OScanner {
   private final TransformationEngine engine;

   public OScanner(TransformationEngine engine) {
      this.engine = engine;
   }

   public TransformationResult scan(OOODriver driver) {
      return this.engine.transform(driver);
   }
}
