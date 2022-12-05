package PT1;

public class OrderItem {
    // 购买的书名
    private String name;
    // 购买书的单价
    private double price;
    // 购买的数量
    private int number;


    public OrderItem() {
    }

    public OrderItem(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "OrderItem{name = " + name + ", price = " + price + ", number = " + number + "}";
    }
}
