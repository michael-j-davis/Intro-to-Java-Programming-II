/* Program Name: Survey_4.0
Author: Michael J Davis
Last Revision: 06/11/2017
*/


package survey_4.pkg0;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Survey {
    
    // Variable declarations
    private int respondentID = 0; private String title = "";
    private static String confirmChoice = ""; private static String changeChoice = "";
    private static int questionNums = 0;
    private int col0 = 0; private int col1 = 0; private int col2 = 0;
    private int col3 = 0; private int col4 = 0; private int col5 = 0;
    private int col6 = 0; private int col7 = 0; private int col8 = 0;
    private int col9 = 0;
    private static int topRated; private static int lowRated;
    private static String topQuestion = ""; private static String lowQuestion = "";
    private String surveyQuestion1 = ""; private String surveyQuestion2 = "";
    private String surveyQuestion3 = ""; private String surveyQuestion4 = "";
    private String surveyQuestion5 = ""; private String surveyQuestion6 = "";
    private String surveyQuestion7 = ""; private String surveyQuestion8 = "";
    private String surveyQuestion9 = ""; private String surveyQuestion10 = "";
    private int questionOneResponse = 0; private int questionTwoResponse = 0;
    private int questionThreeResponse = 0; private int questionFourResponse = 0;
    private int questionFiveResponse = 0; private int questionSixResponse = 0;
    private int questionSevenResponse = 0; private int questionEightResponse = 0;
    private int questionNineResponse = 0; private int questionTenResponse = 0;
 
            
    
    // Array declarations and initializations
    private static String[] surveyQuestions = new String[11]; /* Survey questions
    entered by the user */
    private static String[] questionArray = new String[11]; /* Array for question
    names */
    private static int[][] surveyResults = new int[10][10]; /* Responses entered
    by respondents */
    private static int[] respondentIDs = new int [10]; // Respondent IDs
    
    
    // Initialize questionArray with string names from questions
    public static void fillQuestionArray(){
    
        questionArray[0] = "Question 1";
        questionArray[1] = "Question 2";
        questionArray[2] = "Question 3";
        questionArray[3] = "Question 4";
        questionArray[4] = "Question 5";
        questionArray[5] = "Question 6";
        questionArray[6] = "Question 7";
        questionArray[7] = "Question 8";
        questionArray[8] = "Question 9";
        questionArray[9] = "Question 10";
    }
    
    
     // Getter and setter methods for title variable
    public String getTitle(){
        return title;
    }// End of method
    
    
    public void setTitle(String title){
        this.title = title;
    }// End of method
    
    
    // Method to enter survey questions
    public static void enterQuestions(String[] surveyQuestions){
        int questionCounter = 1;
       
        for(int i = 0; i < surveyQuestions.length; i++){
            Survey.surveyQuestions[i] = JOptionPane.showInputDialog(null, "Enter a survey "
            + "question", "Survey Question " + questionCounter,
            JOptionPane.QUESTION_MESSAGE);
                                  
            questionCounter++;
        }// End of for loop
        
    }// End of method
    
    
    // Method to generate respondent ID number
    public int generateRespondentID(){
        if(title.equalsIgnoreCase("Customer Survey")){
            return ++respondentID;
        }// End if
        else
            respondentID += 100;
                return respondentID;
    }// End of method
    
    
     
     // Method to confirm the survey questions entered
    public static void confirmQuestions(){
        
        int changeChoiceNum = 0;
                
        while(!confirmChoice.equalsIgnoreCase("y") || !confirmChoice.equalsIgnoreCase("n") ){
        confirmChoice = JOptionPane.showInputDialog(null, "Are these survey questions correct?"
                + "\nEnter 'Y' for YES or 'N' for NO\n" + surveyQuestions[0] + "\n" + 
                surveyQuestions[1] + "\n" + surveyQuestions[2]
                + "\n" + surveyQuestions[3] + "\n" + surveyQuestions[4] + "\n" + 
                surveyQuestions[5] + "\n" + surveyQuestions[6] + "\n" + surveyQuestions[7]
                + "\n" + surveyQuestions[8] + "\n" + surveyQuestions[9]);
                
            switch(confirmChoice){
                case "y":
                case "Y":
                 JOptionPane.showMessageDialog(null, "Survey questions have been saved");
                    break;
                
                case "n":
                case "N":
                    while(changeChoiceNum < 1 || changeChoiceNum > 10){
                     changeChoice = JOptionPane.showInputDialog(null, "Which question "
                        + "do you want to change? (Enter '0' for the number 10) ", 
                             "Survey Question ", JOptionPane.QUESTION_MESSAGE);
                    
                        if (changeChoice.matches("[0-9]")){ 
                            changeChoiceNum = Integer.parseInt(changeChoice);
                        }// End of if
                    break;
                    }// End of while
                
                Survey.changeQuestion(changeChoiceNum);     
                 break;                                      
                default:
                    JOptionPane.showMessageDialog(null, "Incorrect entry for confirm", "Error", 
                    JOptionPane.ERROR_MESSAGE);
                    Survey.confirmQuestions();
                   
            }// End of switch
            
        break; 
        
        }//End of while loop
      
    }// End of method    
    
    
    // Method to change survey questions
    private static void changeQuestion(int changeChoiceNum){
        
     
        switch(changeChoiceNum){
            case 1:
                surveyQuestions[0] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 1", "New question 1", JOptionPane.QUESTION_MESSAGE);
                break;
            case 2:
                surveyQuestions[1] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 2", "New question 2", JOptionPane.QUESTION_MESSAGE);
                break;
            case 3:
                surveyQuestions[2] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 3", "New question 3", JOptionPane.QUESTION_MESSAGE);
                break;
            case 4:
                surveyQuestions[3] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 4", "New question 4", JOptionPane.QUESTION_MESSAGE);
                break;
            case 5:
                surveyQuestions[4] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 5", "New question 5", JOptionPane.QUESTION_MESSAGE);
                break;
            case 6:
                surveyQuestions[5] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 6", "New question 6", JOptionPane.QUESTION_MESSAGE);
                break;
            case 7:
                surveyQuestions[6] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 7", "New question 7", JOptionPane.QUESTION_MESSAGE);
                break;
            case 8:
                surveyQuestions[7] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 8", "New question 8", JOptionPane.QUESTION_MESSAGE);
                break;
            case 9:
                surveyQuestions[8] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 9", "New question 9", JOptionPane.QUESTION_MESSAGE);
                break;
            case 0:
                surveyQuestions[9] = JOptionPane.showInputDialog(null, "Enter "
                        + "question 10", "New question 10", JOptionPane.QUESTION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Incorrect entry for questions", "Error", 
                JOptionPane.ERROR_MESSAGE);
                confirmQuestions();
                
        }// End of switch
        Survey.confirmQuestions();
    }// End of method
    
    
    // Method to log respondent IDs, question numbers, and survey responses
    public void logResponse(int respondentID, int questionNum, 
            int questionResponse){
                       
        switch(respondentID){
        
            case 1:
            case 100:
               int row = 0;
                respondentIDs[row] = respondentID;
                surveyResults[row][col0] = questionResponse;
                col0++;
                break;
                             
            case 2:
            case 200:
               row = 1;
                respondentIDs[row] = respondentID;
                surveyResults[row][col1] = questionResponse;
                col1++;
                break;
                
            case 3:
            case 300:
               row = 2;
                respondentIDs[row] = respondentID;
                surveyResults[row][col2] = questionResponse;
                col2++;
                break;
                
            case 4:
            case 400:
               row = 3;
                respondentIDs[row] = respondentID;
                surveyResults[row][col3] = questionResponse;
                col3++;
                break;
                
            case 5:
            case 500:
               row = 4;
                respondentIDs[row] = respondentID;
                surveyResults[row][col4] = questionResponse;
                col4++;
                break;
                
            case 6:
            case 600:
               row = 5;
                respondentIDs[row] = respondentID;
                surveyResults[row][col5] = questionResponse;
                col5++;
                break;
                
            case 7:
            case 700:
               row = 6;
                respondentIDs[row] = respondentID;
                surveyResults[row][col6] = questionResponse;
                col6++;
                break;
                
            case 8:
            case 800:
               row = 7;
                respondentIDs[row] = respondentID;
                surveyResults[row][col7] = questionResponse;
                col7++;
                break;
                
            case 9:
            case 900:
               row = 8;
                respondentIDs[row] = respondentID;
                surveyResults[row][col8] = questionResponse;
                col8++;
                break;
                
            case 10:
            case 1000:
               row = 9;
                respondentIDs[row] = respondentID;
                surveyResults[row][col9] = questionResponse;
                col9++;
                break;
                
            default:
                System.out.println("Error...");
               
        }// End of switch
        
    }// End of method
    
    
     // Method to display question stats
    public static void displayQuestionStats(int questionNum){
        
        questionNums = questionNum;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Question number\t\t" + "Respondent ID\t\t" + 
                        "Response\n");
        
        switch(questionNum){
            
            case 1:
                
                int ID = 0; int row = 0; int col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 0;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 2:
                
                ID = 0; row = 0; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 1;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 3:
                
                ID = 0; row = 0; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 2;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 4:
                
                ID = 0; row = 0; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 3;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 5:
                
                ID = 0; row = 0; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 4;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 6:
                
                ID = 0; row = 0; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 5;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 7:
                
                ID = 0; row = 0; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 6;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 8:
                
                ID = 0; row = 0; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 7;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 9:
                
                ID = 0; row = 0; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 8;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            case 10:
                
                ID = 0; row = 0; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 1; row = 1; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 2; row = 2; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 3; row = 3; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 4; row = 4; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 5; row = 5; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                          
                ID = 6; row = 6; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 7; row = 7; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 8; row = 8; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                
                ID = 9; row = 9; col = 9;
                System.out.print(questionNums + "\t\t\t" + respondentIDs[ID] + "\t\t\t" + surveyResults[row][col] + "\n");
                 System.out.println("\n\nPress any key to continue...\n");
                 keyboard.nextLine();
                break;
                
            default:
                System.out.println("Error...");
        }// End of switch
   
        
    }// End of method
    
    
    // Method to display the survey results grid
    public static void displaySurveyResults(int surveyNum){
        
        switch(surveyNum){
        
            case 1:
                System.out.println("\n\n\nCUSTOMER SURVEY\n");
                System.out.println("Respondent ID\t\t" + "Question 1\t\t"+ 
                    "Question 2\t\t" + "Question 3\t\t" + "Question 4 \t\t" + 
                    "Question 5\t\t" + "Question 6\t\t" + "Question 7\t\t" + 
                    "Question 8\t\t" + "Question 9\t\t" + "Question 10\t\t");
                
                System.out.print(respondentIDs[0]);
                
                for(int col = 0; col < 10; col++){
                    int row = 0;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[1]);
                
                for(int col = 0; col < 10; col++){
                    int row = 1;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[2]);
                
                for(int col = 0; col < 10; col++){
                    int row = 2;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[3]);
                
                for(int col = 0; col < 10; col++){
                    int row = 3;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[4]);
                
                for(int col = 0; col < 10; col++){
                    int row = 4;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[5]);
                
                for(int col = 0; col < 10; col++){
                    int row = 5;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[6]);
                
                for(int col = 0; col < 10; col++){
                    int row = 6;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[7]);
                
                for(int col = 0; col < 10; col++){
                    int row = 7;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[8]);
                
                for(int col = 0; col < 10; col++){
                    int row = 8;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[9]);
                
                for(int col = 0; col < 10; col++){
                    int row = 9;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                System.out.println();
                break;
                
            case 2:
                
                System.out.println("\n\n\nEMPLOYEE SURVEY\n");
                System.out.println("Respondent ID\t\t" + "Question 1\t\t"+ 
                    "Question 2\t\t" + "Question 3\t\t" + "Question 4 \t\t" + 
                    "Question 5\t\t" + "Question 6\t\t" + "Question 7\t\t" + 
                    "Question 8\t\t" + "Question 9\t\t" + "Question 10\t\t");
                
                System.out.print(respondentIDs[0]);
                
                for(int col = 0; col < 10; col++){
                    int row = 0;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[1]);
                
                for(int col = 0; col < 10; col++){
                    int row = 1;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[2]);
                
                for(int col = 0; col < 10; col++){
                    int row = 2;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[3]);
                
                for(int col = 0; col < 10; col++){
                    int row = 3;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[4]);
                
                for(int col = 0; col < 10; col++){
                    int row = 4;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[5]);
                
                for(int col = 0; col < 10; col++){
                    int row = 5;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[6]);
                
                for(int col = 0; col < 10; col++){
                    int row = 6;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[7]);
                
                for(int col = 0; col < 10; col++){
                    int row = 7;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[8]);
                
                for(int col = 0; col < 10; col++){
                    int row = 8;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                
                System.out.println();
                System.out.print(respondentIDs[9]);
                
                for(int col = 0; col < 10; col++){
                    int row = 9;
                    int results = surveyResults[row][col];
                    System.out.print("\t\t\t" + results);
                    
                }// End of for
                System.out.println();
                break;
                
            default:
                System.out.println("Error...");
                            
        }// End of switch
        
    }// End of method
    
    
     public static String topRatedQuestion(){
         
        int[] questionTotals = new int [10]; // Totals for each question
        
        int col = 0;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 1;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 2;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 3;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 4;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 5;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 6;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 7;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 8;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 9;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        
                
        topRated = questionTotals[0];
        
        for(int i = 0; i < questionTotals.length; i++){
            
            if(questionTotals[i] <= topRated){
            
                topRated = questionTotals[i];
                topQuestion = questionArray[i];
            }// end of if
            
                                       
        }// end of for
              
        return topQuestion;
        
    }// End of method
     
    
    public static String lowRatedQuestion(){
         
        int[] questionTotals = new int [10]; // Totals for each question
        
        int col = 0;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 1;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 2;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 3;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 4;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 5;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 6;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 7;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 8;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        col = 9;
        for(int row = 0; row < surveyResults.length; row++){
        
            questionTotals[row] += surveyResults[row][col];
        }
        
               
        lowRated = questionTotals[0];
        
        for(int i = 0; i < questionTotals.length; i++){
            
            if(questionTotals[i] >= lowRated){
            
                lowRated = questionTotals[i];
                lowQuestion = questionArray[i];
            }// end of if
                                                 
        }// end of for
              
        return lowQuestion;
        
    }// End of method
    
    public void presentQuestion(int questionNum){
        
        switch(questionNum){
            
            case 1:
                surveyQuestion1 = surveyQuestions[0];
                String questionOneString;
                                                           
                while(questionOneResponse < 1 || questionOneResponse > 5){
                    questionOneString = JOptionPane.showInputDialog(null, surveyQuestion1,
                    questionArray[0], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionOneString.matches("[1-5]")){
                        questionOneResponse = Integer.parseInt(questionOneString);
                        int row = 0;
                        int col = 0;
                        surveyResults[row][col] = questionOneResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 2:
                surveyQuestion2 = surveyQuestions[1];
                String questionTwoString;
                                                            
                while(questionTwoResponse < 1 || questionTwoResponse > 5){
                    questionTwoString = JOptionPane.showInputDialog(null, surveyQuestion2,
                    questionArray[1], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionTwoString.matches("[1-5]")){
                        questionTwoResponse = Integer.parseInt(questionTwoString);
                        int row = 0;
                        int col = 1;
                        surveyResults[row][col] = questionTwoResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 3:
                surveyQuestion3 = surveyQuestions[2];
                String questionThreeString;
                                                           
                while(questionThreeResponse < 1 || questionThreeResponse > 5){
                    questionThreeString = JOptionPane.showInputDialog(null, surveyQuestion3,
                    questionArray[2], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionThreeString.matches("[1-5]")){
                        questionThreeResponse = Integer.parseInt(questionThreeString);
                        int row = 0;
                        int col = 2;
                        surveyResults[row][col] = questionThreeResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 4:
                surveyQuestion4 = surveyQuestions[3];
                String questionFourString;
                                                            
                while(questionFourResponse < 1 || questionFourResponse > 5){
                    questionFourString = JOptionPane.showInputDialog(null, surveyQuestion4,
                    questionArray[3], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionFourString.matches("[1-5]")){
                        questionFourResponse = Integer.parseInt(questionFourString);
                        int row = 0;
                        int col = 3;
                        surveyResults[row][col] = questionFourResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 5:
                surveyQuestion5 = surveyQuestions[4];
                String questionFiveString;
                                                           
                while(questionFiveResponse < 1 || questionFiveResponse > 5){
                    questionFiveString = JOptionPane.showInputDialog(null, surveyQuestion5,
                    questionArray[4], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionFiveString.matches("[1-5]")){
                        questionFiveResponse = Integer.parseInt(questionFiveString);
                        int row = 0;
                        int col = 4;
                        surveyResults[row][col] = questionFiveResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 6:
                surveyQuestion6 = surveyQuestions[5];
                String questionSixString;
                                                          
                while(questionSixResponse < 1 || questionSixResponse > 5){
                    questionSixString = JOptionPane.showInputDialog(null, surveyQuestion6,
                    questionArray[5], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionSixString.matches("[1-5]")){
                        questionFiveResponse = Integer.parseInt(questionSixString);
                        int row = 0;
                        int col = 5;
                        surveyResults[row][col] = questionFiveResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 7:
                surveyQuestion7 = surveyQuestions[6];
                String questionSevenString;
                                                            
                while(questionSevenResponse < 1 || questionSevenResponse > 5){
                    questionSevenString = JOptionPane.showInputDialog(null, surveyQuestion7,
                    questionArray[6], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionSevenString.matches("[1-5]")){
                        questionSevenResponse = Integer.parseInt(questionSevenString);
                        int row = 0;
                        int col = 6;
                        surveyResults[row][col] = questionSevenResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 8:
                surveyQuestion8 = surveyQuestions[7];
                String questionEightString;
                                                            
                while(questionEightResponse < 1 || questionEightResponse > 5){
                    questionEightString = JOptionPane.showInputDialog(null, surveyQuestion8,
                    questionArray[7], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionEightString.matches("[1-5]")){
                        questionEightResponse = Integer.parseInt(questionEightString);
                        int row = 0;
                        int col = 7;
                        surveyResults[row][col] = questionEightResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 9:
                surveyQuestion9 = surveyQuestions[8];
                String questionNineString;
                                                         
                while(questionNineResponse < 1 || questionNineResponse > 5){
                    questionNineString = JOptionPane.showInputDialog(null, surveyQuestion9,
                    questionArray[8], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionNineString.matches("[1-5]")){
                        questionNineResponse = Integer.parseInt(questionNineString);
                        int row = 0;
                        int col = 8;
                        surveyResults[row][col] = questionNineResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
                
            case 10:
                surveyQuestion10 = surveyQuestions[9];
                String questionTenString;
                                                             
                while(questionTenResponse < 1 || questionTenResponse > 5){
                    questionTenString = JOptionPane.showInputDialog(null, surveyQuestion10,
                    questionArray[9], JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionTenString.matches("[1-5]")){
                        questionTenResponse = Integer.parseInt(questionTenString);
                        int row = 0;
                        int col = 9;
                        surveyResults[row][col] = questionTenResponse;
                        break;
                    }// End of if
                    
                }// End of while
                break;
            default:
                JOptionPane.showMessageDialog(null, "Question processing error", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                     
        }// End of switch
        
    }// End of method
    
    public void presentQuestion(int questionNum, int respondentID){
        
        surveyQuestion1 = questionArray[0]; surveyQuestion2 = questionArray[1];
        surveyQuestion3 = questionArray[2]; surveyQuestion4 = questionArray[3];
        surveyQuestion5 = questionArray[4]; surveyQuestion6 = questionArray[5];
        surveyQuestion7 = questionArray[6]; surveyQuestion8 = questionArray[7];
        surveyQuestion9 = questionArray[8]; surveyQuestion10 = questionArray[9];
        String questionOneString = "", questionTwoString = "", questionThreeString = "",
                questionFourString = "", questionFiveString = "", questionSixString = "",
                questionSevenString = "", questionEightString = "", questionNineString = "",
                questionTenString = "";
        questionOneResponse = 0; questionTwoResponse = 0; questionThreeResponse = 0; 
        questionFourResponse = 0; questionFiveResponse = 0; questionSixResponse = 0;
        questionSevenResponse = 0; questionEightResponse = 0; questionNineResponse = 0; 
        questionTenResponse = 0;
        
        switch(questionNum){
            
            case 1:
                surveyQuestion1 = surveyQuestions[0];
                                                            
                while(questionOneResponse < 1 || questionOneResponse > 5){
                    questionOneString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion1, questionArray[0], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionOneString.matches("[1-5]")){
                        questionOneResponse = Integer.parseInt(questionOneString);
                        
                    }// End of if
                    logResponse(respondentID, questionNum, questionOneResponse);
                }// End of while
                
                break;
                
            case 2:
                surveyQuestion2 = surveyQuestions[1];
                                                            
                while(questionTwoResponse < 1 || questionTwoResponse > 5){
                    questionTwoString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion2, questionArray[1], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionTwoString.matches("[1-5]")){
                        questionTwoResponse = Integer.parseInt(questionTwoString);
                        
                    }// End of if
                    logResponse(respondentID, questionNum, questionTwoResponse);
                }// End of while
                
                break;
                
            case 3:
                surveyQuestion3 = surveyQuestions[2];
                                                            
                while(questionThreeResponse < 1 || questionThreeResponse > 5){
                    questionThreeString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion3, questionArray[2], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionThreeString.matches("[1-5]")){
                        questionThreeResponse = Integer.parseInt(questionThreeString);
                        
                    }// End of if
                    logResponse(respondentID, questionNum, questionThreeResponse);
                }// End of while
                
                break;
                
            case 4:
                surveyQuestion4 = surveyQuestions[3];
                                                            
                while(questionFourResponse < 1 || questionFourResponse > 5){
                    questionFourString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion4, questionArray[3], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionFourString.matches("[1-5]")){
                        questionFourResponse = Integer.parseInt(questionFourString);
                        
                    }// End of if
                    logResponse(respondentID, questionNum, questionFourResponse);
                }// End of while
                
                break;
                
            case 5:
                surveyQuestion5 = surveyQuestions[4];
                                                            
                while(questionFiveResponse < 1 || questionFiveResponse > 5){
                    questionFiveString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion5, questionArray[4], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionFiveString.matches("[1-5]")){
                        questionFiveResponse = Integer.parseInt(questionFiveString);
                        
                    }// End of if
                    logResponse(respondentID, questionNum, questionFiveResponse);
                }// End of while
                
                break;
                
            case 6:
                surveyQuestion6 = surveyQuestions[5];
                                                            
                while(questionSixResponse < 1 || questionSixResponse > 5){
                    questionSixString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion6, questionArray[5], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionSixString.matches("[1-5]")){
                        questionSixResponse = Integer.parseInt(questionSixString);
                        
                    }// End of if
                    logResponse(respondentID, questionNum, questionSixResponse);
                }// End of while
                
                break;
                
            case 7:
                surveyQuestion7 = surveyQuestions[6];
                                                            
                while(questionSevenResponse < 1 || questionSevenResponse > 5){
                    questionSevenString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion7, questionArray[6], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionSevenString.matches("[1-5]")){
                        questionSevenResponse = Integer.parseInt(questionSevenString);
                        
                    }// End of if
                    logResponse(respondentID, questionNum, questionSevenResponse);
                }// End of while
                
                break;
                
            case 8:
                surveyQuestion8 = surveyQuestions[7];
                                                            
                while(questionEightResponse < 1 || questionEightResponse > 5){
                    questionEightString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion8, questionArray[7], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionEightString.matches("[1-5]")){
                        questionEightResponse = Integer.parseInt(questionEightString);
                        
                    }// End of if
                    logResponse(respondentID, questionNum, questionEightResponse);
                }// End of while
                
                break;
                
            case 9:
                surveyQuestion9 = surveyQuestions[8];
                                                            
                while(questionNineResponse < 1 || questionNineResponse > 5){
                    questionNineString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion9, questionArray[8], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionNineString.matches("[1-5]")){
                        questionNineResponse = Integer.parseInt(questionNineString);
                                    
                    }// End of if
                    logResponse(respondentID, questionNum, questionNineResponse);
                }// End of while
                
                break;
                
            case 10:
                surveyQuestion10 = surveyQuestions[9];
                                                            
                while(questionTenResponse < 1 || questionTenResponse > 5){
                    questionTenString = JOptionPane.showInputDialog(null, "Respondent " +
                            respondentID + "," + " please answer the following:" + 
                            "\n" + surveyQuestion10, questionArray[9], 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(questionTenString.matches("[1-5]")){
                        questionTenResponse = Integer.parseInt(questionTenString);
                                     
                    }// End of if
                    logResponse(respondentID, questionNum, questionTenResponse);
                }// End of while
               
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Question processing error", 
                        "Error", JOptionPane.ERROR_MESSAGE);;
        }// End of switch
        
    }// End of method
    
    
   
    
          
    // Overloaded non-default constructors
    Survey(){
        title = "Customer Survey";
    }// End of constructor
    
    
    Survey(String title){
        this.title = title;
    }// End of constructor
    
    
}// End of class
