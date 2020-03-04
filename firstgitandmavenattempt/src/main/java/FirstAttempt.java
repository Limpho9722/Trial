import static java.lang.Thread.sleep;

public class FirstAttempt {

    public String identifyObject(String answer)
    {
        answer = "Maven";
        return answer;

    }

    public boolean equaliseObject(boolean a)
    {
        return a;
    }

    public int failingTest(int x, int y)
    {
        int ans = x*y;
        System.out.println(ans);
        return ans;
    }

    public int multiplyTimeoutTest(int x, int y) throws InterruptedException {
        int ans = x*y;
        System.out.println(ans);
        return ans;
    }
    public String ignoreTest()
    {
        return null;
    }
}
