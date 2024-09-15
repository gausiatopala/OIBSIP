import java.util.Scanner;

public class guessing {
    private static final int max_attempts=3;
    private static final int number_to_guess=9;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean playAgain; 
        do{
            int attempts=0;
            boolean hasguessedcorrectnumber=false;
            System.out.println("guess a number between 1-100");
            while (!hasguessedcorrectnumber && attempts<max_attempts ) {
                System.out.println("enter your guess");
                int userGuess=sc.nextInt();
                attempts++;
                if (userGuess==number_to_guess) {
                    hasguessedcorrectnumber=true;
                    System.out.println("you win the number you guessed is right");
                
                    
                }else if (userGuess<number_to_guess) {
                    hasguessedcorrectnumber=false;
                    System.out.println("you lose the number you guessed is less");
                }
                else  {
                    hasguessedcorrectnumber=false;
                    System.out.println("you lose the number you guessed is high");
                }
                if (!hasguessedcorrectnumber && attempts < max_attempts) {
                    int attemptsLeft = max_attempts - attempts;
                    System.out.println("You have " + attemptsLeft + " attempts left.");
                }
                    
                }
            
                
            
     
            if (!hasguessedcorrectnumber) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + number_to_guess);
            }
            System.out.println("do you want to play again(yes/no)");
            String response=sc.next();
            playAgain=response.equalsIgnoreCase("yes");
          
                
         } while (playAgain); 
          sc.close();
            System.out.println("thsnkyou for playing");
        }
    }
    
    


        

        
    

