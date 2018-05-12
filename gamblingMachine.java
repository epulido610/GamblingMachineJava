/*
Ethan Pulido
CS/IS 130
Lab 3.1


Psuedocode
---------

create variables: int cherry, bar, barBar, barBarBar, seven, firstReel, secondReel, thirdReel, winnings;
set variables:  

Display main menu
ask user if they want to use program or quit
if user inout is y, resume, if not quit
ask user for their bet/coin value
call reelMethod three times for three different numbers
Display: "Payout is" then call Payout method by passing the firstReel, secondReel, thirdReel
loop user back to main

reelMethod
---------
random int as parameter

if 

5 return MAXVALS
0 return CHERRY
4 SEVEN
3  return BAR
2 return BAR_BAR
1 return BAR_BAR_BAR

payOut
---------
3 ints as parameters (r1, r2,r3)

create and set int winnings to 0
      
      
      
      if r1 = 4 and r2 = 4 and r3 = 4
	      
	         winnings = 1000
	      
	  if r1 = 3 and r2 = 3 and r3 = 3
	  
		      winnings = 160
	 
	  if r1 = 2 and r2 = 2 and r3 = 2
	 
	         winnings = 40
	
	   if r1 = 1  and r2 = 1 and r3 = 1
	     
		      winnings = 10;
	      
	   if r1 = 0 and r2 = 0 and r3 = 0
	   
		      winnings = 5
	    
      return winnings


*/



import java.util.Scanner;
import java.util.Random;

public class gamblingMachine{

   final static int MAXVALS = 5;
   final static int CHERRY = 0;
   final static int SEVEN = 4;
   final static int BAR = 3;
   final static int BAR_BAR = 2;
   final static int BAR_BAR_BAR = 1;
   
   public static void main(String[] args){
   
      Random randNumbers = new Random();
   
      int firstReel, secondReel, thirdReel, coin;
      
      char userChoice = 'y';
     
      
      Scanner keyboard = new Scanner(System.in);
   
   
      do{
      
         System.out.println("Welcome to the game that will  make us rich and you poor\n");
         System.out.println("y. to play");
         System.out.println("q. to quit");
         userChoice = keyboard.next().charAt(0);
         
            switch(userChoice){
            
               case 'y':
                  
                  System.out.println("Coin value");
                  coin = keyboard.nextInt();
                  
                  
                  firstReel = reelMethod(randNumbers);
                  secondReel = reelMethod(randNumbers);
                  thirdReel = reelMethod(randNumbers);
        

                  System.out.println("Payout is " + payOut(firstReel, secondReel, thirdReel)*coin);
                  break;
               
               case 'q':
               
                  System.exit(0);
               
               default:
                  
                  System.out.println("Incorrect char value, 1 or 2 pls smdh");
                  break;
                 
            }
         
      }while(userChoice != 'q');
   
   }
   
   public static int reelMethod(Random r){
   
      int value = r.nextInt(MAXVALS);
      switch(value){
      
      case CHERRY:
      
         System.out.println("Cherry");
         break;
         
      case BAR:
         System.out.println(" - ");
         break;
      
      case BAR_BAR:
      
         System.out.println("- -");
         break;
      
      case BAR_BAR_BAR:
      
         System.out.println("- - -");
         break;
         
      case SEVEN:
      
         System.out.println(" 7 ");
         break;
    
      }
      return value;
 
   }
   
   public static int payOut(int r1, int r2, int r3){
      
      int winnings = 0;
      
      if(r1 == 4 && r2 == 4 && r3 == 4)
	      {
	         winnings = 1000;
	      }
	   else if(r1 == 3 && r2 == 3 && r3 == 3)
	      {
		      winnings = 160;
	      }
	   else if(r1 == 2 && r2 == 2 && r3 == 2)
	      {
	         winnings = 40;
	      }
	   else if(r1 == 1  && r2 == 1 && r3 == 1)
	      {
		      winnings = 10;
	      }
	   else if(r1 == 0 && r2 == 0 && r3 == 0)
	      {
		      winnings = 5;
	      }
      return winnings;
   
   
   }


 }

