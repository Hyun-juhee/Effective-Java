package chapter2.item3;

public class ElvisField {
    public static final ElvisField INSTANCE = new ElvisField();

    private ElvisField() { }

    public void leaveTheBuilding() {
        System.out.println("ElvisEnum.leaveTheBuilding");
    }
}
