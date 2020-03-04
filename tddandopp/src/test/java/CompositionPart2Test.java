import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompositionPart2Test {
Subtract subtract;
    @Test
    public void action() {
     int feedback = subtract.minus(6,3);
         System.out.println(feedback);
         Assert.assertEquals(3,3);
    }
}