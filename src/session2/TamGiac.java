package session2;

import java.util.Scanner;

/*1. Viết 1 lớp Tamgiac có 3 thuộc tính là 3 cạnh tam giác.
        Constructor nạp 3 giá trị số nguyên vào 3 cạnh. Nếu không phải 3 cạnh tam giác nhập lại cho đúng
        Phương thức kiểm tra 3 giá trị có phải 3 cạnh 1 tam giác hay không.
        Phương thức tính chu vi
        Phương thức tính diện tích

        VIết chương trình thực thi:
        - Nhập vào 3 số và tạo 1 đối tượng từ lớp tam giác với việc truyền vào 3 số này.
        - In ra chu vi và diện tích của tam giác
        2. Viết 1 file Main để chạy chương trình:
        - Tạo 1 tam giác và tính chu vi, diện tích*/
public class TamGiac {
    public int a;
    public int b;
    public int c;
    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public TamGiac(){
    }
    public TamGiac(int a, int b, int c){
        if(check()){
            this.a = a;
            this.b = b;
            this.c = c;
        }else{
            System.out.println("Nhập lại độ dài các cạnh ");
            input();
        }
    }
    public boolean check(){
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Độ dài một cạnh của tam giác phải lớn hơn 0!");
            return false;
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Tổng độ dài hai cạnh không thể nhỏ hơn hoặc bằng cạnh còn lại!");
            return false;
        }
        return true;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap độ dài 3 cạnh ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
    public int chuvi(){
        return a+b+c;
    }
    public double dientich(){

        return Math.sqrt(chuvi()/2*(chuvi()/2-a)*(chuvi()/2-b)*(chuvi()/2-c));
    }
}
