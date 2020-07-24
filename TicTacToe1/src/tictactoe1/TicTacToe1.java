
package tictactoe1;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe1 {

    static char[] boardSlots = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
    static boolean gameOver = false;
    static char counter = 0;
    static char compCounter = 0;
    static boolean youWin, youLose = false;
    static int i, j;

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int i;
        int j; 
        
        print("TIC TAC TOE! ");
        //STEP 1: ASK USER FOR COUNTER"
        
        while (counter != 'X' || counter != 'O') {
            print("Would you like to be noughts or crosses (Please enter X/O): ");
            char temp = input.next().charAt(0);
            counter = temp;
            print(counter);
            if (counter == 'X' || counter == 'O'){break; }
        }
        
        if (counter == 'X'){print("You are crosses!"); compCounter = 'O';}
        else if (counter == 'O'){print("You are noughts!"); compCounter = 'X';}

        print("START GAME!");
       
       //FIRST GO

        do{
            boolean userValid = false;
            boolean cpuValid = false;
            boolean b;
           
            do{
                print("Please enter a whole number between 1 and 9: ");
                int index = input.nextInt();
                index = index-1;
                if (index >= 0 && index < 9){
                    if (boardSlots[index] == ' '){
                        boardSlots[index] = counter;
                        userValid = true;
                    }else{ 
                        print("Invalid. Try again. ");
                    }
                }else {
                    print("Invalid. Try again. ");
                }
           } while (userValid != true);
          
            gameBoard();
            isGameOver(boardSlots);
            
            do{
                int c = rand.nextInt(9);   
                if (boardSlots[c] == ' '){
                    boardSlots[c] = compCounter; 
                    cpuValid = true;}
            }while (cpuValid != true);
            
            gameBoard(); 
            isGameOver(boardSlots);
            
       }while (gameOver != true);
        


    }
    public static void gameBoard(){
        print("" + boardSlots[0] + '|' + boardSlots[1] +  '|' + boardSlots[2]);
        print("" + '-' + '+' + '-' + '+' + '-');
        print("" + boardSlots[3] + '|' + boardSlots[4] + '|' + boardSlots[5]);
        print("" + '-' + '+' + '-' + '+' + '-');
        print("" + boardSlots[6] + '|'+ boardSlots[7] + '|'+ boardSlots[8]);
   
}

 public static boolean isGameOver(char[] boardSlots){
    if (boardSlots[0] == counter && boardSlots[1] == counter && boardSlots[2] == counter){
         System.out.println("Player wins");
        gameOver = true;}
    else if (boardSlots[3] == counter && boardSlots[4] == counter && boardSlots[5] == counter){
        System.out.println("Player wins");
        gameOver = true;}
    else if (boardSlots[6] == counter && boardSlots[7] == counter && boardSlots[8] == counter){
         System.out.println("Player wins");
         gameOver = true;}
    else if (boardSlots[0] == counter && boardSlots[3] == counter && boardSlots[6] == counter){
        System.out.println("Player wins");
        gameOver = true;}
    else if (boardSlots[1] == counter && boardSlots[4] == counter && boardSlots[7] == counter){
         System.out.println("Player wins");
         gameOver = true;}
    else if (boardSlots[2] == counter && boardSlots[5] == counter && boardSlots[8] == counter){
        System.out.println("Player wins");
        gameOver = true;}
    else if (boardSlots[0] == counter && boardSlots[4] == counter && boardSlots[8] == counter){
         System.out.println("Player wins");
         gameOver = true;}
    else if (boardSlots[2] == counter && boardSlots[4] == counter && boardSlots[6] == counter){
        System.out.println("Player wins");
        gameOver = true;}
    
    else if (boardSlots[0] == compCounter && boardSlots[1] == compCounter && boardSlots[2] == compCounter){
         System.out.println("Computer wins");
         gameOver = true;}
    else if (boardSlots[3] == compCounter && boardSlots[4] == compCounter && boardSlots[5] == compCounter){
        System.out.println("Computer wins");
        gameOver = true;}
    else if (boardSlots[6] == compCounter && boardSlots[7] == compCounter && boardSlots[8] == compCounter){
         System.out.println("Computer wins");
         gameOver = true;}
    else if (boardSlots[0] == compCounter && boardSlots[3] == compCounter && boardSlots[6] == compCounter){
        System.out.println("Computer wins");
        gameOver = true;}
    else if (boardSlots[1] == compCounter && boardSlots[4] == compCounter && boardSlots[7] == compCounter){
         System.out.println("Computer wins");
         gameOver = true;}
    else if (boardSlots[2] == compCounter && boardSlots[5] == compCounter && boardSlots[8] == compCounter){
        System.out.println("Computer wins");
        gameOver = true;}
    else if (boardSlots[0] == compCounter && boardSlots[4] == compCounter && boardSlots[8] == compCounter){
         System.out.println("Computer wins");
         gameOver = true;}
    else if (boardSlots[2] == compCounter && boardSlots[4] == compCounter && boardSlots[6] == compCounter){
        System.out.println("Computer wins");
        gameOver = true;}
    
    else if (boardSlots[0] != ' ' && boardSlots[1] != ' ' && boardSlots[2] != ' '&& boardSlots[3] != ' '&& boardSlots[4] != ' ' && boardSlots[5] != ' ' && boardSlots[6] != ' ' && boardSlots[7] != ' ' && boardSlots[8] != ' '){
        System.out.println("DRAW!");
        gameOver = true;
    }
    
     return gameOver;
 }
    public static void print(String str){System.out.println(str);}
    public static void print(char c){System.out.println(c);}
    public static void print(int i){System.out.println(i);}    
}

