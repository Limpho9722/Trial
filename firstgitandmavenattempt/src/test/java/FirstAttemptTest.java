import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class FirstAttemptTest {


    @Test
    public void identifyObject() {
        FirstAttempt fa1 = new FirstAttempt();
        FirstAttempt fa2 = new FirstAttempt();
        FirstAttempt fa3 = fa1;



        assertSame(fa1,fa2);
//        boolean answer = fa1==fa2;
//        System.out.println(answer);

    }

    @Test
    public void equaliseObject() {
        FirstAttempt fa1 = new FirstAttempt();
        FirstAttempt fa2 = new FirstAttempt();

        boolean executedResponse;

        executedResponse=fa1.equals(fa2);
        System.out.println(executedResponse);

    }

    @Test
    public void failingTest() throws InterruptedException {
        FirstAttempt mpendulo = new FirstAttempt();
        mpendulo.multiplyTimeoutTest(4,3);
        assertSame(15,12);
    }


    private final int DELAY = 1000;
    @Test
    public void multiplyTimeoutTest() throws InterruptedException {
        FirstAttempt mpendulo = new FirstAttempt();
        mpendulo.multiplyTimeoutTest(4,3);
        sleep((int) (DELAY * Math.random()));
        assertSame(12,12);
    }

    @Test @Ignore
    public void ignoreTet() throws InterruptedException {
        FirstAttempt mpendulo = new FirstAttempt();
        mpendulo.multiplyTimeoutTest(4,3);
        sleep((int) (DELAY * Math.random()));
        assertSame(12,12);
    }
}