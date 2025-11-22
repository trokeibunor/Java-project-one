import java.util.Scanner;
import java.util.Random;


public class myJavaApp {
    //##################################################

    // Method to greet the user
    public static void greetUser(String userName){
        String welcomeMessage = "Hello, " + userName + "! Welcome to the math quiz. You will be provided with 5 questions, and each carries one mark. Good luck!";
        System.out.println(welcomeMessage);
    }
    // Method to print result
    public static void printResult(String userName){
        String farewellMessage = "Thanks for giving the quiz, " + userName + ". You will get your result soon.";
        System.out.println(farewellMessage);
    }
    // Method to print question in the correct format.
    public static void printQuestion(int num1, int num2, String op){
        //Enter your code here to print a question
        String question =  "What is " + num1 + op + num2 + " ?";
        System.out.print(question);
    }
    // Method to give feedback to the user.
    public static void answerFeedback(int userAnswer, int correctAnswer){
        //Enter code to let the user know their and correct answers
        // Feedback for Question 5
        System.out.println("Your answer is: " + userAnswer);
        System.out.println("The correct answer is: " + correctAnswer);
    }
  
    //##################################################

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num1;
        int num2;
        String op;
        String question;
        String farewellMessage;
        int userAnswer;
        int correctAnswer;

        System.out.print("Please enter your name: ");
        String userName = scan.nextLine();

        // Make a customized greeting for the user and print it.
        greetUser(userName);

        // Make 5 questions.

        // Question 1
        num1 = random.nextInt(10) + 1; 
        num2 = random.nextInt(10) + 1; 
        op = " + ";
        printQuestion(num1, num2, op); // Question printing method call Question 1
        // Input for Question 1
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 1
        correctAnswer = num1 + num2;
        // Feedback for Question 1
        answerFeedback(userAnswer, correctAnswer); // Feedback method call Question 1


        // Question 2
        num1 = random.nextInt(10) + 1; 
        num2 = random.nextInt(10) + 1; 
        op = " - ";
        // Question printing method call Question 2
        printQuestion(num1, num2, op);

        // Input for Question 2
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 2
        correctAnswer = num1 - num2;
        // Feedback for Question 2
        // Feedback method call Question 2
        answerFeedback(userAnswer, correctAnswer);
        

        
        // Question 3
        num1 = random.nextInt(10) + 1; 
        num2 = random.nextInt(10) + 1; 
        op = " / ";
        // Question printing method call Question 3
        printQuestion(num1, num2, op);
        
        
        // Input for Question 3
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 3
        correctAnswer = (int)(num1 / num2);
        // Feedback for Question 3
        // Feedback method call Question 3
        answerFeedback(userAnswer, correctAnswer);


        // Question 4
        num1 = random.nextInt(10) + 1; 
        num2 = random.nextInt(10) + 1; 
        op = " * ";
        // Question printing method call Question 4
        printQuestion(num1, num2, op);

        // Input for Question 4
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 4
        correctAnswer = num1 * num2;
        // Feedback for Question 4
        // Feedback method call Question 4
        answerFeedback(userAnswer, correctAnswer);
        

        // Question 5
        num1 = random.nextInt(10) + 1;  
        num2 = random.nextInt(10) + 1; 
        op = " + ";
        // Question printing method call Question 5
        printQuestion(num1, num2, op);

        // Input for Question 5
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 5
        correctAnswer = num1 + num2;
        // Feedback for Question 5
        // Feedback method call Question 5
        answerFeedback(userAnswer, correctAnswer);

        // Print a customized farewell message.
        printResult(userName);

    }
}