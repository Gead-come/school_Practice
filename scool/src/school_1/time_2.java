package school_1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class time_2 {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();  // 获取当前时间
        LocalDate date = LocalDate.now();  // 获取当前日期
        LocalDateTime dateTime = LocalDateTime.now();  // 获取当前日期和时间
        System.out.println(now);
        System.out.println(date);
        System.out.println(dateTime);
        System.out.println("=====================================");
        System.out.println(date.getYear());   //  获取当前年
        System.out.println(date.getMonthValue()); // 获取当前月
        System.out.println(date.getDayOfMonth()); // 获取当前日
        System.out.println(date.getDayOfWeek()); // 获取当前星期
        System.out.println("=====================================-");
        LocalDate localDate = date.plusDays(1);  //   当前日期加1天
        LocalDate localDate1 = date.plusWeeks(1);  // 当前日期加一周
        LocalDate localDate2 = date.plusMonths(1); // 当前日期加一月
        LocalDate localDate3 = date.plusYears(1);  // 当前日期加一年
        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

        System.out.println("=====================================");
        LocalDate days = date.minusDays(1);  // 当前日期减1天
        LocalDate lastweek = date.minusWeeks(1); // 当前日期的前一周
        LocalDate months = date.minusMonths(1); // 当前日期的前一月
        LocalDate years = date.minusYears(1); // 当前日期的前一年
        System.out.println(days);
        System.out.println(lastweek);
        System.out.println(months);
        System.out.println(years);
        System.out.println("======================================");
        LocalDateTime now2 = LocalDateTime.now();
        DateTimeFormatter dd = DateTimeFormatter.ofPattern("yyyy年-MM月-dd日 HH:mm:ss"); // 自定义时间格式
        String format = now2.format(dd); // 格式化时间
        System.out.println(format);  // 2021年-01月-01日 08:08:08

        String dateStr = "2025-06-03";
        LocalDate parse = LocalDate.parse(dateStr); // 解析字符串为日期
        System.out.println("解析后的日期: " + parse);
         System.out.println("======================================");

        ZonedDateTime now1 = ZonedDateTime.now();  // 获取当前时区时间
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = now1.format(dateTimeFormatter);
        System.out.println(format1);
        System.out.println(now1);

        ZonedDateTime zonedDateTime = now1.withZoneSameInstant(ZoneId.of("Asia/Shanghai"));// 转换时区
        System.out.println(zonedDateTime);

        ZonedDateTime now3 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("美国洛杉矶时间: "+now3.format(dateTimeFormatter));  //
        System.out.println("美国纽约时间: "+now3.format(dateTimeFormatter));
        System.out.println(now3);
        System.out.println("======================================");
        ZonedDateTime now22 = ZonedDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z z");

        System.out.println("格式化地区时间: " + now22.format(fmt));

//        GregorianCalendar gregorianCalendar = new GregorianCalendar(2025, 5, 3);
//        gregorianCalendar.add(Calendar.DAY_OF_MONTH,1000);
//        System.out.println(gregorianCalendar.getTime());


    }
}
