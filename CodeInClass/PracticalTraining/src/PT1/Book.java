package PT1;

public class Book {
    private int id;
    private String name;
    private double price;
    private int number;


    public Book() {
    }

    public Book(int id, String name, double price, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
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
        return "Book{id = " + id + ", name = " + name + ", price = " + price + ", number = " + number + "}";
    }
}
