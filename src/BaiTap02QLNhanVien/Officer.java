package BaiTap02QLNhanVien;

import java.util.Scanner;

public class Officer {
    String name;
    String age;
    String gender;
    String address;

    public Officer(String name, String age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Officer() {

    }

    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Nhap ten NV: ");
        name = input.nextLine();
        System.out.println("Nhap tuoi: ");
        age = input.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = input.nextLine();
        System.out.println("Nhap dia chi: ");
        address = input.nextLine();
    }

    public void showInfo(){
        System.out.println("--------------Staff Info---------------");
        System.out.println("Ten NV: " + name + "; tuoi :" + age + "; gioi tinh :" + gender + "; dia chi :" + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
