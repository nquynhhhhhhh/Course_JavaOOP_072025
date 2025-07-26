package PhamViTruyCap.PhamViPublic;

import PhamViTruyCap.PhamViPrivate.Company;
import PhamViTruyCap.PhamviProtected.LoginPage;

public class LoginTest {
    public static void main(String[] args) {
        ConfigData configData = new ConfigData();
        System.out.println(configData.browser);

        LoginPage loginPage = new LoginPage();
        System.out.println(loginPage.buttonLogin);
    }
}
