import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matriu = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    System.out.print(1 + " ");}
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }
}
