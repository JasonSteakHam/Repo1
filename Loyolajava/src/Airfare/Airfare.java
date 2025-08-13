package Airfare;
import java.util.Scanner;

public class Airfare {
    
    
    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        
        int class0;
        int distance;
        float dfare;
        System.out.print("Distance(km): ");
        distance = af.nextInt();
        
        System.out.print("Class: ");
        class0 = af.nextInt();
        
        
        switch(class0){
            
            case 1:
                float fare1;
                fare1=distance*250;
                dfare = fare1 - (fare1 * 0.10f);
                if(distance > 1000){
                    System.out.println("Total fare: " +dfare);
                }else{
                    System.out.print("Total Fare: "+fare1);
                }
                
     
            break;
            case 2:
                float fare2;
                fare2=distance*500;
                dfare = fare2 - (fare2 * 0.10f);
                if(distance > 1000){
                    System.out.println("Total fare: " +dfare);
                }else{
                    System.out.print("Total Fare: "+fare2);
                }
            break;
        }
    }
}

