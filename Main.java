/////////////////////////////////////
//Derek McPeak
//CSC 160 Computer Science 1
//11/25/2020
//Final Project
/////////////////////////////////////


import java.util.*;

class Main {

    public static void main(String[] args) {

        // creating scanner
        Scanner input = new Scanner(System.in);
        // count to determine if player 1 or player 2 will roll
        int count = 0;
        // score for player 1
        int Player1Score = 0;
        // score for player 2
        int Player2Score = 0;
        // getting name for player 1
        System.out.print("Hello, what is the name of the first player? ");
        String Player1 = input.nextLine();
        System.out.println(" ");
        // getting name for player 2
        System.out.print("What is the name of the second player? ");
        String Player2 = input.nextLine();
        System.out.println(" ");
        // welcome statment for player 1 and 2.
        System.out.println("Welcome players " + Player1 + " and " + Player2);
        // overview of the game.
        System.out.println("The goal of this game is to accumulate a player score of exactly 30.The first player to score exactly 30 is the Winner.");
        System.out.println("You will roll a pair of dice, then you must choose the score of one of the dice or the total of the two ");
        System.out.println("dice. This value is added to your player score. If your score goes over 30, your score is reset to zero. ");
        System.out.println("Player turn changes after each roll of the dice. You win when you accumulate a score of exactly 30.");
        System.out.println(" ");
        System.out.println("Here we go!");
        // while loop, player 1 will be determined by an odd number and player 2 by even, using the Count variable,
        // end of loop increments count by 1 then the modulus dictates which players turn it is.
        // if a user goes over 30, displays message they have exceeded 30 and their score is reset.
        // if a user hits 30, it ends and displays congratulations message.
        while (Player1Score <= 30 || Player2Score <= 30) {
            if (count % 2 == 0) {
                // initializing DiceRoll 1 and 2
                int Diceroll1 = (int) (Math.random() * 6) +1;
                int Diceroll2 = (int) (Math.random() * 6) +1;

                //letting the appropriate player know it's their turn and their current total
                System.out.println("Lets roll for " + Player1 + ", Your score is " + Player1Score);
                // giving the value of each die
                System.out.println("First die is: " + Diceroll1);
                System.out.println("Second die is: " + Diceroll2);
                // asking the user if they want to keep die 1, 2 or both.
                System.out.println("Do you wish to (1) Keep die 1, (2) Keep die 2, (3) Keep the total? (Respond with 1 or 2 or 3): ");
                // Giving the user their total regarding each option.
                System.out.println("If you choose (1), your total will be " + (Player1Score + Diceroll1));
                System.out.println("If you choose (2), your total will be " + (Player1Score + Diceroll2));
                System.out.println("If you choose (3), your total will be " + (Player1Score + Diceroll1 + Diceroll2));
                // input for the choice of the user
                String Choice = input.nextLine();

                // while loop, while the user doesn't input 1, 2 or 3, it will infinitely loop them through until they choose 1, 2 or 3.
                while ( !Choice.equals("1") && !Choice.equals("2") && !Choice.equals("3")) {
                    System.out.println("Please choose 1, 2 or 3");
                    Choice = input.nextLine();
                }




                // choice 3 will make users score, the total of the two dice
                if (Choice.equals("3")) {
                    Player1Score += Diceroll1 + Diceroll2;
                    // choice 1 will make the users score, the total the second die
                } else if (Choice.equals("2")) {
                    Player1Score += Diceroll2;
                    // choice 2 will make the users score, the total of the first die
                } else if (Choice.equals("1")) {
                    Player1Score += Diceroll1;
                }

                // displaying users name and their score total.
                System.out.println("Your total: " + Player1Score);
                System.out.println(" ");
                // increasing the count by 1 to change to the user.
                count++;
                // if the players score exceeds 30, displays message informing the user

                if (Player1Score > 30) {
                    System.out.println("You have exceeded 30, Please try again. You're score is reset to 0");
                    System.out.println("");
                    // resetting users score to 0
                    Player1Score = 0;
                    // if the users score is equal to 30, lets the user know they won and ends the game.
                } else if (Player1Score == 30) {
                    System.out.println("Your score is 30! Congratulations " + Player1 +  " WINS!");
                    {
                        break;
                    }

                }

            } else {
                // initializing DiceRoll 1 and 2
                int Diceroll1 = (int) (Math.random() * 6) +1;
                int Diceroll2 = (int) (Math.random() * 6) +1;

                //letting the appropriate player know it's their turn and their current total
                System.out.println("Lets roll for " + Player2 + ", Your score is " + Player2Score);
                // giving the value of each die
                System.out.println("First die is: " + Diceroll1);
                System.out.println("Second die is: " + Diceroll2);
                // asking the user if they want to keep die 1, 2 or both.
                System.out.println("Do you wish to (1) Keep die 1, (2) Keep die 2, (3) Keep the total? (Respond with 1 or 2 or 3): ");
                // Giving the user their total regarding each option.
                System.out.println("If you choose (1), your total will be " + (Player2Score + Diceroll1));
                System.out.println("If you choose (2), your total will be " + (Player2Score + Diceroll2));
                System.out.println("If you choose (3), your total will be " + (Player2Score + Diceroll1 + Diceroll2));
                // input for the choice of the user
                String Choice = input.nextLine();

                // while loop, while the user doesn't input 1, 2 or 3, it will infinitely loop them through until they choose 1, 2 or 3.
                while ( !Choice.equals("1") && !Choice.equals("2") && !Choice.equals("3")) {
                    System.out.println("Please choose 1, 2 or 3");
                    Choice = input.nextLine();
                }
                // choice 3 will make users score, the total of the two dice
                if (Choice.equals("3")) {
                    Player2Score += Diceroll1 + Diceroll2;
                    // choice 1 will make the users score, the total the second die
                } else if (Choice.equals("2")) {
                    Player2Score += Diceroll2;
                    // choice 2 will make the users score, the total of the first die
                } else if (Choice.equals("1")) {
                    Player2Score += Diceroll1;
                }

                // displaying users name and their score total.
                System.out.println("Your total: " + Player2Score);
                System.out.println(" ");
                // increasing the count by 1 to change to the user.
                count++;
                // if the players score exceeds 30, displays message informing the user

                if (Player2Score > 30) {
                    System.out.println("You have exceeded 30, you're score is reset to 0");
                    System.out.println("");
                    Player2Score = 0;
                    // if the users score is equal to 30, lets the user know they won and ends the game.
                } else if (Player2Score == 30) {
                    System.out.println("Your score is 30! Congratulations " + Player2 +  " WIN!");
                    {
                        break;
                    }

                }

            }




        }


    }

}