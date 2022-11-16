package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Live {
    public static void main(String[] args) throws ParseException {
        JDK7Ways();

        JDK8Ways();
    }

    private static void JDK8Ways() {
        LocalDateTime nowTime = LocalDateTime.now();
        LocalDateTime birthTime = LocalDateTime.of(2000, 6, 15, 0, 0, 0);
        System.out.println("JDK8:你活了" + ChronoUnit.DAYS.between(birthTime, nowTime) + "天");
    }

    private static void JDK7Ways() throws ParseException {
        String birthday = "2000-06-15";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(birthday);
        long birthTime = date.getTime();

        long nowTime = System.currentTimeMillis();

        long liveTime = (nowTime - birthTime) / 1000 / 60 / 60 / 24;
        System.out.println("JDK7:你活了" + liveTime + "天");
    }
}
