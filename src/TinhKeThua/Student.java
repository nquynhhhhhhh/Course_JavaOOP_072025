package TinhKeThua;

public class Student extends Person {

    private String phone;
    private String address;


    //cấu trúc class con kh cần giống hoàn toàn với class cha => class con có quyền thêm bớt tham số
    public Student(String name, int age, float height, String phone) {
        //class cha có hàm xây dựng thì class con phải có super + super đảm bảo đúng cấu trúc class cha
        super(name, age, height); //BƯỚC 2: Truyền data ngược về class cha
        //nếu chỉ truyền 1 tham số name => run => age, height lấy giá trị default = 0

        //nếu class con kh có tham số thì truyền giá trị cứng vào super
        //public Student() {
            //super("Hải", 60, 160.5F);


        //truyền ở trên tham số OR truyền thẳng giá trị cứng vào đây
        this.phone = phone;
        this.address = "Wakayama";
        }

    public void showInfoStudent() {
        //getInfo(); //đã được ủy quyền, kế thừa toàn bộ, lấy từ class cha Person
        //=> kh cần khởi tạo obj
        //System.out.println("Phone: " + phone); //từ class con
        //System.out.println("Address: " + address);

        //TH muốn gọi cả getInfo của cả class cha và class con
        // => dùng từ khóa super để gọi những thành phần từ class cha khi bị trùng trong class con
        super.getInfo(); //class cha
        getInfo(); //class con
        getAge();

    }

    //Ghi đè phương thức từ class cha
    public void getInfo(){
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }


    public void getAge(){
        System.out.println("Tuổi: " + age);

    }


    public static void main(String[] args) {
        //class con có tham số như thế nào thì dưới này cũng phải đảm bảo cấu trúc
        Student hocsinh = new Student("Hải", 60, 169.5F, "070xxxx"); //truyền tham số vào main
        hocsinh.showInfoStudent();
        hocsinh.getAge();
    //GIÁ TRỊ TRUYỀN THÔNG QUA CLASS CON

        //hocsinh.getInfo(); Nếu ở class con cũng có hàm giống class cha (ghi đè) thì sẽ ưu tiên class con
        // => run => chỉ hiển thị kq của 2 cái phone và address
    }

}
