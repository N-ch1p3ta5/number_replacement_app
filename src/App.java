import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        // getting the first number of the range
        System.out.print("Enter the start of the range: ");
        int startRange = userInput.nextInt();
        // getting the last number of the range
        System.out.print("Enter the end of the range: ");
        int endRange = userInput.nextInt();

        // looping through the range using a for-loop
        for(int i = startRange; i <= endRange; i++){
            // checking the numbers in the range
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("ray-roy");
            } else if (i % 5 == 0){
                System.out.println("roy");
            } else if(i % 3 == 0){
                System.out.println("ray");
            } else {
                System.out.println(i);
            }
        }
        userInput.close();
    }
}
