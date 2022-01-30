import java.util.Scanner;


public class qalyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int periods = Integer.parseInt(sc.nextLine());
        System.out.println("period: "+ periods);
        float total=0;
        float product=0;
        while (sc.hasNext()) {
            float qaly = sc.nextFloat();
            float years = sc.nextFloat();
            product = qaly + years;
            total = total + product;
        }
        System.out.println("total" + total);
        sc.close();
    }
}

