import java.util.Random;
import java.util.Scanner;
class Game{
    public static void main(String[] args){
        Random rand = new Random();
        int rannum= rand.nextInt(10); // Random number between 1 and 100
        boolean isGuessCorrect = false;
        System.out.println("Guess the number: ");
        Scanner sc= new Scanner(System.in);
        while(!isGuessCorrect){
            int guess = sc.nextInt();
            if(guess <rannum){
                System.out.println("Too Low!");
            }
            else if(guess>rannum){
                System.out.println("Too High!");
            }
            else{
                System.out.println("Correct!");
                isGuessCorrect = true;
            }
        }
        sc.close();
    }
}