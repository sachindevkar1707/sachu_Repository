package testNGpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest1 {
  @Test
  public void s() {
	  Reporter.log("s method  of the demotest1",true);
  }
  @Test
  public void t() {
	  Reporter.log("t method  of the demotest1",true);
  }
  @Test
  public void u() {
	  Reporter.log("u method  of the demotest1",true);
  }
}
