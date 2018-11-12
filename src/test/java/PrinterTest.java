import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.hasPaper() );
    }

    @Test
    public void canPrint(){
        printer.print(3,10);
        assertEquals(70, printer.hasPaper() );
        assertEquals(70, printer.hasToner() );
    }

    @Test
    public void insufficientPaper(){
        printer.print(2,100);
        assertEquals(100, printer.hasPaper() );
        assertEquals(100, printer.hasToner() );
    }

    @Test
    public void insufficientToner(){
        printer.refill(500);
        printer.print(5, 100);
        assertEquals(600, printer.hasPaper() );
        assertEquals(100, printer.hasToner() );
    }

    @Test
    public void canRefillPaper(){
        printer.print(4, 20);
        printer.refill(100);
        assertEquals(120, printer.hasPaper() );
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.hasToner() );
    }


}