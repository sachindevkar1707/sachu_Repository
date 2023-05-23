package pageObjectmodelPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class createUser_testcase extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException {
		BaseTest bt=new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		HomepageActitime hp = new HomepageActitime(driver);
		hp.createUser();
		
		hp.deleteuser();
	}

}
