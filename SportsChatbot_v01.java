import java.util.Scanner;

public class SportsChatbot_v01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String response = "";
      
      System.out.println("Welcome to the sports chatbot!");
      System.out.println("What sport would you like to talk about?");
      response = input.nextLine().toLowerCase();
      
      while (!response.equals("bye")) {
         switch (response) {
            case "football":
               System.out.println("What football team would you like to know about?");
               String team = input.nextLine().toLowerCase();
               if (team.equals("real madrid")) {
                  System.out.println("Real Madrid has won the Champions League 13 times!");
               } else if (team.equals("manchester united")) {
                  System.out.println("Manchester United has won the Premier League 20 times!");
               } else {
                  System.out.println("Sorry, I don't know anything about that team.");
               }
               break;
            case "basketball":
               System.out.println("What basketball team would you like to know about?");
               String team2 = input.nextLine().toLowerCase();
               if (team2.equals("los angeles lakers")) {
                  System.out.println("The Los Angeles Lakers have won the NBA championship 17 times!");
               } else if (team2.equals("boston celtics")) {
                  System.out.println("The Boston Celtics have won the NBA championship 17 times!");
               } else {
                  System.out.println("Sorry, I don't know anything about that team.");
               }
               break;
            default:
               System.out.println("Sorry, I don't know anything about that sport.");
               break;
         }
         
         System.out.println("What else would you like to talk about?");
         response = input.nextLine().toLowerCase();
      }
      
      System.out.println("Goodbye!");
   }
}
