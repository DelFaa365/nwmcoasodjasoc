import java.util.Random;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej větu: ");
        String veta = sc.nextLine();
        System.out.println("Zadej písmeno, který chceš na začátek");
        String z = sc.nextLine();

        String [] split = veta.split(" ");
        char [] spliticek = veta.toCharArray();
        char [] toPismenoKteryChci = z.toCharArray();
        int pocetSlovNaPismeno = 0;
        for (int i = 0; i < spliticek.length; i++) {
            for (char c : toPismenoKteryChci) {
                if(spliticek[i] == c){
                    pocetSlovNaPismeno++;
                }
            }
        }

        System.out.println("Počet slov ve větě: " + split.length);
        System.out.println("Počet slov začínající na písmeno "+ z + ": " + pocetSlovNaPismeno);

        System.out.println("Zadej kolikrát hodíš kostkou");
        int kolikratHod = sc.nextInt();
        System.out.println("Zadej na jaký x-tý hod číslo padlo");
        int naXHod = sc.nextInt();
        int koncoveCislo = 0;
        int pocetKoncovehoCisla = 0;
        Random random = new Random();
        int [] cislaKterPadly = new int[kolikratHod];
        for (int i = 0; i < kolikratHod; i++) {
            int nahodneCislo = random.nextInt(7);
            cislaKterPadly[i] = nahodneCislo;
            if(i == naXHod-1){
                koncoveCislo = nahodneCislo;
            }
        }

        for (int i : cislaKterPadly) {
            if(i == koncoveCislo){
                pocetKoncovehoCisla++;
            }
        }
        System.out.println("Číslo které ti padlo: " + koncoveCislo);
        System.out.println("Kolikrát toto číslo padlo: " + pocetKoncovehoCisla);
    }
}
