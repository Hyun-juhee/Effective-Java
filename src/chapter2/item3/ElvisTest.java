package chapter2.item3;

public class ElvisTest {
    public static void main(String[] args) {
        ElvisField elvisField = ElvisField.INSTANCE;
        ElvisField elvisField1 = ElvisField.INSTANCE;
        System.out.println(elvisField.getClass() == elvisField1.getClass());

        ElvisStaticFactory elvisStaticFactory = ElvisStaticFactory.getInstance();
        ElvisStaticFactory elvisStaticFactory1 = ElvisStaticFactory.getInstance();
        System.out.println(elvisStaticFactory.getClass() == elvisStaticFactory1.getClass());

        ElvisEnum elvisEnum = ElvisEnum.INSTANCE;
        ElvisEnum elvisEnum1 = ElvisEnum.INSTANCE;
        System.out.println(elvisEnum.getClass() == elvisEnum.getClass());
    }
}
