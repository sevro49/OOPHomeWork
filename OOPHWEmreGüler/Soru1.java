import java.util.Random;

public class Soru1 {

    public static void main(String[] args) {
        String[] arr = new String[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "_ ";
        }

        Tavsan tavsan = new Tavsan();
        Kaplumbaga kaplumbaga = new Kaplumbaga();

        while (true) {

            tavsan.hareketBelirle();
            kaplumbaga.hareketBelirle();

            if ((tavsan.tPozisyon == kaplumbaga.kPozisyon) && (tavsan.tPozisyon != arr.length-1)) {
                arr[tavsan.tPozisyon] = "OUCH ";

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.print("| " + (tavsan.tPozisyon + 1) + ". hücrede kaza!");
                System.out.println();

                arr[tavsan.tPozisyon] = "_ ";
                arr[kaplumbaga.kPozisyon] = "_ ";

                continue;

            }

            else {

                arr[tavsan.tPozisyon] = "T ";
                arr[kaplumbaga.kPozisyon] = "K ";

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.print("| T: " + (tavsan.tPozisyon + 1) + " K: " + (kaplumbaga.kPozisyon + 1));

                System.out.println();

                if ((tavsan.tPozisyon == arr.length - 1) && (kaplumbaga.kPozisyon == arr.length - 1)) {
                    System.out.println("Berabere");
                    break;
                }

                else if (tavsan.tPozisyon == arr.length - 1) {
                    System.out.println("Tavşan kazandı, yuh!");
                    break;
                }

                else if (kaplumbaga.kPozisyon == arr.length - 1) {
                    System.out.println("kaplumbağa kazandı, oley!");
                    break;
                }

                arr[tavsan.tPozisyon] = "_ ";
                arr[kaplumbaga.kPozisyon] = "_ ";

            }

        }

    }
}

/**
 * soru1 classındaki main metodu içinde while döngüsü kurup
 * tavsan.hareketBelirle() metodunu döngüye al (aynı şeyi kaplumbağa için de
 * yap)
 * 
 */
class Tavsan {

    Random random = new Random();
    int tRandom = 0, tPozisyon = 0;

    public void hareketBelirle() {

        tRandom = random.nextInt(10);

        if (tRandom >= 0 && tRandom <= 1) {
            tPozisyon = tPozisyon + 0;
        }

        else if (tRandom >= 2 && tRandom <= 3) {
            tPozisyon = tPozisyon + 9;
            if (tPozisyon > 19) {
                tPozisyon = 19;
            }
        }

        else if (tRandom == 4) {
            tPozisyon = tPozisyon - 9;
            if (tPozisyon < 0) {
                tPozisyon = 0;
            }

        }

        else if (tRandom >= 5 && tRandom <= 7) {
            tPozisyon = tPozisyon + 1;
            if (tPozisyon > 19) {
                tPozisyon = 19;
            }

        }

        else if (tRandom >= 8 && tRandom <= 9) {
            tPozisyon = tPozisyon - 1;
            if (tPozisyon < 1) {
                tPozisyon = 0;
            }

        }
    }
}

class Kaplumbaga {

    Random random = new Random();
    int kRandom = 0, kPozisyon = 0;

    public void hareketBelirle() {

        kRandom = random.nextInt(10) + 1;

        if (kRandom >= 1 && kRandom <= 5) {
            kPozisyon = kPozisyon + 3;
            if (kPozisyon > 19) {
                kPozisyon = 19;
            }
        }

        else if (kRandom >= 6 && kRandom <= 7) {
            kPozisyon = kPozisyon - 6;
            if (kPozisyon < 1) {
                kPozisyon = 1;
            }
        }

        else if (kRandom >= 8 && kRandom <= 10) {
            kPozisyon = kPozisyon + 1;
            if (kPozisyon > 19) {
                kPozisyon = 19;
            }

        }

    }

}



