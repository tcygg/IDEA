import java.util.Arrays;

public class Test02 {

   public static void main(String[] args) {

       System.out.println("Test02.main");
       System.out.println("args = " + Arrays.deepToString(args));

      /*     int arr[]={12,3,7,4,8,125,789,9,45};
         //  int num=getMaxnum(arr);
           System.out.println(num);*/

     int[] arr=new int []{1,2,3,4};
//       for (int i = 0; i < arr.length; i++) {
//           System.out.println(arr[i]);
//       }

       System.out.println(Arrays.toString(arr));

       for (int i : arr) {
           System.out.println(arr[i]);
       }
//       int[] b=new int[]{1,2,3,4};
//       for (int i : b) {
//           System.out.print(b[i]);
//       }

   }
   

}