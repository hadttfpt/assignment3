package main;
import session2.TamGiac;
public class mainTamGiac {
    public static void main(String[] args){
        TamGiac tamgiac = new TamGiac();
        tamgiac.input();
        System.out.println("chu vi tam giac la "+tamgiac.chuvi());
        System.out.printf("dien tich tam giac la "+tamgiac.dientich());
    }
}
