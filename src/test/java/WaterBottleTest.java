import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(0);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkTaken(){
        assertEquals(90, bottle.takeDrink());
    }

    @Test
    public void bottleEmptied(){
        assertEquals(0, bottle.emptyBottle());
    }

    @Test
    public void bottleFilled(){
        bottle.emptyBottle();
        bottle.fillBottle();
        assertEquals(100, bottle.getVolume());
    }


}

