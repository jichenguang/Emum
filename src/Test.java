public class Test {
    public static void main(String[] args) {
        for (EnumTest e : EnumTest.values()) {
            System.out.println(e.toString());
        }
         
        System.out.println("----------------我是分隔线------------------");
         
        /**
         * @author 700sfriend
         * 枚举类调用什么值，就返回什么值。
         */
        EnumTest test = EnumTest.TUE;
        switch (test) {
        case MON:
            System.out.println("今天是星期一");
            break;
        case TUE:
            System.out.println("今天是星期二");
            break;
        // ... ...
        default:
            System.out.println(test);
            break;
        }
    }
}