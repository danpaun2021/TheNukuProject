package pachetzel;

import org.testng.annotations.Test;

public class Swap {
    @Test
    public void swapTwoVariables (){
        String shirt = "white";
        String pants  = "blue";
        String wardrobe;


         wardrobe = shirt;
         shirt = pants;
         pants = wardrobe;

        System.out.println("shirt: " +shirt);
        System.out.println("pants: " +pants);
    }
}
