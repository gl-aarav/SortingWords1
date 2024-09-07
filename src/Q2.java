import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] friends = new String[5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Enter the name of friend " + (i + 1) + ": ");
      friends[i] = input.nextLine();
    }
    System.out.println("Unsorted array: " + Arrays.toString(friends));
    Arrays.sort(friends);
    System.out.println("Sorted array: " + Arrays.toString(friends));

    int index = Arrays.binarySearch(friends, "Bob");
    if (index >= 0) {
      System.out.println("Bob is found at index: " + index);
    } else {
      System.out.println("Bob is not found");
    }
  }
}
