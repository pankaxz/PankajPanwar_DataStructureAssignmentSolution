package GreatLearning.ProblemOne.Services;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class FloorSystem {
    private int currentFloor;
    private List<Integer> floorsAtDayN;
    private final List<Integer> floorList = new LinkedList<>();

    /**
     * Take input from user for each floor size.
     */
    public void InitializeFloor(int numberOfFloors){
        Scanner sc = new Scanner( System.in );

        for(int i = 0; i < numberOfFloors; i++){
            System.out.println("Enter the floor size given on day : "+(i+1));
            int floorSize;
            floorSize = sc.nextInt();
            floorList.add( i, floorSize );
        }
        System.out.println("The order of construction is as follows");
        StackFloors(floorList);
    }

    public void StackFloors(List<Integer> floorSizes) {
        int height = floorSizes.size();
        currentFloor = height;
        List<Integer> remainingFloors = new ArrayList<>();

        for (int day = 0; day < height; day++) {
            floorsAtDayN = new ArrayList<>();
            int size = floorSizes.get(day);

            if (size == currentFloor) {
                floorsAtDayN.add(size);
                currentFloor = currentFloor - 1;
                checkRemainingFloors(currentFloor, remainingFloors );
            }

            if (size < currentFloor) {
                remainingFloors.add(size);
            }

            System.out.println();
            System.out.println("Day: " + (day + 1));
            for (int i : floorsAtDayN) {
                System.out.print(i + " ");
            }
        }
    }

    void checkRemainingFloors(int currentFloor, List<Integer> remainingFloors) {
        for (int floor : remainingFloors) {
            if (floor == currentFloor) {
                floorsAtDayN.add( floor );
                this.currentFloor = currentFloor - 1;
                checkRemainingFloors( this.currentFloor, remainingFloors );
            }
        }
    }
}
