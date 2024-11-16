package ex5;

import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    int[] numbers1 = {1, 2, 3, 4, 5};
    int[] numbers2 = {1, 2, 3, 4};

    reverse(numbers1);
    reverse(numbers2);

    System.out.println(Arrays.toString(numbers1));
    System.out.println(Arrays.toString(numbers2));
  }

  public static void reverse(int[] arr) {
    int l = arr.length;

    for (int i = 0; i < l / 2; i++) {
      int temp = arr[i];
      int end = l - 1 - i;
      arr[i] = arr[end];
      arr[end] = temp;
    }
  }
}
