package testNGpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest2 {
  @Test
  public void e() {
	  Reporter.log("e method  of the demotest2",true);
  }
  
  @Test
  public void f() {
	  Reporter.log("f method  of the demotest2",true);
  }
  @Test
  public void f1() {
	  int i=10;
	  int j=0;
	  int res=i/j;
	  Reporter.log("f1 method  of the demotest2",true);
  }
}
