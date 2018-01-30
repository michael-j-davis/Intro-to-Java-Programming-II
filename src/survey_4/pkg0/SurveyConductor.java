/* Program Name: SurveyConductor
Author: Michael J Davis
Last Revision: 06/11/2017
*/

package survey_4.pkg0;

import javax.swing.JOptionPane;


public class SurveyConductor {

  
    public static void main(String[] args) {
        
        /******************Start of Survey Questions Entry Code****************/
             
        // Array declarations and initializations
        String[] surveyQuestions = new String[10];
        int[] respondentIDs = new int [10];
         
        Survey.fillQuestionArray();
        
        JOptionPane.showMessageDialog(null, "Enter 10 survey questions that will"
                + " be answered from\n1) Highly likely\n2) Likely\n3) Uncertain"
                + "\n2) Not likely\n5) Highly unlikely", 
                "Question Entry", JOptionPane.INFORMATION_MESSAGE);
        Survey.enterQuestions(surveyQuestions);
        Survey.confirmQuestions();
        
        /******************End of Survey Questions Entry Code******************/
        
        
        
        
        /******************Start Survey Questions Code*************************/
        
        String surveyOption = "";
                       
        while (!surveyOption.equals("1") || !surveyOption.equals("2") || 
                !surveyOption.equals("3") || !surveyOption.equals("4")){
                surveyOption = JOptionPane.showInputDialog(null, "Welcome to the "
                    + "Survey Creator.  What would you like to do?\n\n1) "
                    + "Create a customer survey\n2) Create an employee survey"
                    + "\n3) View stats by question " + "\n4)Exit ", "Survey Menu", 
                    JOptionPane.QUESTION_MESSAGE);
                
            switch(surveyOption){
                                              
                case "1":// Customer survey logic
                    JOptionPane.showMessageDialog(null, "Generating customer survey...", 
                        "Respondent Generation", JOptionPane.INFORMATION_MESSAGE);
                    
                    
                    
                    // Customer survey constructors
                    Survey survey1 = new Survey();
                    
                            
                    for(int i = 0; i < 10; i++){
                        respondentIDs[i] = survey1.generateRespondentID();
                                                
                         // Beginning customer survey questions
                        JOptionPane.showMessageDialog(null, "Now beginning survey"
                            + " for respondent "+ respondentIDs[i], 
                            "Respondent Generation", JOptionPane.INFORMATION_MESSAGE);
                        
                        // Display the format for responses
                        JOptionPane.showMessageDialog(null, "Survey answers will range"
                            + " from\n1) Highly likely\n2) Likely\n3) Uncertain"
                            + "\n2) Not likely\n5) Highly unlikely", 
                            "Response format", JOptionPane.INFORMATION_MESSAGE);
                        
                        survey1.presentQuestion(1, respondentIDs[i]);
                        survey1.presentQuestion(2, respondentIDs[i]);
                        survey1.presentQuestion(3, respondentIDs[i]);
                        survey1.presentQuestion(4, respondentIDs[i]);
                        survey1.presentQuestion(5, respondentIDs[i]);
                        survey1.presentQuestion(6, respondentIDs[i]);
                        survey1.presentQuestion(7, respondentIDs[i]);
                        survey1.presentQuestion(8, respondentIDs[i]);
                        survey1.presentQuestion(9, respondentIDs[i]);
                        survey1.presentQuestion(10, respondentIDs[i]);   
                    }// End of for
                                                                             
                                       
                    // Display survey grid
                    Survey.displaySurveyResults(1);
                    
                    // Display the top rated question
                    String topCustomerAnswer = Survey.topRatedQuestion();
                    String lowCustomerAnswer = Survey.lowRatedQuestion();
                                        
                    JOptionPane.showMessageDialog(null, "Top rated customer survey"
                            + " question was " + topCustomerAnswer, "Top rated" , 
                            JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Low rated customer survey"
                            + " question was " + lowCustomerAnswer, "Low rated", 
                            JOptionPane.INFORMATION_MESSAGE);
                    continue;
                
                case "2":// Employee survey logic
                    
                    JOptionPane.showMessageDialog(null, "Generating employee survey...", 
                        "Respondent Generation", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Employee survey constructors
                    Survey survey1e = new Survey("Employee Survey");
                    
                    survey1e.setTitle("Employee Survey");
                                                  
                    
                    for(int i = 0; i < 10; i++){
                        respondentIDs[i] = survey1e.generateRespondentID();
                        
                        // Beginning employee survey questions
                        
                        JOptionPane.showMessageDialog(null, "Now beginning survey"
                            + " for respondent "+ respondentIDs[i], 
                            "Respondent Generation", JOptionPane.INFORMATION_MESSAGE);
                        
                         // Display the format for responses
                        JOptionPane.showMessageDialog(null, "Survey answers will range"
                            + " from\n1) Highly likely\n2) Likely\n3) Uncertain"
                            + "\n2) Not likely\n5) Highly unlikely", 
                            "Response format", JOptionPane.INFORMATION_MESSAGE);
                        
                        survey1e.presentQuestion(1, respondentIDs[i]);
                        survey1e.presentQuestion(2, respondentIDs[i]);
                        survey1e.presentQuestion(3, respondentIDs[i]);
                        survey1e.presentQuestion(4, respondentIDs[i]);
                        survey1e.presentQuestion(5, respondentIDs[i]);
                        survey1e.presentQuestion(6, respondentIDs[i]);
                        survey1e.presentQuestion(7, respondentIDs[i]);
                        survey1e.presentQuestion(8, respondentIDs[i]);
                        survey1e.presentQuestion(9, respondentIDs[i]);
                        survey1e.presentQuestion(10, respondentIDs[i]);   
                    }// End of for
                     
                    
                    // Display survey grid
                    Survey.displaySurveyResults(2);
                    
                    // Display the top rated question
                    String topEmployeeAnswer = Survey.topRatedQuestion();
                    String lowEmployeeAnswer = Survey.lowRatedQuestion();
                                       
                    JOptionPane.showMessageDialog(null, "Top rated employee survey"
                            + " question was " + topEmployeeAnswer, "Top rated" , 
                            JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Low rated employee survey"
                            + " question was " + lowEmployeeAnswer, "Low rated", 
                            JOptionPane.INFORMATION_MESSAGE);
                                                            
                    continue;
                case "3": // Display question stats
                    
                    String questionOption = "";
                    int surveyOptionNum = 0;
                    
                    while (surveyOptionNum < 1 || surveyOptionNum > 10){
                        questionOption = JOptionPane.showInputDialog(null, "Which "
                                + "question statistics do you want to view? (Enter"
                                + " 1 - 10.  Enter '0' for the number 10)", 
                                "Choose a question", JOptionPane.QUESTION_MESSAGE);
                        if(surveyOption.matches("[0-9]")){
                            surveyOptionNum = Integer.parseInt(questionOption);
                        }// End of if
                    
                        
                        switch(surveyOptionNum){
                            
                            case 1:
                                Survey.displayQuestionStats(1);
                                break;
                            case 2:
                                Survey.displayQuestionStats(2);
                                break;
                            case 3:
                                Survey.displayQuestionStats(3);
                                break;
                            case 4:
                                Survey.displayQuestionStats(4);
                                break;
                            case 5:
                                Survey.displayQuestionStats(5);
                                break;
                            case 6:
                                Survey.displayQuestionStats(6);
                                break;
                            case 7:
                                Survey.displayQuestionStats(7);
                                break;
                            case 8:
                                Survey.displayQuestionStats(8);
                                break;
                            case 9:
                                Survey.displayQuestionStats(9);
                                break;
                            case 0:
                                Survey.displayQuestionStats(10);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Incorrect "
                                    + "menu option", "Error", JOptionPane.ERROR_MESSAGE);
                            
                        }// End of switch
                        break;
                    }// End of while
                
                    continue;    
                case "4":
                    
                    JOptionPane.showMessageDialog(null, "Good-bye!", "Exit", 
                        JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Incorrect menu option", "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    continue;
                    
            }// End of switch
            
            break;
        }// End of while
    
         System.exit(0);
         
    }// End of main
    
}// End of class