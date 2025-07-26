package TinhKeThua;

public class Person {

    public String name;
    public int age;
    public float height;

    //BƯỚC 1: TẠO HÀM XÂY DỰNG
    // => nhờ bước 2 tại class con mà hàm class cha nhận giá trị => biến này mới có giá trị
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        //nếu ở class cha kh có hàm xây dựng => class con Student kh cần từ khóa super

    }

    public Person(String name){
        this.name = name;

    }
    //biến có giá trị => hàm getInfo mới có giá trị
    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
    }
    //TẠI CLASS CHA CHƯA CÓ GIÁ TRỊ NÀO, GIÁ TRỊ SẼ ĐƯỢC TRUYỀN TẠI CLASS CON

    public void getAge(){
        System.out.println(age);


    }


}
