package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
        String startStr = "2023年11月11日 0:01:00";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:09:59";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        long startDateTime = startDate.getTime();
        long endDateTime = endDate.getTime();
        long orderDateTime = orderDate.getTime();

        if (orderDateTime >= startDateTime && orderDateTime <= endDateTime) {
            System.out.println("成功秒杀");
        } else {
            System.out.println("来晚啦");
        }
    }
}
