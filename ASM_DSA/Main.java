/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM_DSA;
import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
           static Queue queue1 = new Queue(100);

    public static void Menu(){
        System.out.println("_________________________");
        System.out.println("|    Welcome to DSA    ");
        System.out.println("|________________________");
        System.out.println("1. Input Data ");
        System.out.println("2. Display Data ");
        System.out.println("3. Delete Data ");
        System.out.println("4. Exit");
        System.out.println("_________________________");
    }
    public static boolean isLimits(String array){
        char[] charArr = array.toCharArray();
        if(charArr.length <= 250 ){
            return true;
        }else{
            return false;
        }
    }
    public static Message Data(){
        Message mes = new Message();
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();     
        mes.setName(name);
        System.out.println("Enter Your Message: ");
        String message = sc.nextLine();
        while(!isLimits(message)){
            System.out.println("Sorry, Your Message Character limit is 250 , PLease Try Again!");
            System.out.println("Enter Your Message: ");
            message = sc.nextLine();
        }
        mes.setMessage(message);
        return mes;
    }
    
     public static int Option(){
        boolean check=true;
         int tmp =0;
         do {            
             System.out.println("Select Your Option: ");
             try {
                 tmp = sc.nextInt();
                 check=false;
             } catch (InputMismatchException e) {
                 System.out.println(e);
                 System.out.println("You can only enter Number, Please Try Again !");
                 sc.next();
             }
        } while (check);
         return tmp;
    }
    public static void main(String[] args) {
       
        int choice =0;
        Menu: do {                
                Menu();
                 //System.out.println("Enter Number : ");
                choice=Option();
                sc.nextLine();
                switch(choice){
                    case 1:                     
                       Message mes = Data();
                        Date date1 = new Date();
                        System.out.println("Date/Time Currently : " +date1);
                        
                        queue1.enQueue(mes);
                        break;
                    case 2:
                        queue1.show();
                        break;
                    case 3:
                        queue1.deQueue();
                        break;                 
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        {
                            System.out.println("Error System");
                        }
                     //   System.out.println("Error System");
                       // break;
                }
            } while (choice !=4);
            System.out.println("Please Enter correct number : ");
    }
}
