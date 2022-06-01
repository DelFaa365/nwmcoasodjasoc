import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej větu: ");
        String veta = sc.nextLine();

        char [] split = veta.toCharArray();
        int pocet = 0;
        for (char c : split) {
            if(c <= 122 && c >= 97){
                pocet++;
            }
        }
        System.out.println(pocet);


    }
}
