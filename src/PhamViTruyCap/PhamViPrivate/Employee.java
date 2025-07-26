package PhamViTruyCap.PhamViPrivate;

public class Employee {

    private String name = "Như Quỳnh";
    private int age = 23;


    private void getInfo(){
        System.out.println(name);
        System.out.println(age);

    }

    private void getName(){
        System.out.printf(name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo();
    }



}
