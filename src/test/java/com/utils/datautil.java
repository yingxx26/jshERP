package com.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class datautil {

    /*表示日期时间的类
    Instant年月日时分秒毫秒时区，协调世界时，转成其它时间类需要本地时区
    LocalDateTime年月日时分秒毫秒
    LocalDate年月日
    LocalTime时分秒毫秒
    Year年
    YearMonth年月
    MonthDay月日
    注意：新增的日期时间类都是不可变的*/



    public static void main(String[] args) {

 //  获取
      //  获取当前日期时间
            // 2020-03-25T13:18:51.052775200Z
                    System.out.println(Instant.now());
            // 2020-03-25T21:18:51.064769800
                    System.out.println(LocalDateTime.now());
            // 2020-03-25
                    System.out.println(LocalDate.now());
            // 21:18:51.064769800
                    System.out.println(LocalTime.now().toString());
            // 2020
                    System.out.println(Year.now().toString());
            // 2020-03
                    System.out.println(YearMonth.now());
            // --03-25
                    System.out.println(MonthDay.now());

     // 获取指定日期时间
            // 2020-03-25T21:44:32
             System.out.println(  LocalDateTime.of(2020, 3, 25, 21, 44, 32));
            // 2020-03-25
             System.out.println(       LocalDate.of(2020, 3, 25));
            // 21:44:32
             System.out.println(       LocalTime.of(21, 44, 32));
            // 2020
            System.out.println(       Year.of(2020));
            // 2020-03
            System.out.println(        YearMonth.of(2020, 3));
            // --03-25
            System.out.println(        MonthDay.of(3, 25));


  //获取相邻的日期时间
      //指定日期
            // 指定日期 2019-02-09
        LocalDate localDate=null;
        System.out.println(    localDate = LocalDate.of(2019, 2, 9));
            // 这个月的第一天 2019-02-01
        System.out.println(    localDate.with(TemporalAdjusters.firstDayOfMonth()));
            // 这个月的最后一天 2019-02-28
        System.out.println(         localDate.with(TemporalAdjusters.lastDayOfMonth()));
            // 下个月的第一天 2019-03-01
        System.out.println(         localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
            // 这一年的第一天 2019-01-01
        System.out.println(         localDate.with(TemporalAdjusters.firstDayOfYear()));
            // 这一年的最后一天 2019-12-31
        System.out.println(          localDate.with(TemporalAdjusters.lastDayOfYear()));
            // 下一年的第一天 2020-01-01
        System.out.println(        localDate.with(TemporalAdjusters.firstDayOfNextYear()));
            // 这个月的第一个星期一 2019-02-04
        System.out.println(         localDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
            // 这个月的最后一个星期一 2019-02-25
        System.out.println(          localDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY)));
            // 这个月的第二个星期一 2019-02-11
        System.out.println(        localDate.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY)));
            // 这个月的倒数第二个星期一 2019-02-18
        System.out.println(         localDate.with(TemporalAdjusters.dayOfWeekInMonth(-2, DayOfWeek.MONDAY)));
            // 下一个星期六 2019-02-16
        System.out.println(         localDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));
            // 下一个星期六，可以是当天 2019-02-09
        System.out.println(         localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)));
            // 上一个星期六 2019-02-02
        System.out.println(          localDate.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)));
            // 上一个星期六，可以是当天 2019-02-09
        System.out.println(         localDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY)));


    //指定日期时间
            // 指定日期时间
        LocalDateTime localDateTime =null;
        System.out.println(          localDateTime = LocalDateTime.of(2020, 3, 25, 21, 44, 32));
            // 这一天的开始时间
        System.out.println(             localDateTime.toLocalDate().atStartOfDay());
            // 这一天的开始时间
        System.out.println(              localDateTime.toLocalDate().atTime(LocalTime.MAX));
            // 30小时后
        System.out.println(             localDateTime.plusHours(30));
            // 30分钟后
        System.out.println(            localDateTime.plusMinutes(30));

//转换
            // Date Instant
          Instant instant =null;
        System.out.println(        instant = new Date().toInstant());
        System.out.println(   Date.from(Instant.now()));
            // Instant LocalDateTime，当前时区
        System.out.println(   LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
        System.out.println(   LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
            // Date LocalDateTime
        System.out.println(  LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()));
        System.out.println(  Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
            // LocalDateTime LocalDate
        System.out.println(    LocalDateTime.now().toLocalDate());
        System.out.println(    LocalDate.now().atStartOfDay());
            // LocalDateTime LocalTime
        System.out.println(    LocalDateTime.now().toLocalTime());
        System.out.println(    LocalDateTime.of(LocalDate.now(), LocalTime.now()));
     /*        Date与LocalDateTime之间的转换需要通过Instant
               LocalDate无法直接转为LocalDateTime，这里将时间设为一天的开始时间
               LocalTime无法直接转为LocalDateTime，这里将日期设为当天*/



//格式化
     //先看看自带的DateTimeFormatter格式化：
        ZonedDateTime zonedDateTime =null;
            // 指定日期时间
        System.out.println(            zonedDateTime = ZonedDateTime.now());
        // ISO_LOCAL_DATE 2020-03-25
        System.out.println(              DateTimeFormatter.ISO_LOCAL_DATE.format(zonedDateTime));

         LocalDateTime now1 = LocalDateTime.now();
         System.out.println(              DateTimeFormatter.ISO_LOCAL_DATE.format(now1));


            // ISO_OFFSET_DATE 2020-03-25+08:00
        System.out.println(              DateTimeFormatter.ISO_OFFSET_DATE.format(zonedDateTime));
            // ISO_DATE 2020-03-25+08:00
        System.out.println(             DateTimeFormatter.ISO_DATE.format(zonedDateTime));
            // ISO_LOCAL_TIME 22:22:55.6747072
        System.out.println(            DateTimeFormatter.ISO_LOCAL_TIME.format(zonedDateTime));
            // ISO_OFFSET_TIME 22:22:55.6747072+08:00
        System.out.println(            DateTimeFormatter.ISO_OFFSET_TIME.format(zonedDateTime));
            // ISO_TIME 22:22:55.6747072+08:00
        System.out.println(           DateTimeFormatter.ISO_TIME.format(zonedDateTime));
            // ISO_LOCAL_DATE_TIME 2020-03-25T22:22:55.6747072
        System.out.println(           DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTime));
            // ISO_OFFSET_DATE_TIME 2020-03-25T22:22:55.6747072+08:00
        System.out.println(           DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(zonedDateTime));
            // ISO_ZONED_DATE_TIME 2020-03-25T22:22:55.6747072+08:00[Asia/Shanghai]
        System.out.println(           DateTimeFormatter.ISO_ZONED_DATE_TIME.format(zonedDateTime));
            // ISO_DATE_TIME 2020-03-25T22:22:55.6747072+08:00[Asia/Shanghai]
        System.out.println(           DateTimeFormatter.ISO_DATE_TIME.format(zonedDateTime));
            // ISO_ORDINAL_DATE 2020-085+08:00
        System.out.println(           DateTimeFormatter.ISO_ORDINAL_DATE.format(zonedDateTime));
            // ISO_WEEK_DATE 2020-W13-3+08:00
        System.out.println(           DateTimeFormatter.ISO_WEEK_DATE.format(zonedDateTime));
            // ISO_INSTANT 2020-03-25T14:22:55.674707200Z
        System.out.println(            DateTimeFormatter.ISO_INSTANT.format(zonedDateTime));
            // BASIC_ISO_DATE 20200325+0800
        System.out.println(           DateTimeFormatter.BASIC_ISO_DATE.format(zonedDateTime));
            // RFC_1123_DATE_TIME Wed, 25 Mar 2020 22:22:55 +0800
        System.out.println(         DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTime));

  // 自定义DateTimeFormatter，建议设置为常量：
        ZonedDateTime zonedDateTime1 =null;
            // 指定日期时间
        System.out.println(                zonedDateTime1 = ZonedDateTime.now());
            // 2020-03-25 22:29:33
        System.out.println(              DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(zonedDateTime1));
            // 2020-03-25 等同于DateTimeFormatter.ISO_LOCAL_DATE
        System.out.println(               DateTimeFormatter.ofPattern("yyyy-MM-dd").format(zonedDateTime1));
            // 2020年03月25日 22时29分33秒
        System.out.println(             DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒").format(zonedDateTime1));
            // 2020年03月25日
        System.out.println(             DateTimeFormatter.ofPattern("yyyy年MM月dd日").format(zonedDateTime1));
            // 2020-03
        System.out.println(            DateTimeFormatter.ofPattern("yyyy-MM").format(zonedDateTime1));
            // 2020年03月
        System.out.println(           DateTimeFormatter.ofPattern("yyyy年MM月").format(zonedDateTime1));
            // 20200325
        System.out.println(          DateTimeFormatter.ofPattern("yyyyMMdd").format(zonedDateTime1));
            // 202003
        System.out.println(            DateTimeFormatter.ofPattern("yyyyMM").format(zonedDateTime1));

/*// /解析
    // 调用DateTimeFormatter解析：

// 2020-03-25
        LocalDate.parse("2020年03月25日", dateTimeFormatter);
// 2020-03-25
        LocalDate.from(dateTimeFormatter.parse("2020年03月25日"));
// 2020-03-25
        dateTimeFormatter.parse("2020年03月25日", LocalDate::from);
        注意：如果传入的日期文本不包含时间，则无法转为带有时间的类型，日期同理。*/


//比较
        LocalDateTime localDateTime11 =null;
        LocalDateTime localDateTime21 =null;
        System.out.println(  localDateTime11 = LocalDateTime.of(2020, 3, 25, 6, 44, 32));
        System.out.println(  localDateTime21 = LocalDateTime.now());

        // 是否为同一天 true
        System.out.println(          localDateTime11.toLocalDate().equals(localDateTime21.toLocalDate()));
        // localDateTime1是否在localDateTime2之前 true
        System.out.println(        localDateTime11.isBefore(localDateTime21));
        // localDateTime1是否在localDateTime2之后 false
        System.out.println(      localDateTime11.isAfter(localDateTime21));



//间隔  Period

       /* //获取两个日期时间，表面上的间隔，比如2011年2月1日，和2021年8月11日，日相差了10天，月相差6月，而且只能比较LocalDate，当然这个类实际上表示是表面上年月日的偏移。
        LocalDate localDate1 =null; LocalDate localDate2 =null;
        System.out.println(         localDate1 = LocalDate.of(2020, 1, 15));
        System.out.println(         localDate2 = LocalDate.now());
        Period period =null;
        System.out.println(          period = Period.between(localDate1, localDate2));
        // 10
                System.out.println(period.getDays());
        // 2
                System.out.println(period.getMonths() );

    // Duration
     //   与Period相比，Duration能得到相差的实际天数、小时数等，但没有年、月。实际上，它是一个基于时间的量，表示一段连续的时间。

                LocalDateTime localDateTime12 = LocalDateTime.of(2020, 1, 15, 8, 21, 12);
                LocalDateTime localDateTime22 = LocalDateTime.now();

                Duration between = Duration.between(localDateTime12, localDateTime22);
        // 70
                System.out.println(between.toDays());
        // 1694
                System.out.println(between.toHours());*/


//ChronoUnit
        //与前两个相比，这个才是真正比较日期时间间隔的方式。

        LocalDateTime localDateTime13 = LocalDateTime.of(2020, 1, 15, 8, 21, 12);
        LocalDateTime localDateTime23 = LocalDateTime.now();

        // 0
        System.out.println( localDateTime13.until(localDateTime23, ChronoUnit.YEARS));
        // 2
        System.out.println(  localDateTime13.until(localDateTime23, ChronoUnit.MONTHS));
        // 70
        System.out.println(  localDateTime13.until(localDateTime23, ChronoUnit.DAYS));
        // 1694
        System.out.println( localDateTime13.until(localDateTime23, ChronoUnit.HOURS));
        // 101678
        System.out.println(localDateTime13.until(localDateTime23, ChronoUnit.MINUTES));
        // 6100682
        System.out.println( localDateTime13.until(localDateTime23, ChronoUnit.SECONDS));

        // 或 ChronoUnit.YEARS.between(localDateTime1, localDateTime2)


//获取一段连续的日期或时间
               // 获取近十个月的连续年月YearMonth
        // [2012-09, 2013-07, 2014-05, 2015-03, 2016-01, 2016-11, 2017-09, 2018-07, 2019-05, 2020-03]
     /*   Stream.iterate(YearMonth.now(), yearMonth -> yearMonth.plusMonths(-10))
                .limit(10)
                .sorted(Comparator.comparing(YearMonth::getYear).thenComparing(YearMonth::getMonthValue))
                .collect(Collectors.toList());*/


    }

}
