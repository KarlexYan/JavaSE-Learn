package PT1;

public class Order {
    // 订单号
    private String orderId;
    // 订单总额
    private double total;
    // 订单项数组
    OrderItem[] items = new OrderItem[5];

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void addItemToItems(OrderItem item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return;
            }
        }
    }

    public void printOrder() {
        System.out.println("订单号：" + orderId);
        System.out.println("书名\t\t单价\t数量");
        System.out.println("=======================");

        for (OrderItem item : items) {
            if (item != null) {
                System.out.println(item.getName() + "\t\t" + item.getPrice() + "\t\t" + item.getNumber());
                total = total + item.getNumber() * item.getPrice();
            }
        }
        System.out.println("=========================");
        System.out.println("总价为：" + total);
    }
}
