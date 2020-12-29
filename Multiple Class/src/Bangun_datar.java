import java.util.Scanner;
public class Bangun_datar {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("= Siti Zulfa Oktaviani =");
        System.out.println("========================\n");

        System.out.println("**************************");
        System.out.println("* [1] Persegi Panjang    *");
        System.out.println("* [2] Persegi            *");
        System.out.println("* [3] Jajargenjang       *");
        System.out.println("* [4] Segitiga           *");
        System.out.println("* [5] Belah Ketupat      *");
        System.out.println("* [6] Layang-Layang      *");
        System.out.println("* [7] Trapesium          *");
        System.out.println("* [8] Lingkaran          *");
        System.out.println("**************************\n");

        System.out.print("Pilih menu (1/2/3/4/5/6/7/8): ");
        int PilihMenu = input.nextInt();
        switch(PilihMenu){
            case 1:
                PersegiPanjang();
                break;
            case 2:
                Persegi();
                break;
            case 3:
                Jajargenjang();
                break;
            case 4:
                Segitiga();
                break;
            case 5:
                BelahKetupat();
                break;
            case 6:
                LayangLayang();
                break;
            case 7:
                Trapesium();
                break;
            case 8:
                Lingkaran();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    }

    //    persegi panjang
    private static void PersegiPanjang(){
        System.out.println("Persegi Panjang");
        System.out.print("Masukan panjang : ");
        float panjang = input.nextFloat();
        System.out.print("Masukan lebar : ");
        float lebar = input.nextFloat();
        float luas = panjang * lebar ;
        System.out.println("luas = " +luas);
        float keliling = 2 * (panjang + lebar);
        System.out.println("keliling = " +keliling);
    }



    //    persegi
    private static void Persegi(){
        System.out.println("Persegi");
        System.out.print("Masukan sisi : ");
        float sisi = input.nextFloat();
        float luas = sisi * sisi;
        System.out.println("luas = " +luas);
        float keliling = 4 * sisi;
        System.out.println("keliling = " +keliling);
    }



    //    jajargenjang
    private static void Jajargenjang(){
        System.out.println("Jajargenjang");
        System.out.print("Masukan a : ");
        float a = input.nextFloat();
        System.out.print("Masukan b : ");
        float b = input.nextFloat();
        System.out.print("Masukan t : ");
        float t = input.nextFloat();
        float luas = a * t;
        System.out.println("luas = " +luas);
        float keliling = 2 * (a + b);
        System.out.println("keliling = " +keliling);
    }



    //    segitiga
    private static void Segitiga(){
        System.out.println("Segitiga");
        System.out.print("Masukan a : ");
        float a = input.nextFloat();
        System.out.print("Masukan b : ");
        float b = input.nextFloat();
        System.out.print("Masukan c : ");
        float c = input.nextFloat();
        System.out.print("Masukan t : ");
        float t = input.nextFloat();
        float luas = (float) (0.5 * (a * t));
        System.out.println("luas = " +luas);
        float keliling = a + b + c;
        System.out.println("keliling = " +keliling);
    }

    //    belah ketupat
    private static void BelahKetupat(){
        System.out.println("Belah Ketupat");
        System.out.print("Masukan d1   : ");
        float d1 = input.nextFloat();
        System.out.print("Masukan d2   : ");
        float d2 = input.nextFloat();
        System.out.print("Masukan sisi : ");
        float sisi = input.nextFloat();
        float luas = (float) (0.5 * (d1 * d2));
        System.out.println("luas = " +luas);
        float keliling = 4 * sisi;
        System.out.println("keliling = " +keliling);
    }



    //    layang-layang
    private static void LayangLayang(){
        System.out.println("Layang-Layang");
        System.out.print("Masukan d1 : ");
        float d1 = input.nextFloat();
        System.out.print("Masukan d2 : ");
        float d2 = input.nextFloat();
        System.out.print("Masukan a  : ");
        float a = input.nextFloat();
        System.out.print("Masukan b  : ");
        float b = input.nextFloat();
        float luas = (float) (0.5 * (d1 * d2));
        System.out.println("luas = " +luas);
        float keliling = 2 * (a + b);
        System.out.println("keliling = " +keliling);
    }


    //    trapesium
    private static void Trapesium(){
        System.out.println("Trapesium");
        System.out.print("Masukan a : ");
        float a = input.nextFloat();

        System.out.print("Masukan b : ");
        float b = input.nextFloat();

        System.out.print("Masukan c : ");
        float c = input.nextFloat();

        System.out.print("Masukan d : ");
        float d = input.nextFloat();

        System.out.print("Masukan t : ");
        float t = input.nextFloat();
        float luas = (float) (0.5 * (a + b) * t);
        System.out.println("luas = " +luas);
        float keliling = a + b + c + d;
        System.out.println("keliling = " +keliling);
    }



    //    lingkaran
    private static void Lingkaran(){
        System.out.println("Lingkaran");
        System.out.print("Masukan r : ");
        float r = input.nextFloat();
        float luas = (float) (3.14 * (r * r));
        System.out.println("luas = " +luas);
        float keliling = (float) (2 * 3.14 * r);
        System.out.println("keliling = " +keliling);
    }
}
