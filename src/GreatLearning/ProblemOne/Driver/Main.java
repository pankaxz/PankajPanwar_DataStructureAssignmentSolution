package GreatLearning.ProblemOne.Driver;
import GreatLearning.ProblemOne.Services.FloorSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        FloorSystem floorSystem = new FloorSystem();

        System.out.println("Enter the total number of floors in the building : ");
        int totalFloor;
        try{
            totalFloor = sc.nextInt();
            if(totalFloor == 0) throw new Exception();
            else floorSystem.InitializeFloor( totalFloor);
        }
        catch (Exception e){
            System.out.println("Wrong entry");
            System.exit( 0 );
        }
    }
}
