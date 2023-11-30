public class Main {

  public static void main(String[] args) {
    String[] words = {"camel", "ant", "dog", "cat", "horse", "mule", "java", "goose"}; 
    System.out.println("This is the array before sorting:");
    for (int i = 0; i<words.length; i++) {
      System.out.print(words[i] + " ");
    }
    BubbleSort(words);
    System.out.println();
    System.out.println("This is the array before sorting:");
    for (int i = 0; i<words.length; i++) {
      System.out.print(words[i] + " ");
    }

  }

  public static void BubbleSort(String[] nums){
    int j;
    boolean swapped = true;
    String temp;
    while (swapped){	
      swapped= false;
      for(j=0; j<nums.length-1; j++){
        if (nums[j].charAt(0) > nums[j+1].charAt(0)){
          temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
          swapped = true;
        }
      }
    }
  }
}
