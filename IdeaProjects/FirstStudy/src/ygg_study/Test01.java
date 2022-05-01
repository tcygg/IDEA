package ygg_study;


public class Test01 {




    public static void main(String[] args){

//实现一个功能：给定一个数组int[] arr = {12,3,7,4,8,125,9,45}; ，求出数组中最大的数。



        int arr[]={12,3,7,4,8,125,789,9,45};
        int num=getMaxnum(arr);
        System.out.println(num);


        System.out.println(num);
    }

    public static int getMaxnum(int arr[]){
        int maxNum=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]>maxNum){
                maxNum=arr[i];
            }

        }

        return maxNum;
    }



}
