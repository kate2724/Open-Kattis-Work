import java.util.Scanner;

public class fiftyShadesOfPink {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int buttons = Integer.parseInt(sc.nextLine());
        int buttonCounter=0;
        for (int i = 0; i < buttons; i++) {
            String buttonColor = sc.nextLine().toLowerCase(); 
            if(buttonColor.contains("pink")|| buttonColor.contains("rose")){
                buttonCounter++;
            }           
        }
        if(buttonCounter>0){
            System.out.println(buttonCounter);
        }
        else{
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
}
