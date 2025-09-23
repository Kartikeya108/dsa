import java.util.Arrays;

public class Shiftingposition {
   public Shiftingposition() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 2, 3, 4, 5};
      byte var2 = 2;

      for(int var3 = var2; var3 < var1.length - 1; var3++) {
         var1[var3] = var1[var3 + 1];}
         
         var1[var1.length - 1] = 0;
         
      
        System.out.println(Arrays.toString(var1)); 
   }
}
 
    

