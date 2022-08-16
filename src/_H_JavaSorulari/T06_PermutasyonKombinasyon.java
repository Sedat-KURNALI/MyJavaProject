package _H_JavaSorulari;

import java.util.Scanner;

public class T06_PermutasyonKombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kombinasyon ve permutasyonu alinacak n sayisini giriniz (n,r): ");
        int n = scan.nextInt();
        System.out.print("Kombinasyon ve permutasyonu alinacak r sayisini giriniz (n,r): ");
        int r = scan.nextInt();

        System.out.println("Kombinasyon(" + n + "," + r + ") = " + combinasyon(n, r));
        System.out.println("Permutasyon(" + n + "," + r + ") = " + permutasyon(n, r));
    }

    private static double faktoriyel(int a) {
        double f = 1;
        if (a < 2) return 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }

    private static int permutasyon(int n, int r) {
        return (int) (faktoriyel(n) / faktoriyel(n - r));
    }

    private static int combinasyon(int n, int r) {
        return (int) (faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r)));
    }
}
