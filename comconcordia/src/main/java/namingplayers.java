

import java.util.Scanner;

public class namingplayers {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner a = new Scanner(System.in);
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        System.out.println("Enter the no of players (2-5)");
        int pinp = a.nextInt();
        String pname;
        int i;
        for (i = 0; i < pinp; i++) {
            System.out.print("Enter the name of the player " + (i+1) + ":");
            pname = a.next();
            names[i] = pname;
            if (i == 0){
                System.out.println("Player name : " + ANSI_RED + pname + ANSI_RESET);
            }
            else if (i == 1){
                System.out.println("Player name : " + ANSI_YELLOW + pname + ANSI_RESET);
            }
            else if (i == 2){
                System.out.println("Player name : " + ANSI_PURPLE + pname + ANSI_RESET);
            }
            else if (i == 3){
                System.out.println("Player name : " + ANSI_BLUE + pname + ANSI_RESET);
            }
            else
            {
                System.out.println("Player name : " + ANSI_CYAN + pname + ANSI_RESET);
            }
        }


}
}