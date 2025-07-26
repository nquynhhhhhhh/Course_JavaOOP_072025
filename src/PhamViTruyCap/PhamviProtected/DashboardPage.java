package PhamViTruyCap.PhamviProtected;

import PhamViTruyCap.Common.BasePage;


public class DashboardPage extends BasePage {
    //extends để kế thừa biến protected của clas Basspage
    public void getDriver() {
        System.out.println(driver);
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();

        System.out.println(loginPage.inputEmail);
        System.out.println(loginPage.inputPassword);

        BasePage basePage = new BasePage();
        //System.out.println(basePage.driver); //kh được bởi vì khác package
        //System.out.println(driver); //lỗi vì driver chưa phải static => khai báo obj
        DashboardPage dashboardPage = new DashboardPage();
        System.out.println(dashboardPage.driver);

    }

}
