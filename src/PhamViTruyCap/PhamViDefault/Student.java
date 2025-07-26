package PhamViTruyCap.PhamViDefault;

import PhamViTruyCap.PhamViPrivate.Company;

public class Student {
    public static void main(String[] args) {
        School truong = new School();

        System.out.println(truong.password);
        System.out.println(truong.email);

        truong.getAuthen();
        Company congty = new Company();
        //congty.address; báo lỗi vì ngoài package
    }
}
