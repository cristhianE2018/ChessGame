package Ajedrez_POO;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chess {

    public String[][] board;

    public Chess(){
        board = new String[8][8];
    }

    public void run(){

        Scanner leer = new Scanner(System.in);

        System.out.println("¿What piece do you want to move?: ");
        String letra = leer.nextLine();
        switch (letra){
            case "T":

                break;
            case "C":
                System.out.println("Type x ");
                int x = leer.nextInt();
                System.out.println("Type y: ");
                int y = leer.nextInt();

                if(moveHorse(x,y)){
                    board[x][y] = "C";
                }
                break;
        }
    }
    public boolean moveHorse(int x, int y){

        if(x-1 >= 0 && y-2 >=0){

            if(board[x][y] == "_"){
                return true;
            }
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * This method prints the chessboard with its initial structure
     */
    public void showChessBoard(){
        System.out.println("    A B C D E F G H ");
        for (int i = 0; i <board.length; i++) {
            System.out.print(board.length-i + " | ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void startChessBoard(){

        board[0][0] = "T";
        board[0][1] = "C";
        board[0][2] = "A";
        board[0][3] = "Q";
        board[0][4] = "K";
        board[0][5] = "A";
        board[0][6] = "C";
        board[0][7] = "T";

        for(int i=1; i<board.length-1; i++){
            for (int j = 0; j <board[i].length; j++) {
                if(i == 1 || i == 6){
                    board[i][j] = "P";
                }
                else {
                    board[i][j] = "_";
                }
            }
        }

        board[7][0] = "T";
        board[7][1] = "C";
        board[7][2] = "A";
        board[7][3] = "K";
        board[7][4] = "Q";
        board[7][5] = "A";
        board[7][6] = "C";
        board[7][7] = "T";

    }

}
