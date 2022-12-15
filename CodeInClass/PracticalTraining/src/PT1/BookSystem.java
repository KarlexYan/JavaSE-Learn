package PT1;

import java.util.ArrayList;
import java.util.Scanner;

public class BookSystem {
    static ArrayList<Book> bookList = new ArrayList<>();

    static {
        bookList.add(new Book(1, "嫌疑人", 75.0, 25));
        bookList.add(new Book(2, "围城", 65, 30));
        bookList.add(new Book(3, "白夜行", 65, 30));
        bookList.add(new Book(4, "人类简史", 65, 30));
        bookList.add(new Book(5, "中国近代史", 65, 30));
    }

    static ArrayList<Order> orderList = new ArrayList<>();

    public static void main(String[] args) {
        // 加载书城界面
        initBookSystem();
        // 进入选书环节
        selectBook();
        // 加载订单界面
        initOrderSystem();
        // 计算总额
        getTotalPrice();

    }

    public static Book containID(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public static void buyBook(int id, int number) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                book.setNumber(book.getNumber() - number);
                orderList.add(new Order(book.getName(), number, book.getPrice()));
            }
        }

    }

    public static void initBookSystem() {
        System.out.println("欢迎来到严炜轩做的图书管理系统");
        System.out.println("===============================");
        System.out.println("编号\t书名\t价格\t库存");
        for (Book book : bookList) {
            System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPrice() + "\t" + book.getNumber());
        }
    }

    public static void initOrderSystem() {
        System.out.println("\t图书订单");
        System.out.println("图书订单号：00001");
        System.out.println("图书名称\t购买数量\t图书单价");
        System.out.println("---------------------------------------------");
    }

    public static void selectBook() {
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("请输入图书编号选择图书：（输入0结束购买）");
            int id = reader.nextInt();
            if (id == 0) break;

            Book book = containID(id);
            if (book != null) {
                System.out.println("请输入购买图书数量：");
                int number = reader.nextInt();
                int result = book.getNumber() - number;
                while (result < 0) {
                    System.out.println("库存不足，现在的库存只有" + book.getNumber() + "本，请重新输入");
                    number = reader.nextInt();
                    if (book.getNumber() - number >= 0) break;
                }
                buyBook(id, number);
                System.out.println("请继续购买图书");
            } else {
                System.out.println("没得这个编号的书喔");
            }

        }
    }

    public static void getTotalPrice() {
        double totalPrice = 0;
        for (Order order : orderList) {
            System.out.println(order.getName() + "\t" + order.getNumber() + "\t" + order.getPrice());
            totalPrice = totalPrice + (order.getPrice() * order.getNumber());
        }
        System.out.println("---------------------------------------------");
        System.out.println("订单总额：\t\t\t" + totalPrice);
    }
}
