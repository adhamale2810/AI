import java.util.*;

public class selectionsort {

  public static int[] sort(int[] arr) {
	  int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minind = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minind]) {
          minind = j;
        }
      }
      int t = arr[minind];
      arr[minind] = arr[i];
      arr[i] = t;
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(sort(arr)));
  }
}
