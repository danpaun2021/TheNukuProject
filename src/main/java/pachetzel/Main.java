package pachetzel;

import org.testng.annotations.Test;

public class Main {
// @Test
//    public void StratDoiCeapa (){
//        String stratDoiCeapa = "Strat doi ceapa";
//        System.out.println(stratDoiCeapa);
//    }
    String banane;
    String mere;
    String capsuni;
    String afine;

    void Main(String bananas, String apples, String strawberries, String blueberries){

        this.banane = bananas;
        this.mere = apples;
        this.capsuni = strawberries;
        this.afine = blueberries;
    }
    @Test
    void print (){
        Main("yellow jelly", "green jelly", "red jelly", "blue jelly");
        String newRow = ",\n";
        String endRow = ".";
        String result = banane + newRow + mere + newRow + capsuni + newRow + afine + endRow;
        System.out.println(result);
    }
}
