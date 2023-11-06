public class SwitchVidu {
    public static void main(String[] args) {
        int dayOfWeek = 4; // vi du la thu 5
        String dayName;

        switch (dayOfWeek) {
            case 1:
            dayName = "Thu Hai";
            break;
            case 2:
            dayName = "Thu Ba";
            break;
            case 3:
            dayName = "Thu Tu";
            break;
            case 4:
            dayName = "Thu Nam";
            break;
            case 5:
            dayName = "Thu Sau";
            break;
            case 6:
            dayName = "Thu Bay";
            break;
            case 7:
            dayName = "Chu Nhat";
            break;
            default:
                dayName = "Gia tri khong hop le";
                break;



        }
        System.out.println("Ngay cua tuan: " + dayName);
    }
}
