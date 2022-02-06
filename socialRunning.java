import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class socialRunning {
    public static void main(String[] args) throws FileNotFoundException { 
        // File file = new File("test.txt");
        // Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int minimumNumber=100000000;
        ArrayList<Integer> listOfDistances = new ArrayList<Integer>();
        while(sc.hasNext()){
            int nextDistance = Integer.parseInt(sc.nextLine());
            listOfDistances.add(nextDistance);
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            int finalDistanceIndex = i+ n-2;
            while(finalDistanceIndex>n-1){
                finalDistanceIndex=finalDistanceIndex-n;
            }
            if(listOfDistances.get(i)+listOfDistances.get(finalDistanceIndex) < minimumNumber){
                minimumNumber=listOfDistances.get(i)+listOfDistances.get(finalDistanceIndex);
            }
        }
        System.out.println(minimumNumber);
    }
}
