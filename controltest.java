package assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class controlTest {

	@Test
	public void test() {StudentController c =new StudentController();
	String expectedval=c.listUsers();
    assertEquals(expectedval,"register");
}
@Test
	public void test2() {Shoppincartontroller sc =new Shoppincartontroller();
	String expectedval=sc.ordernow();
    assertEquals(expectedval,"cart");
    String expectedval2=sc.delete();
    assertEquals(expectedval2,"cart");
       
	}
		@Test
	public void test() {StudentController c =new StudentController();
	String expectedval=c.listUsers();
    assertEquals(expectedval,"register");
}
	@Test
	public void test() {OrderlistController oc =new OrderlistController();
	String expectedval=oc.placeorder();
    assertEquals(expectedval,"placeorder");
String expectedval2=oc.orderlist();
assertEquals(expectedval2,"orderlist");
String expectedval3=oc.cont();
assertEquals(expectedval3,"home");

	}
	@Test
	public void test() {LoginController lc =new LoginController();
	String expectedval=lc.loginpage();
    assertEquals(expectedval,"login");
String expectedval2=lc.homeypage();
assertEquals(expectedval2,"homey");
String expectedval3=lc.logout();
assertEquals(expectedval3,"home");
String expectedval4=lc.manage();
assertEquals(expectedval3,"manage");
String expectedval5=lc.cart();
assertEquals(expectedval3,"cart");
String expectedval6=lc.aboutus();
assertEquals(expectedval6,"aboutus");
String expectedval7=lc.Terms();
assertEquals(expectedval7,"Terms");
String expectedval8=lc.contact();
assertEquals(expectedval8,"contact");
String expectedval9=lc.userlist();
assertEquals(expectedval9,"userlist");

	}
	@Test
	public void test() {ItemController ic =new ItemController();
	String expectedval=ic.addItems();
    assertEquals(expectedval,"manage");
String expectedval2=ic.home();
assertEquals(expectedval2,"home");
String expectedval3=ic.display();
assertEquals(expectedval3,"itemdisplay");

}
