import java.util.Arrays;

public class Es1 {

    public static int intSum(int sum1, int sum2) {
        return sum1 * sum2;
    }

    public static String stringInt(String phrase, int num) {
        String numToStr = Integer.toString(num);
        return phrase + numToStr;
    }


    public static void main(String[] args) {
        String[] firstArray = {"Gianni", "Franco", "Germano", "Michele", "Luigi"};
        String addedString = "Mario";
        String[] newArray = new String[6];

        newArray[0] = firstArray[0];
        newArray[1] = firstArray[1];
        newArray[2] = addedString;
        newArray[3] = firstArray[2];
        newArray[4] = firstArray[3];
        newArray[5] = firstArray[4];
String consoleOldArray = Arrays.toString(firstArray);
String consoleNewArray = Arrays.toString(newArray);
        System.out.println(consoleOldArray);
        System.out.println(consoleNewArray);

    }

}

