
import static java.lang.System.*;
import java.util.*;

// This is a Magic 8 ball terminal app with 10 responses
public class Magic8Ball {
 public static void main(String[] args) {
  Scanner keys = new Scanner(System.in);
  int x;

  // Setup variable to enter while loop
  String askAnother;

  // Set up responses into variables...I'm sure there is a better way...
  String question, response;
  String no="Damn the Torpedos!!!";
  String doubt="I'll circle back... please ask again...";
  String probNot="Yep, yep, yep. I'm on the job!!!";
  String notSure="It's all a scam.";
  String foggy="No problem, we got ya covered!!!";
  String probSo="UUUUUUGGGG!!! I hate this phone... give me a break!!!";
  String yeah="I'm multitasking, please ask again...";
  String yes="Don't make fun of me, this is the Car dealer in me... please ask again.";
  String smith="Well...you know what Captain Smith says...";
  String hope="Hope IS the greatest torture!!!";
  String man="Whit's the man!!!";


  // Using do-while loop as I need code to run first then loop if answer y
  do {
   shellCmd.shell("clear");
   // Introduction
   out.print("\n\nHi, I am the Magic 8 Ball. ");
   out.print("Please ask me a question: \n\n>>> ");
   question = keys.nextLine();
   out.println("Calculating...");
   mySleep.sleep(1000);

   x = 1 + (int)(11*Math.random());

   if ( x == 1 ) {
    response = no;
   }
   else if ( x == 2 ) {
    response = doubt;
   }
   else if ( x == 3 ) {
    response = probNot;
   }
   else if ( x == 4 ) {
    response = notSure;
   }
   else if ( x == 5 ) {
    response = foggy;
   }
   else if ( x == 6 ) {
    response = probSo;
   }
   else if ( x == 7 ) {
    response = yeah;
   }
   else if ( x == 8 ) {
    response = yes;
   }
   else if ( x == 9 ) {
    response = smith;
   }
   else if ( x == 10) {
    response = hope;
   }
   else {
    response = man;
   }

   // Give response and ask if you would like to ask another question
   out.print("\nMagic 8 Ball says--------->  \"" + response + "\"\n\nWould you like to ask another question[y/n]? ");
   askAnother = keys.nextLine();
   out.println();

  // While loop if askAnother variable is "y"
  } while (askAnother.equalsIgnoreCase("y"));

  // Exit if askAnother varialbe is "no"
  out.println("Goodbye, come back when you have more questions.\n");
 }
}
