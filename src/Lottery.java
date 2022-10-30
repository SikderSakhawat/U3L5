public class Lottery {
    /* instance variables */
    private int lotteryNumber;
    /* constructor */
    public Lottery(int inputNum) {
        lotteryNumber = (int)(Math.random() * 99);
    } // no parameters
// initialize the lotteryNumber in the constructor to a random number
    /* Returns 100, 10, 3, or 0, based on whether userNumber won anything */
    public int determineWinnings(int userNumber){ // outputs the value based on if input matches returnNum output
        int firstNumInput = userNumber / 10;
        int secondNumInput = userNumber % 10;
        int firstNumOutput =  lotteryNumber / 10;
        int secondNumOutput = lotteryNumber % 10;
        if(userNumber == lotteryNumber)
            return 100;
        else if ((firstNumInput == firstNumOutput || firstNumInput == secondNumOutput) && (secondNumInput == firstNumOutput || secondNumInput == secondNumOutput))
            return 10;
        else if (firstNumInput == secondNumOutput || firstNumInput == firstNumOutput || secondNumInput == firstNumOutput || secondNumInput == secondNumOutput)
            return 3;
        return 0;
    }
    // ADD ANY OTHER METHOD(S) YOU THINK MIGHT BE USEFUL
    public int output(){ // returns the output of the lottery number
        return lotteryNumber;
    }
    public void numEqual(int userInput){ // decides what to output based on the value of the determineWinnings method
        if (determineWinnings(userInput) == 100) // output if exact match
            System.out.println("Exact Match: You win $" + determineWinnings(userInput));
        else if (determineWinnings(userInput) == 10) // output if
            System.out.println("Match all digits but not in correct order: You win $" + determineWinnings(userInput));
        else if (determineWinnings(userInput) == 3)
            System.out.println("Match one digit: You win $" + determineWinnings(lotteryNumber));
        else if (determineWinnings(userInput) == 0)
            System.out.println("No matching numbers, you win nothing :(");
    }
}
