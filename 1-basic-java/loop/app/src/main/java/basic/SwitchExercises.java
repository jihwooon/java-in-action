package basic;

public class SwitchExercises {


    public static void main(String[] args) {
        int dayNumber = 6;

        System.out.println(determineNameOfDay(dayNumber));
        System.out.println(isWeekDay(dayNumber));
    }

    private static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
            case 6:
                return false;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
        return false;
    }

    private static String determineNameOfDay(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case 0:
                result = "일요일";
                break;
            case 1:
                result = "월요일";
                break;
            case 2:
                result = "화요일";
                break;
            case 3:
                result = "수요일";
                break;
            case 4:
                result = "목요일";
                break;
            case 5:
                result = "금요일";
                break;
            case 6:
                result = "토요일";
                break;
            default:
                System.out.println("다시 선택 해주세요");
        }
        return result;
    }
}
