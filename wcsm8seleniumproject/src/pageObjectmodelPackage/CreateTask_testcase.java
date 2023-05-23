package pageObjectmodelPackage;

import java.io.IOException;

public class CreateTask_testcase extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt=new BaseTest();
	bt.setUp();
	LoginPage lp = new LoginPage(driver);
	Flib flib = new Flib();
	lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
	Thread.sleep(2000);
	TaskTabActitime tt = new TaskTabActitime(driver);
	tt.createtask();
	tt.deleteTask();
}
}
