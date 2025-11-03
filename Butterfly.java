import java.util.*;
public class Butterfly{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Listen! Today in my garden, I saw so many butterflies. Would you like to see them? Then choose what size you want to see. Now choose a number between 2 and 10.");
while(true){
System.out.print("Enter your number:");

int n=sc.nextInt();

// upper part 

 for(int i=1 ; i<=n ; i++){
    for(int j =1; j<=i ; j++){
      System.out.print("*");
      }
    // space
    for(int j=1; j<=n-i ; j++){
      System.out.print("  ");
      }
      //star part
    for (int j=1; j<=i ; j++){
        System.out.print("*");
    }   
      System.out.println();
 }

// lower part

for(int i=n-1 ; i>=1 ; i--){
    for(int j =1; j<=i ; j++){
      System.out.print("*");
      }
    for(int j=1; j<=n-i ; j++){
      System.out.print("  ");
      }
      //star part
    for (int j=1; j<=i ; j++){
        System.out.print("*");
    }   
System.out.println();
}
System.out.println("Do you want to see more butterflies?");
}
}
}