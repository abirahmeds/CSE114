//Abir Ahmed 112751779
//CSE 114.02

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Initialize Scanner and create grid
        Scanner sc = new Scanner(System.in);
        char[][] cfour = new char[6][7];

        for (int row = 0; row < cfour.length; row++){
            for (int col = 0; col < cfour[0].length; col++){
                cfour[row][col] = ' ';
            }
        }

        //Player color
        char pp = 'R';

        boolean winner = false;

        //While-loop for each turn until a player wins by getting four consecutive disks
        while (!winner){
            boolean validPlay;
            int c;
            do {
                display(cfour);
                String s;

                if (pp == 'R'){
                    s = "red";
                }
                else{
                    s = "yellow";
                }

                //Allows the user input and set the column equal to the user choice column
                System.out.print("Drop a " + s + " disk at column (0-6): ");
                c = sc.nextInt();

                //Boolean method to check if there is an available spot for user to drop their disk
                //If a column is full, redisplay connectfour board
                validPlay = possible(c,cfour);
                if (!validPlay){
                    System.out.println("This column is full, please drop your disk in another column.");
                }
            }while (!validPlay);

            for (int row = cfour.length - 1; row >= 0; row--){

                if(cfour[row][c] == ' '){
                    cfour[row][c] = pp;
                    break;
                }
            }

            winner = isWinner(pp, cfour);

            //Alternate players, pp is the color of the player
            if (pp == 'Y'){
                pp = 'R';
            }
            else{
                pp = 'Y';
            }
        }

        display(cfour);


        //Output who the winner is if the boolean variable winner is true
        if (winner){
            String ss;
            if (pp == 'R')
                ss = "yellow";

            else
                ss = "red";

            System.out.println("The  " + ss + " player won.");

        }else{
            System.out.println("It's a tie");
        }
        System.exit(0);
    }

    //Display the connect four board
    public static void display(char[][] cfour){

        System.out.println();
        for (char[] chars : cfour) {
            System.out.print("|");

            for (int col = 0; col < cfour[0].length; col++) {
                System.out.print(chars[col]);
                System.out.print("|");
            }
            System.out.println();
        }

        System.out.println("................");
        System.out.println();
    }

    //Boolean method to check if there is an available spot for user to drop their disk
    public static boolean possible(int column, char[][] cfour){

        if (column < 0 || column > cfour[0].length)
            return false;


        return cfour[0][column] == ' ';
    }

    //Check if there is a winner yet
    public static boolean isWinner(char pp, char[][] cfour){

        //This checks for horizontal consecutive four disks of same color
        for (char[] chars : cfour) {

            for (int col = 0; col < cfour[0].length - 3; col++) {

                if (chars[col] == pp &&
                        chars[col + 1] == pp &&
                        chars[col + 2] == pp &&
                        chars[col + 3] == pp) {
                    return true;
                }
            }
        }

        //This checks for vertical consecutive four disks of same color
        for(int row = 0; row < cfour.length - 3; row++){

            for(int col = 0; col < cfour[0].length; col++){

                if (cfour[row][col] == pp   &&
                        cfour[row+1][col] == pp &&
                        cfour[row+2][col] == pp &&
                        cfour[row+3][col] == pp){
                    return true;
                }
            }
        }

        //This checks for diagonal going towards the top four disks of same color
        for(int row = 3; row < cfour.length; row++){

            for(int col = 0; col < cfour[0].length - 3; col++){

                if (cfour[row][col] == pp   &&
                        cfour[row-1][col+1] == pp &&
                        cfour[row-2][col+2] == pp &&
                        cfour[row-3][col+3] == pp){
                    return true;
                }
            }
        }

        //This checks for diagonal going towards the bottom four disks of same color
        for(int row = 0; row < cfour.length - 3; row++){

            for(int col = 0; col < cfour[0].length - 3; col++){

                if (cfour[row][col] == pp   &&
                        cfour[row+1][col+1] == pp &&
                        cfour[row+2][col+2] == pp &&
                        cfour[row+3][col+3] == pp){
                    return true;
                }
            }
        }

        return false;
    }
}