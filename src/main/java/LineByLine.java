
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] pieces = text.split(" ");
        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }

        String text1 = scanner.nextLine();

        String[] pieces1 = text1.split(" ");
        for (int i = 0; i < pieces1.length; i++) {
            System.out.println(pieces1[i]);
        }

        String text2 = scanner.nextLine();

        String[] pieces2 = text2.split(" ");
        for (int i = 0; i < pieces2.length; i++) {
            System.out.println(pieces2[i]);
        }
    }
}
