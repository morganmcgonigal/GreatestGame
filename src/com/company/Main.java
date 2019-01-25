package com.company;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter your name.");
        String name = userInput.nextLine();

        int counter = 0;
        int gameCounter = 0;
        int gamesPlayed = 0;
        int averageGuesses = 0;
        boolean done = false;


       while (!done){

           System.out.println("Guess a number!");
           int playerNumber = userInput.nextInt();

           java.util.Random random = new java.util.Random();
           int compNumber = random.nextInt(1000);

                do
                {

                    if (compNumber > playerNumber)
                    {
                        System.out.println("Too Low!");
                        playerNumber = userInput.nextInt();
                    }
                    else if (compNumber < playerNumber)
                    {
                        System.out.println("Too High!");
                        playerNumber = userInput.nextInt();
                    }
                    counter = counter + 1;
                    gameCounter = gameCounter + 1;
                } while (compNumber !=playerNumber);

                if (compNumber == playerNumber)
                {
                    gamesPlayed = gamesPlayed + 1;
                    averageGuesses = gameCounter / gamesPlayed;

                    System.out.println("Congraulations " + name + "!  You have guessed " + counter + " times!");
                    System.out.println("You've played " + gamesPlayed + " games.");
                    System.out.println("You guessed " + averageGuesses + " times across all games.");

                }

           System.out.print("Thanks for playing! Do you want to play again? y / n");

           counter = 0;

           if (userInput.next().equalsIgnoreCase("Y")){
               done = false;
           }
           else if (userInput.next().equalsIgnoreCase("N"))
           {
               done = true;
            }
        }

        }

    }
