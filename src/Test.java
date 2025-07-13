public class Test {
    //class dùng quản lý biến, hàm; quản lý nội dung về Login cho rõ ràng
    //chứa hàm testcase về Login
    //testcase của Customer, Password... sẽ phân biệt ở class riêng
    String name = "Login";

    public void testLoginSuccess() {
        System.out.println("Test Login Success");
        //void nên kh hiển thị kết quả
    }

    public void testLoginFail(){
        System.out.printf("Fail");
    }


    public static void main(String[] args) {
        Test test1 = new Test(); //cách gọi chính thống (hay dùng)
        //đặt tên test1 đại diện cho class Test => test1: object (đối tượng)
        //vd: giới động vật là class
        //khởi tạo obj class dùng để truy xuất thành phần class để sử dụng
        test1.testLoginSuccess(); //gọi hàm trong class (vd: chó)
        System.out.println("===========");
        //lấy obj để chỉ thị thành phần trong class Test1
        System.out.println(test1.name); //gọi biến trong class (vd: chó sủa gâu gâu)


        System.out.println("===========");


        Test test2 = new Test();
        //khởi tạo obj class
        test2.testLoginSuccess(); //gọi hàm trong class (vd: mèo)
        System.out.println("===========");
        //lấy obj để chỉ thị thành phần trong class Test1
        System.out.println(test2.name); //gọi biến trong class (vd: mèo kêu meo meo)

        //CÁCH GỌI KIỂU ANONYMOUS (ẨN DANH)
        new Test().testLoginSuccess();
        new Test().testLoginFail();
        // nếu dùng quá nhiều new sẽ chiếm dụng bộ nhớ nhiều => code chạy chậm

        System.out.println("\nHi Quỳnh");
    }

}

