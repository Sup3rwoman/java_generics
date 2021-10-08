import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FixedSizeListTest {

    @Test
    public void testAdd() {
        FixedSizeList<Apple> apple = new FixedSizeList<>();

        apple.add(new Apple("a1"));
        apple.add(new Apple("a2"));
        apple.add(new Apple("a3"));
        apple.add(new Apple("a4"));
        apple.add(new Apple("a5"));
        apple.add(new Apple("a6"));


        Assert.assertEquals(5, apple.size());
    }

    @Test
    public void testNullValues(){
        FixedSizeList<Apple> apple = new FixedSizeList<>();

        apple.add(null);

        Assert.assertEquals(0,apple.size());
    }

    @Test
    public void testRemoveByIndex(){
        FixedSizeList<Banana> banana = new FixedSizeList<>();

        banana.add(new Banana("b1"));
        banana.add(new Banana("b2"));
        banana.add(new Banana("b3"));

        Assert.assertEquals(false,banana.removeByIndex(3));
        Assert.assertEquals(true,banana.removeByIndex(2));
    }

    @Test
    public void testRemoveByElement(){
        FixedSizeList<Banana> banana = new FixedSizeList<>();

        Banana b1 = new Banana("b1");
        banana.add(b1);
        banana.add(new Banana("b2"));
        banana.add(new Banana("b3"));

        banana.showList();
        Banana b4 = new Banana("b4");

        Assert.assertEquals(true,banana.remove(b1));
        Assert.assertEquals(false,banana.remove(b4));

        banana.showList();
    }

}
