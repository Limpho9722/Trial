import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAttemptTest {

    @Test
    public void identifyObject() {
        FirstAttempt fa1 = new FirstAttempt();
        FirstAttempt fa2 = new FirstAttempt();
        FirstAttempt fa3 = new FirstAttempt();

        fa1.identifyObject("Maven");
        fa2.identifyObject("Safari");
        fa3.identifyObject("Maven World");

        boolean answer = fa1==fa2;
        System.out.println(answer);



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
    public void failingTest() {

        FirstAttempt fa1 = new FirstAttempt();
        FirstAttempt fa2 = new FirstAttempt();
        FirstAttempt fa3 = new FirstAttempt();

        fa1.failingTest("Maven");
        fa2.failingTest("Safari");
        fa3.failingTest("Maven World");

        if(fa2==fa3)
        {
            System.out.println("N/A");
        }
        else
        {
            System.out.println("Test has failed");
        }
    }
}