//Date: September 05, 2024
//Description: This program allows the user to play rock, paper, scissors with
//the computer.
//Name: Krissy Zhong
import java.util.Scanner;
public class RPS{
 public static void main(String[] args){
 byte play = 0;
 byte userScore = 0;
 String[] userResults = new String[3];
 do{
 System.out.println("Welcome to the Rock Paper Scissors game!");
 System.out.println("Enter '1' to play");
 System.out.println("You must win at least 2 games out of 3 to win.");
 userResults = resultsWinLose();
 userScore = score(userResults);
 System.out.println("Your results for the games are: " + userResults[0] + " " + userResults[1] + " " +
userResults[2]);
 System.out.println("Your score is " + userScore);

 if(userScore < 2){
 System.out.println("Sorry, you lost!");
 }else{
 System.out.println("You won!");
 }
 }while(play != 1);
 }
 public static byte score(String[] results){
 byte userScore = 0;
 for(int i = 0; i < 3; i++){
 if(results[i] == "win"){
 userScore += 1;
 }
 }
 return userScore;}
 public static String[] resultsWinLose(){
 Scanner sc = new Scanner(System.in);
 byte userSelection;
 byte computerSelection;
 String[] results = new String[3];
 for(int i = 0; i < 3; i++){
 System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors");
 userSelection = sc.nextByte();
 computerSelection = (byte)((Math.random()*3) + 1);
 if(userSelection == computerSelection){
 switch(userSelection){
 case 1:
 System.out.println("You and the computer played rock. Tie.");
 results[i] = "tie";
 break;
 case 2:
 System.out.println("You and the computer played paper. Tie.");
 results[i] = "tie";
 break;
 case 3:
 System.out.println("You and the computer played scissors. Tie.");
 results[i] = "tie";
 break;
 }
 }else if(userSelection == 1 && computerSelection == 2){
 results[i] = "lose";
 System.out.println("You played rock and the computer played paper. Computer win.");
 }else if(userSelection == 1 && computerSelection == 3){
 results[i] = "win";
 System.out.println("You played rock and the computer played scissors. User win.");
 }else if(userSelection == 2 && computerSelection == 1){
 results[i] = "win";
 System.out.println("You played paper and the computer played rock. User win");
 }else if(userSelection == 2 && computerSelection == 3){
 results[i] = "lose";
 System.out.println("You played paper and the computer played scissors. Computer win");
 }else if(userSelection == 3 && computerSelection == 1){
 results[i] = "lose";
 System.out.println("You played scissors and the computer played rock. Computer win");
 }else if(userSelection == 3 && computerSelection == 2){
 results[i] = "win";
 System.out.println("You played scissors and the computer played paper. User win.");
 }
 }
 return results;}
}
