import java.util.Scanner;

public class Es2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi il tuo nome:");
        String name = scanner.nextLine();
        System.out.println("Scrivi il tuo cognome:");
        String surname = scanner.nextLine();
        System.out.println("Scrivi la città in cui abiti:");
        String city = scanner.nextLine();
        System.out.println("Ti chiami " +name + " "+ surname+ " ed abiti a "+ city);


    }

}