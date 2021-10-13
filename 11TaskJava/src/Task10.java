import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Day [] massiveDays = new Day[7];
        massiveDays = fillDays(massiveDays);
        System.out.println("Weather Calendar:\n");
        for (Day d :
                massiveDays) {
            System.out.println("Day " + d.getNumber() + ":\n" + d.getWeather().toString());

        }
    }

    private static Day[] fillDays(Day[] massiveDays) {
        int days_cnt = 1;
        String [] winds = new String[]{"North", "West", "East", "South"};
        Random random = new Random();
        for (int i = 0; i < massiveDays.length; i++) {


                    Weather w = new Weather(winds[random.nextInt(3)], random.nextInt(40), random.nextInt(100));
            massiveDays[i] = new Day(w,days_cnt);

            days_cnt++;
        }
        return massiveDays;
    }
}
