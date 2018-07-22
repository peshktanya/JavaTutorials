package Lesson21.Random;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MathRandomTest {

    @Test
    public void canUseRandomMethodOnMath(){

        double rnd = Math.random();

        System.out.println(
            String.format(
                    "generated %f as random number", rnd));

        assertEquals(rnd < 1.0d, (true));
        assertEquals(rnd >= 0.0d, (true));
    }


}