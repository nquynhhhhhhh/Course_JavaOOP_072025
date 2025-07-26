package HamXayDung;

public class DemoHamXayDung {

    public String name;
    public String phone;
    public static String address = "HCM";
    //có static nên sang class khác có thể gọi đc mà không cần khai báo obj

    //hàm xây dựng có tên giống class => kh cần void, String...
    private DemoHamXayDung(){
        name = "Nu";
        phone = "090xxxx";

    }

    public static void main(String[] args) {
        //khi khởi tạo đối tượng class là chạy cái hàm xây dựng lun
        // => tức là khởi tạo giá trị trong hàm xây dựng lun
        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();
        System.out.println(demoHamXayDung.name);
        System.out.println(demoHamXayDung.phone);
        System.out.println(demoHamXayDung.address);
    }



}
