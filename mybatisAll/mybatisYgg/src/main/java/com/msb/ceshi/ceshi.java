package com.msb.ceshi;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/29 - 11 - 29 - 16:42
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class ceshi {
    public static void main(String[] args) {
        int bb = useadd(new Yggcehi());
        System.out.println(bb);


        YggCeshiJiekou yggCeshiJiekou = new Yggcehi();

        yggCeshiJiekou.sout();

    }

    public static int useadd(YggCeshiJiekou yggCeshiJiekou){
        int add = yggCeshiJiekou.add(2, 3);

        return add;

    }
}
;