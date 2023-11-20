/**
 * @Auther: TcYgg
 * @Date: 2023/10/18 - 10 - 18 - 17:36
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class CaTest {
//    @Test
    public void testAdd(){
        System.out.println("测试add方法");
        Calculator cal = new Calculator();
        int result = cal.add(10, 30);
        System.out.println(result);
    }
    //测试sub方法
//    @Test
    public void testSub(){
        System.out.println("测试sub方法");
        Calculator cal = new Calculator();
        int result = cal.sub(10, 30);
        System.out.println(result);
    }
}
