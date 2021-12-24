import java.util.Arrays;
public class main {

    public static void main(String[] args) {
        int[] liste = {3, 7, 3, 3, 2, 2, 9, 10, 1, 10, 6, 6};
        int[] kopya = new int[liste.length];
        int basind = 0;
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < liste.length; j++) {
                if (i != j && liste[i] == liste[j] && liste[i] % 2 == 0) {
                    if (!isFind(kopya, liste[i])) {
                        kopya[basind++]=liste[i];
                    }
                  break;
                }
            }
        }
        for (int value : kopya) {
            if (value !=0) {
                System.out.print(value+" ");
            }
        }
    }

    public static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
