import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Larghezza del rettangolo");
        int larghezza = scanner.nextInt();
        System.out.println("Altezza del rettangolo");
        int altezza = scanner.nextInt();
        int total =( larghezza + altezza) *2;
        System.out.println("il perimetro del rettangolo è: " + total);

        System.out.println("Numero pari o dispari");
        int pariDispari = scanner.nextInt();
        if(pariDispari/2==0){
            System.out.println("il numero è pari e ritorna 0");
        }else{
            System.out.println("Il numero è dispari e ritorna 1");
        }

        System.out.println("Calcoliamo l'area del triangolo");
        System.out.println("Base");
        int base = scanner.nextInt();
        System.out.println("Altezza");
        int altezzaTri = scanner.nextInt();
        int areaTri = (base*altezzaTri)/2;
        System.out.println("L'area del triangolo è di:" + areaTri + "cm");
    }
}
