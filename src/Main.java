public class Main {
    public static void main(String[] args) {
        // Завдання 1
        int n = 60;

        if (n > 50 && n < 100) {
            System.out.println("Число" + n + "Є на проміжку");
        } else {
            System.out.println("Число" + n + "Нема на проміжку");
        }

        // Завдвння 2
        int a = 458;
        int b = a % 10;
        a /= 10;
        int c = a % 10;
        a /= 10;

        int d = a;
        int f = Math.max(d, Math.max(c, b));
        System.out.println("Найбільша цифра" + f);

        // Завдання 3
        int myfloor = 1;
        int floor = 6;

        if (floor > myfloor && floor <= 9) {
            if (floor == 2) {
                System.out.println("Верх на 3 поверх");
                floor = 3;
            }
            System.out.println("Ви піднялися на" + (floor - myfloor) + "Поверх");
        } else if (floor == 2) {
            System.out.println("Спускаємося на 1 поверх");
            floor = 1;
            System.out.println("Ви спустилися на" + (floor - myfloor) + "Поверх");
        } else {
            System.out.println("Такого поверху нема");
        }

        // Завдання 4
        String option = "Yes";
        switch (option) {
            case "Так":
            case "Ок":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь");
                break;
            default:
                System.out.println("Невірне твердження");
        }

    }
}