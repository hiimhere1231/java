import java.util.*;

public class SweeperOfTheMines {

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    public static char[][] minedBoared;
    public static char[][] bombs;
    public static int bomb;
    public static int bombNumbel;
    public static int emptySpaces;

    public static void baord(){ 
        System.out.println("What do you want the length of the board to be?");
        int length = scan.nextInt(); 
        scan.nextLine();
        minedBoared = new char[length][length];
        bombs = new char[length][length];
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                minedBoared[i][j] = '□';
            }
        }
    }

    public static void inesm(){
        bomb = bombs.length * bombs.length;
        bombNumbel = 0;
       
        for(int i = 0; i < minedBoared.length; i++){
            for(int j = 0; j < minedBoared.length; j++){
                bombs[i][j] = '□';
            }
        }
        for(int i = 0; i < minedBoared.length * minedBoared.length * .2; i++){
            bombs[rand.nextInt(minedBoared.length)][rand.nextInt(minedBoared.length)] = 'o';
        }
        for(int i = 0; i < bombs.length; i++){
            for(int j = 0; j < bombs.length; j++){
                if(bombs[i][j] == 'o'){
                    bombNumbel += 1;
                }
            }
        }
        emptySpaces = (int)(bombs.length * bombs.length) - bombNumbel;
    }
        
    public static void printCutesyBoard(){
        for(int i = 0; i < minedBoared.length; i++){
            for(int j = 0; j < minedBoared.length; j++){
                System.out.print(minedBoared[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printMeanBoard(){
        for(int i = 0; i < bombs.length; i++){
            for(int j = 0; j < bombs.length; j++){
                System.out.print(bombs[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int getNumber(int row, int col){
        int bombscounter = 0;
        for(int i = row-1; i <= row+1 ; i++){
            for(int j = col-1; j <= col+1; j++){
                if(i < bombs.length && j < bombs.length && i >= 0 && j >= 0){
                    if(bombs[i][j] == 'o'){
                        bombscounter += 1;
                    }
                }
            }
        }
        return bombscounter;
    }
    public static void clear(int row, int col){
        int check = getNumber(row, col);
        if(row < bombs.length && col < bombs.length && row >= 0 && col >= 0 && bombs[row][col] == '□'){
            if(check == 0){
                bombs[row][col] = '-';
                minedBoared[row][col] = '-';
                clear(row, col);
            }
            else{
                bombs[row][col] = (char)(getNumber(row, col));
                minedBoared[row][col] = (char)(getNumber(row, col));
            }
        }
    }

    public static void action(){
        System.out.println("Would you like to [f]lag or make a [s]weep?");
        String activite = scan.nextLine();
        if(activite.equals("f")){
            System.out.println("What row?");
            int row = scan.nextInt()-1;
            scan.nextLine();
            System.out.println("What column?");
            int col = scan.nextInt()-1;
            scan.nextLine();
            minedBoared[row][col] = 'P';
        }
        else if(activite.equals("s")){
            System.out.println("What row?");
            int row = scan.nextInt()-1;
            scan.nextLine();
            System.out.println("What column?");
            int col = scan.nextInt()-1;
            scan.nextLine();
            if(bombs[row][col] == 'o'){
                System.out.println("you died");
                System.exit(0);
            }
            String value = Integer.toString(getNumber(row, col));
            minedBoared[row][col] = value.charAt(0);
            bombs[row][col] = value.charAt(0);
            //clear();
        }
    }

    public static void win(){
        int empties = 0;
        for(int i = 0; i < bombs.length;  i++){
            for(int j = 0; j < bombs.length; j++){
                if(bombs[i][j] != '□' && bombs[i][j] != 'o'){
                    empties += 1;
                }
            }
        }
        if(empties == emptySpaces){
            System.out.println("you win");
            System.exit(0);
        }
    }
    public static void main(String[] args){
        baord();
        inesm();
        while(true){
            win();
            System.out.println();
            System.out.println();
            printCutesyBoard();
            //printMeanBoard();
            action();
            //printMeanBoard();
            System.out.println();
            System.out.println();
            printCutesyBoard();
            win();
        }
}
}