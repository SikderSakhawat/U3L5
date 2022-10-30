import java.util.Scanner;
public class U3L5Runner {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a lottery number from 00 to 99: ");
       int inputNum = s.nextInt();
       Lottery newLotTicket = new Lottery(inputNum);
       int output = newLotTicket.output();
       int winnings = newLotTicket.determineWinnings(inputNum);
       if (inputNum < 10)
           System.out.println("Your lottery pick is: 0" + inputNum);
       else
           System.out.println("Your lottery pick is: " + inputNum);
       if (output < 10)
           System.out.println("The lottery number is: 0" + output);
       else
           System.out.println("The lottery number is: " + output);
       newLotTicket.numEqual(inputNum);
    }
}
