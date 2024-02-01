package pachetzel;
import org.testng.annotations.Test;


public class Expression {
    @Test
    public void expression (String[] args) {

        //      expressions = operands & operators
        //      operands= values, variables, numbers, quantity
        //      operators = + - * / %

        int toyCars = 10;
        toyCars = toyCars +1;
        // or easy way //toyCars++;

        // toyCars = toyCars -1;
        // or easy way //toyCars--;
        //toysCars--;

// for dividing, we can use -> double toyCars = 10; toyCars = (double)toyCars / 3. The result displayed in the console will be 3.3333

        System.out.println(toyCars);

    }
}
