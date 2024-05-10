import java.util.Scanner;
/** 
Program description: Rock, paper, scissors game.
Author: Berke Şahin
E-mail address: Sayanati517@gmail.com 
Homework Number: 210401050
Last Changed:
*/
public class RockScissors {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Rock, Paper, Scissors");
        System.out.println("Enter your choices(for rock:r, for paper:p, for scissors:s): ");
        //I gave the user the right to choose 3 options. The same rule applies to other users. Then I closed the scanner.
        String choice = input.nextLine();
        String choice2 = input.nextLine();
        input.close();
        //First of all, I put the options that will occur when the first user makes a rock.
        //Since letters can be uppercase or lowercase, I used the equalsIgnoreCase method.
        //Finally, system print the what happened.
        if(choice.equalsIgnoreCase("r")){
            if(choice2.equalsIgnoreCase("r")){
            System.out.println("User 1 choosed rock, user 2 choosed rock. draw!");
        }
        else if(choice2.equalsIgnoreCase("p")){
            System.out.println("User 1 choosed rock, user 2 choosed paper. User 2 wins.");
        }
        else if(choice2.equalsIgnoreCase("s")){
            System.out.println("User 1 choosed rock, user 2 choosed scissors. User 1 wins.");
        }
        else{
            System.out.println("Invalid choice");
        }
        }
        //I am putting the options that will occur when the first user makes paper.
        else if(choice.equalsIgnoreCase("p")){
            if(choice2.equalsIgnoreCase("r")){
            System.out.println("User 1 choosed paper, user 2 choosed rock. User 1 wins.");
        }
        else if(choice2.equalsIgnoreCase("p")){
            System.out.println("User 1 choosed paper, user 2 choosed paper. draw!");
        }
        else if(choice2.equalsIgnoreCase("s")){
            System.out.println("User 1 choosed paper, user 2 choosed scissors. User 2 wins.");
        }
        else{
            System.out.println("Invalid choice");
        }
        }
        //I am putting the options that will occur when the first user makes scissors.
        else if(choice.equalsIgnoreCase("s")){
            if(choice2.equalsIgnoreCase("r")){
            System.out.println("User 1 choosed scissors, user 2 choosed rock. User 2 wins.");
        }
        else if(choice2.equalsIgnoreCase("p")){
            System.out.println("User 1 choosed scissors, user 2 choosed paper. User 1 wins.");
        }
        else if(choice2.equalsIgnoreCase("s")){
            System.out.println("User 1 choosed scissors, user 2 choosed scissors. draw!");
        }
        else{
            System.out.println("Invalid choice");
        }
        }
        //I am putting the options that will occur when the second user makes a wrong choice. They get error.
        else{
            System.out.println("Invalid choice");
        }
    }  
}