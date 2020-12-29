import java.util.Scanner;
public class Bangun_ruang {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("= Siti Zulfa Oktaviani =");
        System.out.println("========================\n");

        System.out.println("*****************************");
        System.out.println("* [1] Kubus                 *");
        System.out.println("* [2] Balok                 *");
        System.out.println("* [3] Limas Segiempat       *");
        System.out.println("* [4] Prisma Segtiga        *");
        System.out.println("* [5] Tabung                *");
        System.out.println("* [6] Bola                  *");
        System.out.println("* [7] Kerucut               *");
        System.out.println("*****************************\n");

        System.out.print("Pilih menu (1/2/3/4/5/6/7/): ");
        int PilihMenu = input.nextInt();
        switch(PilihMenu){
            case 1:
                Kubus();
                break;
            case 2:
                Balok();
                break;
            case 3:
                LimasSegiempat();
                break;
            case 4:
                PrismaSegitiga();
                break;
            case 5:
                Tabung();
                break;
            case 6:
                Bola();
                break;
            case 7:
                Kerucut();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    }

    //    kubus
    private static void Kubus(){
        System.out.println("Kubus");
        System.out.print("Masukan R : ");
        float R = input.nextFloat();
        float luas = 6 * (R * R) ;
        System.out.println("luas = " +luas);
        float volume = R * R * R;
        System.out.println("volume = " +volume);
    }



    //    balok
    private static void Balok(){
        System.out.println("Balok");
        System.out.print("Masukan p : ");
        float p = input.nextFloat();
        System.out.print("Masukan l : ");
        float l = input.nextFloat();
        System.out.print("Masukan t : ");

        float t = input.nextFloat();
        float luas = (2 * p * l) + (2 * p * t) + (2 * l * t);
        System.out.println("luas = " +luas);
        float volume = p * l * t;
        System.out.println("volume = " +volume);
    }


    //    limas segiempat
    private static void LimasSegiempat(){
        System.out.println("Limas Segiempat");
        System.out.print("Masukan sisi : ");
        float sisi = input.nextFloat();

        System.out.print("Masukan a : ");
        float a = input.nextFloat();

        System.out.print("Masukan t : ");
        float t = input.nextFloat();
        float luaspermukaan  = (float) ((sisi * sisi) + (4 * (0.5 * a * t)));
        System.out.println("luas permukaan = " +luaspermukaan);
        float volume = (float) (0.3 * (sisi * sisi) * t);
        System.out.println("volume = " +volume);
    }



    //    prisma segitiga
    private static void PrismaSegitiga(){
        System.out.println("Prisma Segitiga");
        System.out.print("Masukan sisi : ");
        float sisi = input.nextFloat();
        System.out.print("Masukan a    : ");
        float a = input.nextFloat();
        System.out.print("Masukan t    : ");
        float t = input.nextFloat();
        System.out.print("Masukan T    : ");
        float T = input.nextFloat();
        float luaspermukaan= (a  * t) + (3 * sisi) * T;
        System.out.println("luas permukaan = " +luaspermukaan);
        float volume = (float) ((0.5 * a * t) * T);
        System.out.println("volume = " +volume);
    }

    //    tabung
    private static void Tabung(){
        System.out.println("Tabung");
        System.out.print("Masukan r   : ");
        float r = input.nextFloat();

        System.out.print("Masukan t   : ");
        float t = input.nextFloat();
        float luaspermukaan = (float) ((2 * 3.14 * r * t) + (3.14 * (r * r)));
        System.out.println("luas permukaan = " +luaspermukaan);
        float volume = (float) (3.14 * (r * r) * t);
        System.out.println("volume = " +volume);
    }


    //    bola
    private static void Bola(){
        System.out.println("Bola");
        System.out.print("Masukan r : ");
        float r = input.nextFloat();
        float luas = (float) (4 * 3.14 * (r * r));
        System.out.println("luas = " +luas);
        float volume = (float) (1.3 * 3.14 * (r * r * r));
        System.out.println("volume = " +volume);
    }


    //    kerucut
    private static void Kerucut(){
        System.out.println("Kerucut");
        System.out.print("Masukan s : ");
        float s = input.nextFloat();

        System.out.print("Masukan r : ");
        float r = input.nextFloat();
        System.out.print("Masukan t : ");
        float t = input.nextFloat();

        float luaspermukaan = (float) ((3.14 * r * s) * (3.14 * (r * r)));
        System.out.println("luas permukaan = " +luaspermukaan);
        float volume = (float) (0.3 * 3.14 * (r * r) * t);
        System.out.println("volume = " +volume);
    }
}
