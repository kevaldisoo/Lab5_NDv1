package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2000, 1, 2000);
	    String string0 = nextDate0.run(1, 31, 2000);
	    assertEquals("2/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(5, 2021, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1362, 4, 4);
	    String string0 = nextDate0.run(4, 4, 1870);
	    assertEquals("4/5/1870", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1825, 1825, 1825);
	    String string0 = nextDate0.run(4, 31, 1825);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1836, 1836, 1836);
	    String string0 = nextDate0.run(12, 12, 1836);
	    assertEquals("12/13/1836", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1889, 9, 9);
	    String string0 = nextDate0.run(9, 30, 1889);
	    assertEquals("10/1/1889", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(1884, 2, 2);
	    String string0 = nextDate0.run(2, 30, 1884);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1827), (-1827), (-1827));
	    String string0 = nextDate0.run((-1827), (-1827), (-1827));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1827), (-1827), (-1827));
	    String string0 = nextDate0.run((-1827), 1, (-1827));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 8);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 1937);
	    assertEquals("6/7/1937", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(30, 30, 30);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1813, 1813, 10);
	    String string0 = nextDate0.run(10, 10, 1813);
	    assertEquals("10/11/1813", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(3298, 3298, 3298);
	    String string0 = nextDate0.run(12, 3298, 3298);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate((-641), 11, (-641));
	    String string0 = nextDate0.run(11, 11, 1894);
	    assertEquals("11/12/1894", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1884, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1884);
	    assertEquals("2/3/1884", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1345, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1870);
	    assertEquals("7/7/1870", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(3355, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1897);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1345, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1870);
	    assertEquals("3/1/1870", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2000, 3, 2000);
	    String string0 = nextDate0.run(3, 3, 2000);
	    assertEquals("3/4/2000", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1876, 1876, 1876);
	    String string0 = nextDate0.run(8, 8, 1876);
	    assertEquals("8/9/1876", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate((-24), (-24), (-24));
	    String string0 = nextDate0.run(5, 5, 1894);
	    assertEquals("5/6/1894", string0);
	}

}