package Ch2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 달력 출력 프로그램을 수정해서 한 주가 일요일부터 시작하게 하라.
 * 또 줄 넘김은 끝에 한 번만 출력하게 만들어라
 */
public class Ch2_1 {

    public static void main(String[] args) {
        var today = LocalDate.now();

        System.out.println(today.getMonth().toString() + " " + today.getYear());
        var date = LocalDate.of(today.getYear(), today.getMonth(), 1);
        var order = buildDayAbbrev();

        for (var abbrev : order.values()) {
            System.out.printf("%s\t", abbrev);
        }
        System.out.println();

        var pos = date.getDayOfWeek().getValue() == 7 ? 0 : date.getDayOfWeek().getValue();
        for (var i = 0; i < pos; i++) {
            System.out.print(" \t");
        }
        while (date.getMonthValue() == today.getMonthValue()) {
            var format = pos++ % 7 == 6 ? "%d\n" : "%d\t";
            System.out.printf(format, date.getDayOfMonth());
            date = date.plusDays(1);
        }
    }

    /**
     * 주말을 Key와 Value로 등록한다.
     *
     * @author 안지환
     * @return 한 주 등록
     */
    private static Map<DayOfWeek, String> buildDayAbbrev() {
        var result = new LinkedHashMap<DayOfWeek, String>(7);
        result.put(DayOfWeek.SUNDAY, "Sun");
        result.put(DayOfWeek.MONDAY, "Mon");
        result.put(DayOfWeek.TUESDAY, "Tue");
        result.put(DayOfWeek.WEDNESDAY, "Wen");
        result.put(DayOfWeek.THURSDAY, "Thu");
        result.put(DayOfWeek.FRIDAY, "Fri");
        result.put(DayOfWeek.SATURDAY, "Sat");
        return result;
    }
}
