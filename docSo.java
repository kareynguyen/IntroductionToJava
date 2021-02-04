import java.util.Scanner;

public class docSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int nhapSo = sc.nextInt();
        String[] chu = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        if (nhapSo < 10) {
            System.out.println(chu[nhapSo]);
        } else if (nhapSo < 100) {
            int chuc = nhapSo / 10;
            int donVi = nhapSo % 10;
            if (chuc == 1) {
                if (donVi == 0) {
                    System.out.println("Mười");
                } else if (donVi == 5) {
                    System.out.println("Mười Lăm");
                } else {
                    System.out.println("Mười " + chu[donVi]);
                }
            } else {
                if (donVi == 0) {
                    System.out.println(chu[chuc] + " mươi");
                } else {

                    System.out.println(chu[chuc] + " mươi " + chu[donVi]);
                }
            }
        }
    }
}