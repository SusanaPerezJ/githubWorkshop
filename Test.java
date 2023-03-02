import java.util.Arrays;
import java.util.Scanner;

// Used for running automatic tests. DO NOT EDIT
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] inputs=line.split("-");
    int[] array;
    if(inputs.length>1) {
      array= Arrays.stream(inputs[1].split(","))
            .map(String::trim).mapToInt(Integer::parseInt).toArray();
    } else {
      array = new int[]{};
    }
    if(inputs[0].equals("min")){
      System.out.println("min:"+ValleySort.findMinIndex(array));
    }
    if(inputs[0].equals("l")){

      int mid =Integer.parseInt(inputs[2]);
      ValleySort.sortLeft(array,0,mid);
      System.out.println("l:"+toString(array));
    }
    if(inputs[0].equals("r")){
      int mid =Integer.parseInt(inputs[2]);
      ValleySort.sortRight(array,mid,array.length-1);
      System.out.println("r:"+toString(array));
    }
    if(inputs[0].equals("m")){
      int mid =Integer.parseInt(inputs[2]);
      array=ValleySort.merge(array,mid);
      System.out.println("m:"+toString(array));
    }
    if(inputs[0].equals("f")){
      array=ValleySort.performFullSort(array);
      System.out.println("f:"+toString(array));
    }

  }
  public static String toString(int[] arr) {
    String s= "";
    for(int i =0;i<arr.length; i++){
      s=s+arr[i];
      if(i<arr.length-1) {
       s=s+",";
      }
    }
    return s;
  }

}