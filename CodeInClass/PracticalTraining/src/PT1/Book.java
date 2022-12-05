package PT1;

public class Book {
    // 书的编号
    private int ID;
    // 书名
    private String name;
    // 书的价格
    private double price;
    // 库存
    private int stock;  //库存


    public Book() {
    }

    public Book(int ID, String name, double price, int stock) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * 获取
     *
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * 设置
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
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
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * 设置
     *
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Book{ID = " + ID + ", name = " + name + ", price = " + price + ", stock = " + stock + "}";
    }
}