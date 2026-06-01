import java.util.Arrays;

public class Es1 {

    public static int intSum(int sum1, int sum2) {
        return sum1 * sum2;
    }

    public static String stringInt(String phrase, int num) {
        return phrase + num;
    }

    public static String[] inserisciInArray(String[] firstArray, String newWord) {
        String[] newArray = new String[6];

        newArray[0] = firstArray[0];
        newArray[1] = firstArray[1];
        newArray[2] = newWord;
        newArray[3] = firstArray[2];
        newArray[4] = firstArray[3];
        newArray[5] = firstArray[4];
        return newArray;
    }

    public static void main(String[] args) {
        String[] firstArray = {"Gianni", "Franco", "Germano", "Michele", "Luigi"};
        String[] result = inserisciInArray(firstArray, "Mario");
        System.out.println(Arrays.toString(result));

    }

}

