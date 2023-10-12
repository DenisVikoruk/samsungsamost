import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static final String Alf = "abcdefghijklmnopqrstuvwxyz";
    public static String eD(String inputStr, int shiftKey) {
        inputStr = inputStr.toLowerCase();
        String eStr = "";
        for (int i = 0; i < inputStr.length(); i++) {
            int numb = Alf.indexOf(inputStr.charAt(i));
            int enumb = (shiftKey + numb) % 26;
            char eChar = Alf.charAt(enumb);
            eStr += eChar;
        }
        return eStr;
    }
    public static String dD(String inputStr, int shiftKey)
    {
        inputStr = inputStr.toLowerCase();
        String dStr = "";
        for (int i = 0; i < inputStr.length(); i++) {
            int numb = Alf.indexOf(inputStr.charAt(i));
            int dnumb = (numb - shiftKey) % 26;
            if (dnumb < 0) {
                dnumb = Alf.length() + dnumb;
                char dChar = Alf.charAt(dnumb);
                dStr += dChar;
            }
        }
            return dStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Строка, которую нужно зашифровать/дешифровать: ");
        String inputStr = sc.nextLine();
        System.out.println("Ключ: ");
        int shiftKey = Integer.valueOf(sc.nextLine());
        System.out.println("Шифратор " + eD(inputStr, shiftKey));
        System.out.println("Дешифратор " + dD(eD(inputStr, shiftKey), shiftKey));
        sc.close();
    }
}