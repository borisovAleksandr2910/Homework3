import java.util.Scanner;

public class DailyPlanner {
    //Создаем массив и помещаем в него название дней недели
    static final String[] WEEK = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресение"};


    String[] text = new String[7];// Создаем строковый массив для хранения запланированных дел.

    public static void main(String[] args) {
        int choice;
        DailyPlanner dailyPlanner = new DailyPlanner();
        do {
            System.out.print("Выберите действие для работы с ежедневником(1 - записать, 2 - прочитать s - выйти из программы): ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            //выбираем метод
            if (choice == 1) dailyPlanner.writeItInTheDiary();
            else dailyPlanner.readItInTheDiary();
        }while (choice != 's');

        }


    //Создаем метод для чтения данных из ежедневника
    public void readItInTheDiary() {
        int choice; // Создаем переменную для выбора дня недели
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите день недели: ");
        choice = scanner.nextInt();
        //Выводим день недели  и запись о запланированном мероприятии
        switch (choice) {
            case 1 -> System.out.println(WEEK[0] + ": " + text[0]);
            case 2 -> System.out.println(WEEK[1] + ": " + text[1]);
            case 3 -> System.out.println(WEEK[2] + ": " + text[3]);
            case 5 -> System.out.println(WEEK[4] + ": " + text[4]);
            case 6 -> System.out.println(WEEK[5] + ": " + text[5]);
            case 7 -> System.out.println(WEEK[6] + ": " + text[6]);
        }
    }

    //Создаем метод для записи данных в ежедневник
    public void writeItInTheDiary() {
        int choice; // Создаем переменную для выбора дня недели
        String inputText;//Создаем строковую переменную для ввода данных от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите день недели: ");
        choice = scanner.nextInt();
        System.out.print("Напишите запланированное дело: ");
        Scanner scanner1 = new Scanner(System.in);
        inputText = scanner1.nextLine();

        //Присваиваем введенное значение в соответствии с выбранным днем недели.
        switch (choice) {
            case 1 -> text[0] = inputText;
            case 2 -> text[1] = inputText;
            case 3 -> text[2] = inputText;
            case 4 -> text[3] = inputText;
            case 5 -> text[4] = inputText;
            case 6 -> text[5] = inputText;
            case 7 -> text[6] = inputText;
            default -> System.out.print("Неверное значение");
        }
    }

}
