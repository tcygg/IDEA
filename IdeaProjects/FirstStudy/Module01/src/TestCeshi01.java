import java.util.Arrays;

/**
 * @Auther: ygg
 * @Date: 2022/4/23 - 04 - 23 - 1:48
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestCeshi01 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4,5};
       // System.out.println(Arrays.toString(arr1));

        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }

        int a=10;
        int b=20;
        int c=30;

        int [] arr=new int[4];
        arr[0]=11;
        arr[1]=21;
        arr[2]=31;
        arr[3]=41;
        Arrays.toString(arr);
        int d=eat();
        System.out.println(d);

    }
    public static int eat(){
        System.out.println("----1");
        System.out.println("----2");
        System.out.println("----3");
        System.out.println("----4");
        return 9;
    }


}
