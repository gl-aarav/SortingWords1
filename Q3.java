import java.util.*;

public class Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] computerTerms = new String[5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Enter a computer term: ");
      computerTerms[i] = input.nextLine();
    }
    System.out.println("Unsorted array: " + Arrays.toString(computerTerms));

    Arrays.sort(computerTerms);
    System.out.println("Sorted array: " + Arrays.toString(computerTerms));

    int index = Arrays.binarySearch(computerTerms, "keyboard");
    if (index >= 0) {
      System.out.println("keyboard is found at index: " + index);
    } else {
      System.out.println("keyboard is not found");
    }
  }
}