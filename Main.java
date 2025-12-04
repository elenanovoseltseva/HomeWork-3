import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean chYear = true, exitDo = true;
        int count = 0, year;

        do {
            System.out.println("Введите год:");
            year = scanner.nextInt();

            System.out.println("Введите количество дней:");
            int days = scanner.nextInt();
            chYear = (year % 4 == 0) ? true:false;

            if (chYear && days == 366)
                count = count + 1;
            else if (!chYear && days == 365)
                count = count + 1;
            else
                exitDo = false;

        } while (exitDo);

        int trueDays = 365;
        if (chYear)
            trueDays = 366;

        System.out.println("Неправильно! В году " + year + " дней " + trueDays +"!");
        System.out.print("Количество правильных вводов:" + count);
    }
}