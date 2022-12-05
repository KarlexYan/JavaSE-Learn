package PT1;

import java.util.Scanner;

public class BookSystem {
    static Book[] books = new Book[6];

    static {
        books[0] = new Book(1, "围城", 39.0, 50);
        books[1] = new Book(2, "白夜行", 59.6, 25);
        books[2] = new Book(3, "嫌疑X献身", 35.0, 15);
        books[3] = new Book(4, "东方快车", 26.0, 30);
        books[4] = new Book(5, "中国近代史", 20.0, 20);
        books[5] = new Book(6, "人类简史", 68.0, 45);
    }

    public static void main(String[] args) {

        Order order = new Order("001");
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("编号\t书名\t单价\t库存");

            for (int i = 0; i < books.length; i++) {
                String line = books[i].getID() + "\t\t" + books[i].getName() + "\t" + books[i].getPrice() + "\t" + books[i].getStock();
                System.out.println(line);
            }

            System.out.println("请输入你想购买的图书编号：");
            int inputID = reader.nextInt();
            System.out.println("请输入购买数量：");
            int inputNum = reader.nextInt();


        }
    }
}
