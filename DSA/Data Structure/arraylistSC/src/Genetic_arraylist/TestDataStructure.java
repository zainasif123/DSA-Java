package Genetic_arraylist;

import java.util.Scanner;

public class TestDataStructure {

    public static void main(String[] args) {
        List<Integer> myListStoringIntegers = new List<Integer>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add an element");
            System.out.println("2. Get an element");
            System.out.println("3. Check if list is empty");
            System.out.println("4. Check if list is full");
            System.out.println("5. Set an element");
            System.out.println("6. Print list contents");
            System.out.println("7. Remove an element");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter index to add: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter element to add: ");
                    int element = scanner.nextInt();
                    myListStoringIntegers.add(index, element);
                    break;
                case 2:
                    System.out.print("Enter index to get: ");
                    int getIndex = scanner.nextInt();
                    System.out.println("Element at index " + getIndex + ": " + myListStoringIntegers.get(getIndex));
                    break;
                case 3:
                    System.out.println("Array is empty: " + myListStoringIntegers.isEmpty());
                    break;
                case 4:
                    System.out.println("Array is full: " + myListStoringIntegers.isFull());
                    break;
                case 5:
                    System.out.print("Enter index to set: ");
                    int setIndex = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = scanner.nextInt();
                    myListStoringIntegers.set(setIndex, newValue);
                    break;
                case 6:
                    myListStoringIntegers.printListContents();
                    break;
                case 7:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = scanner.nextInt();
                    myListStoringIntegers.remove(removeIndex);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 8);
        
        scanner.close();
    }
}
