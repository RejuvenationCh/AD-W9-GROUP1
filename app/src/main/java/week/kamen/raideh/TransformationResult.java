// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package week.kamen.raideh;

public class TransformationResult {
  private final String result;
   private final String chant;

   public TransformationResult(String result, String chant) {
      this.result = result;
      this.chant = chant;
   }

   public String toString() {
      if (this.chant != null && !this.chant.isEmpty()) {
          return this.result + ">>> " + this.chant;
      }
      return this.result;
   }
}