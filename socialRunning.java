import java.util.Scanner;
import java.util.ArrayList;

public class socialRunning {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int minimumNumber=(10^4)*2;
        ArrayList<Integer> listOfDistances = new ArrayList<Integer>();
        while(sc.hasNext()){
            int nextDistance = Integer.parseInt(sc.nextLine());
            listOfDistances.add(nextDistance);
        }
        for (int i = 0; i < listOfDistances.size()-1; i++) {
            if(listOfDistances.get(i)+listOfDistances.get(n-2)<minimumNumber){
                minimumNumber=listOfDistances.get(i)+listOfDistances.get(n-2);
            }
        }
        System.out.println(minimumNumber);
        sc.close();
    }
}
