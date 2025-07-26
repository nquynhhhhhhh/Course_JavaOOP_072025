package HamXayDung;

public class hamXayDungCoThamSo {
    public String name;
    public String phone;
    public String address;

// trong cùng 1 class có thể có nhiều hàm xây dựng nhưng nó phải khác số lượng và tham số
public hamXayDungCoThamSo(String name1, String phone1){
    //nhận gia trị mềm - giá trị có thể thay đổi trong mỗi lần khởi tạo khác nhau

    name = name1;
    phone = phone1;
    }


    public hamXayDungCoThamSo(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        //this: thể hiện đây là biến trong class (màu hồng)
        //không có this là biết là tham số sẽ được truyền vào (màu trắng)
        //=> chỉ sử dụng khi trùng tên
    }

    public static void main(String[] args) {
        //1000 sv với 1000 hàm thì sử dụng hàm xây dựng sẽ dễ hơn
        hamXayDungCoThamSo hamXayDungCoThamSo = new hamXayDungCoThamSo("NQ", "090xxx");
        System.out.println(hamXayDungCoThamSo.name);
        System.out.println(hamXayDungCoThamSo.phone);

        hamXayDungCoThamSo hamXayDungCoThamSo2 = new hamXayDungCoThamSo("Như", "090xyyyxx");
        System.out.println(hamXayDungCoThamSo2.name);
        System.out.println(hamXayDungCoThamSo2.phone);

        hamXayDungCoThamSo hamXayDungCoThamSo3 = new hamXayDungCoThamSo("Hải", "090zzyyyxx","HCM");
        System.out.println(hamXayDungCoThamSo3.name);
        System.out.println(hamXayDungCoThamSo3.phone);
        System.out.println(hamXayDungCoThamSo3.address);
    }
}
