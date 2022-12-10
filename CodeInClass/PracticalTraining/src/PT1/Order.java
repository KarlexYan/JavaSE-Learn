package PT1;

public class Order {
    private String name;
    private int number;
    private double price;


    public Order() {
    }

    public Order(String name, int number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;
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

    public String toString() {
        return "Order{name = " + name + ", number = " + number + ", price = " + price + "}";
    }
}
