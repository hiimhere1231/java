import java.util.Scanner;

public class Tictacs {
    private static char[][] board = new char[3][3];
    private static char playerUp = 'X';

   public static void main(String[] args) throws Exception {
        initilizeBaord();
        printCuteBoard();
        while (winChekcpacman() == true){
            playerMovecuzHuman();
        }
        
   }
        
    public static void initilizeBaord(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){                 
                board[i][j] = '-';
            }
        }
    }
    public static void cr(){
        for(int i = 0; i < 50; i++){
            System.out.println();
        }
    }

    public static void printCuteBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+board[i][j]+" ");
            }
        System.out.println();
        }
    }
    public static void playerMovecuzHuman(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player "+playerUp+", What row do you want to go in?");
        int row1 = scan.nextInt() - 1;
        System.out.println("What column?");
        int col1 = scan.nextInt() - 1;
        if(board[row1][col1] == '-'){
            board[row1][col1] = playerUp;
            cr();
            printCuteBoard();
            if(playerUp == 'X'){
                playerUp = 'O';
            }
            else{
                playerUp = 'X';
            }
        }
        else{
            cr();
            System.out.println("Please choose a valid move.");
            playerMovecuzHuman();
        }
    }
    public static boolean winChekcpacman(){
        // tie
        int tiecounter = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 'O' || board[i][j] == 'X'){
                    tiecounter = tiecounter + 1;
                    if(tiecounter == 9){
                        cr();
                        System.out.println("The game has ended in a tie.");
                        return false;
                    }
                }
            }
        }
        // straight & up and down x
        for(int i = 0; i < 3; i++){
           if(board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] ==  'X'){
                cr();
                System.out.println("X wins.");
                return false;
           }
           if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] ==  'X'){
                cr();
                System.out.println("X wins.");
                return false;
            }
        }
        // o conditions
        for(int j = 0; j < 3; j++){
            if(board[0][j] == 'O' && board[1][j] == 'O' && board[2][j] ==  'O'){
                cr();
                System.out.println("O wins.");
                return false;
        }
            if(board[j][0] == 'O' && board[j][1] == 'O' && board[j][2] ==  'O'){
                cr();
                System.out.println("O wins.");
                return false;
            }   
        }
        // diagonal
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
            cr();
            System.out.println("X wins.");
            return false;
        }
        if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
            cr();
            System.out.println("O wins.");
            return false;
        }
        if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'){
            cr();
            System.out.println("X wins.");
            return false;
        }
        if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){
            cr();
            System.out.println("O wins.");
            return false;
        }
    return true;
    }
}