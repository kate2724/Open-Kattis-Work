import java.util.Scanner;

public class electricalOutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            int powerStrips=sc.nextInt();
            int maxOutlets=1;
            for (int j = 0; j < powerStrips; j++) {
                maxOutlets = maxOutlets + sc.nextInt() - 1;
            }
            System.out.println(maxOutlets);
        }
        sc.close();
    }
}
