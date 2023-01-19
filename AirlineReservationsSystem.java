/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import javax.swing.*;
/**
 *
 * @author Dishti CHITAPAIN
 */
public class AirlineReservationsSystem {
static String[] Reservation = new String[21];
static int count = 0,count1 = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Twenty-one array cells are created to store integer values
        first array cell has index 0
        second array cell has index 1
        last array cell has index(size-1)=20
        */
        int counter;
        String input;
        for(counter=0;counter<Reservation.length;counter = counter + 1){
            Reservation[counter] = "Available";
        }
        JOptionPane.showMessageDialog(null ,"Welcome to Air Mauritius Airline Reservations System");
        JOptionPane.showMessageDialog(null ,"Customers must first choose between the smoking compartment and non-smoking compartment");
        int choice = 0;
        do{
        input = JOptionPane.showInputDialog("Enter 1 for choosing smoking compartment or enter 2 for choosing non-smoking compartment\nPress 3 to exit" );
        choice = Integer.parseInt(input);
        /*
        program must now make a decision
        here the condition is choice which evaluatesto an integer value
        */
        switch(choice){
        //body of the switch contains the different course of action
            case 1: Smoking();
            break;
            case 2: Nonsmoking();
            break;
            case 3: System.exit(0);
            break;
            default:JOptionPane.showMessageDialog(null, "The number is not valid\nTry again");            
           }
        }while(choice!=3); 
        
    }
     public static void Smoking(){
     String input1;
     int choice1;
     input1 = JOptionPane.showInputDialog("select between 1 to 10 \n select 0 to return to main screen");  
     choice1 =Integer.parseInt(input1);
     
     if(count==10){
        JOptionPane.showMessageDialog(null, "This compartment is full");
     }
     if(choice1==0){   
     }
     else{
         
     if(choice1<11 && Reservation[choice1]=="Available"){
         Reservation[choice1] = "The seat is booked";
         JOptionPane.showMessageDialog(null, "Your seat ="+ choice1 +" has been booked");
          full();
          }else if(choice1>10){
         JOptionPane.showMessageDialog(null, "This seat is not valid\nchoose another seat please.");
     }else 
         JOptionPane.showMessageDialog(null, "The seat is already booked\nchoose another seat please.");
     }
     }
     public static void Nonsmoking(){
      String input2;
      int choice2;
     input2 = JOptionPane.showInputDialog("select between 11 to 20 \n select 0 to return to main screen");  
     choice2 =Integer.parseInt(input2);
     if(count1==10){
        JOptionPane.showMessageDialog(null, "This compartment is full"); 
     }
     if(choice2==0){
         
     }else{
     
     if(choice2>10 && Reservation[choice2]=="Available"){
         Reservation[choice2] = "The seat is booked";  
        JOptionPane.showMessageDialog(null, "Your seat ="+ choice2 +" has been booked");
        full1();
     }else if(choice2<=10 || choice2>20){
         JOptionPane.showMessageDialog(null, "This seat is not valid\nchoose another seat please.");
     }else  JOptionPane.showMessageDialog(null, "The seat is already booked\nchoose another seat please.");   
     }
     }
     
     public static void full(){
     count= count +1;     
     }
    
     public static void full1(){
     count1= count1 +1;     
     }
    
    
}
