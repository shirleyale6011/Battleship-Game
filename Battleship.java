import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to battleship!");
        System.out.println("Here are the rules to the game: ");
        System.out.println("You will have 3 ships that you will place anywhere on the board, \nthen you will take turns guessing where the opponents ships are.");
        System.out.println(" ");
        map();
        System.out.println(" ");
        System.out.print(" ");

        input.close();
    }
    public static void map() {
        int[][] grid1 = new int[10][10];
        int[][] grid2 = new int[10][10];
    
        System.out.println("    1 2 3 4 5 6 7 8 9 10        1 2 3 4 5 6 7 8 9 10");
        System.out.println("   ---------------------       ---------------------");
            for (int i = 0; i < 10; i++) {
                char rowLetter = (char) ('A' + i);
                System.out.print(rowLetter + " | ");
                for (int j = 0; j < 10; j++) {
                    System.out.print(grid1[i][j] + " ");
                }
                System.out.print("    ");

                System.out.print(rowLetter + " | ");
                for (int j = 0; j < 10; j++) {
                    System.out.print(grid2[i][j] + " ");
                }

                System.out.println();
            }
   
    } 
    public static void ships() {
        Scanner input = new Scanner(System.in);
        for (int number = 1; number <= 3; number++)
        System.out.printf("Enter the corinates to ship %d: ", number);
        String shipplacement = input.next();

        input.close();
    }  
}
