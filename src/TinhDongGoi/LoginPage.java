package TinhDongGoi;
//dùng giới hạn khả năng truy cập thành phần trong class, thông tin cần thiết thì show ra, ttin nào kh cần thiết thì ẩn đi

public class LoginPage {
    private String url = "https://crm.anhtester.com/admin/authentication"; //biến null
    private String email;
    private String password;

    //thông qua hàm set và get lấy ra cập nhật vào biến
    // chứ kh truy xuất trực tiếp biến private
    //ưu điểm: có thể đặt tên hàm set, get dài để dễ hiểu + ghi mô tả cho hàm = sout "Open url:"
    public String getUrl() {
        return url;
    }
    public String getUrlLoginAdmin(){
        return url + "/admin/authentication";
    }
    public String getUrlLoginUser(){
        return url + "/authentication/login";
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }


    //nếu chỉ mún lấy ra cố định biến url mà không muốn cập nhật
    //thì biến sẽ thành public và chỉ có hàm get => bỏ hàm set

    //public void setUrl(String url) {
        //this.url = url;
    //}
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void loginCRM(){
        System.out.println("Open URL: " + getUrl());
        System.out.println("Enter email: " + getEmail());
        System.out.println("Enter password: " + getPassword());
    }

    public static void main(String[] args) {
        LoginPage dangnhap = new LoginPage();
        //phải gán giá trị
        //dangnhap.setUrl("https://crm.anhtester.com/admin/authentication");
        dangnhap.setEmail("pnq2002@gmai.com");
        dangnhap.setPassword("24681357");
        //dangnhap.url; => LỖI, mình không rõ quyền lợi url có khả năng get hay set
        //System.out.println(dangnhap.url); => Run được nhưng không rõ ràng là url của admin hay user
        dangnhap.loginCRM();

        LoginPage dangnhap2 = new LoginPage();
        //dangnhap2.setUrl("https://crm.anhtester.com/admin/authentication");
        dangnhap2.setEmail("admin@gmail.com");
        dangnhap2.setPassword("13572468");
        dangnhap2.loginCRM();
    }
}
