import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Collection1Test {
    @Test
    public void collectionInterface()
    {
        Collection<String> names = new ArrayList<>();
        names.add("Berry");
        names.add("Doesn't");
        names.add("Fully");
        names.add("Understand");
        names.add("What she is doing");
        Assert.assertEquals(5,names.size());
    }

    @Test
    public void mapInterface()
    {
        Map<Integer,Double> map= new HashMap<>();
        map.put(1,90.6);
        map.put(2,30.2);
        map.put(4,10.72);
        map.put(3,40.1);
        map.remove(4);

        Assert.assertEquals(false,map.isEmpty());
    }


    @Test
    public void setInterface()
    {
        Set<Integer> set = new TreeSet<>();

        set.add(99);
        set.add(95);
        set.add(100);
        set.add(76);
        set.add(50);
        set.add(99);

        set.remove(95);
        int length = set.size();
        Assert.assertEquals(4,length);

    }

    @Test
    public void listInterface()
    {
        List<Double> empRate = new LinkedList<>();

        empRate.add(121.5);
        empRate.add(141.8);
        empRate.add(121.5);
        empRate.add(161.7);
        empRate.add(191.2);

        ((LinkedList<Double>) empRate).addFirst(200.06);

        Assert.assertEquals(true,empRate.contains(200.06));
    }
}
