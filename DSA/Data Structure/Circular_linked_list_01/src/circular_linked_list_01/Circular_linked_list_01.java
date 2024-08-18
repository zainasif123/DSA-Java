package circular_linked_list_01;

import java.util.Scanner;

public class Circular_linked_list_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circular_linked list = new Circular_linked();
        int choice;
        String data;
        int position;

        do {
            System.out.println("\nCircular Linked List Menu:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove First");
            System.out.println("5. Remove Last");
            System.out.println("6. Remove at Position");
            System.out.println("7. Add Before Position");
            System.out.println("8. Add After Position");
            System.out.println("9. Remove Before Position");
            System.out.println("10. Remove After Position");
            System.out.println("11. Display List");
            System.out.println("12. Display Size");
            System.out.println("13. Check if Empty");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add first: ");
                    data = scanner.nextLine();
                    list.addfirst(data);
                    break;
                case 2:
                    System.out.print("Enter data to add last: ");
                    data = scanner.nextLine();
                    list.addlast(data);
                    break;
                case 3:
                    System.out.print("Enter data to add: ");
                    data = scanner.nextLine();
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    list.addpos(data, position);
                    break;
                case 4:
                    System.out.println("Removed: " + list.removefirst());
                    break;
                case 5:
                    System.out.println("Removed: " + list.removelast());
                    break;
                case 6:
                    System.out.print("Enter position to remove: ");
                    position = scanner.nextInt();
                    System.out.println("Removed: " + list.removePos(position));
                    break;
                case 7:
                    System.out.print("Enter data to add: ");
                    data = scanner.nextLine();
                    System.out.print("Enter position before which to add: ");
                    position = scanner.nextInt();
                    list.addposbefore(data, position);
                    break;
                case 8:
                    System.out.print("Enter data to add: ");
                    data = scanner.nextLine();
                    System.out.print("Enter position after which to add: ");
                    position = scanner.nextInt();
                    list.addposafter(data, position);
                    break;
                case 9:
                    System.out.print("Enter position before which to remove: ");
                    position = scanner.nextInt();
                    System.out.println("Removed: " + list.removeposbefore(position));
                    break;
                case 10:
                    System.out.print("Enter position after which to remove: ");
                    position = scanner.nextInt();
                    System.out.println("Removed: " + list.removeosaafter(position));
                    break;
                case 11:
                    list.display();
                    break;
                case 12:
                    System.out.println("Size of the list: " + list.size());
                    break;
                case 13:
                    System.out.println("Is list empty? " + list.isempty());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
