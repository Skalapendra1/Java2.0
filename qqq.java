import java.util.Scanner;

public class qqq {
    public static void main(String[] args) {
        System.out.println("Выбери функционал:\n 1 - калькулятор\n 2- найти самое длинное слово ");
        Scanner scanner1 = new Scanner(System.in);
        int k = scanner1.nextInt();
        switch (k) {
            case 1:calculator();
                break;
            case 2:stroka();
                break;
            default:System.out.println("Ну ничего! В другой раз!");
        }
    }

        public static Double calculator() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ВВеди два числа:");
            double sl1 = scanner.nextDouble();
            double sl2 = scanner.nextDouble();
            System.out.println("ВВеди знак:");
            Scanner scanner3 = new Scanner(System.in);
            String zn = scanner3.nextLine();

            double res=0;
            switch (zn) {
                case "/":
                    res = sl1 / sl2;
                    System.out.printf("Результат = %.4f", res);
                    break;
                case "*":
                    res = sl1 * sl2;
                    System.out.printf("Результат = %.4f", res);
                    break;
                case "-":
                    res = sl1 - sl2;
                    System.out.printf("Результат = %.4f", res);
                    break;
                case "+":
                    res = sl1 + sl2;
                    System.out.printf("Результат = %.4f", res);
                    break;
                default:
                    System.out.println("Не балуйся!\nВводи нормально!");
            }
            scanner.close();
            scanner3.close();
            return res;
        }

        public static int stroka () {
            System.out.println("Введи количество слов: ");
            Scanner scanner1 = new Scanner(System.in);
            int d = scanner1.nextInt();
            String[] array = new String[d];
            int b = 0;
            System.out.println("Введи слова: ");
            for (int i = 0; i < array.length; i++) {
                Scanner scanner2 = new Scanner(System.in);
                String slovo = scanner2.nextLine();
                array[i] = slovo;
                int a = slovo.length();
                if (a >= b) {
                    b = a;
                }
                scanner2.close();
            }
            System.out.println("В самом длинном слове "+b+" символов");
            scanner1.close();
            return b;
        }
    }

