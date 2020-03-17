import java.util.Scanner;

class FindIndexOfEementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrString = {"dao", "van", "phi"};
        System.out.println("Enter a string : ");
        String str = scanner.nextLine();

        int indexOfString = getIndexOfArray(arrString, str);
        System.out.println("index = " + indexOfString);
    }

    public static int getIndexOfArray(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
