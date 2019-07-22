import java.util.Scanner;

public class InputOperands {
    static Main main = new Main();
    static RomanDecimal romanDecimal = new RomanDecimal();
    static String str;

    static String inputS(){
        System.out.println("Введите 2 числа через пробел и арифметический оператор между ними.");
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод: ");
        str = in.nextLine();
        return str;
    }
    static String[] getArray(){
        String[] words = str.split("\\s");
        return words;
    }
    static boolean matchOperands(){
        if(main.words.length != 3)
        {
            System.out.println("количество операндов не соответсвует условию: " +
                    "введите 2 целых числа, через пробел и знак операции между ними"); return true;
        }
        return false;
    }
    static boolean definitionNumFirst(){
        if (main.words[0].matches("[-+]?\\d+")) {
            System.out.println("первое число Int: " + main.words[0]);
            return main.firstInt = true;
        } else {
            try{
            main.arr[0] = romanDecimal.convertRomanToDecimal(main.words[0]);
            if (main.arr[0] < 1 || main.arr[0] > 3999) {
                System.out.println("Неверное значение римского числа");
                System.exit(0);
            }
            System.out.println("первое число не Int " + main.words[0] + " - в десятичном виде - " + main.arr[0]);
            } catch (Exception e){
                System.out.println("Неверные значения ввода. Выход");
                System.exit(0);
            }
            return main.firstRom = true;
        }
    }
    static boolean definitionNumSecond(){
        if (main.words[2].matches("[-+]?\\d+")) {
            System.out.println("второе число Int: " + main.words[2]);
            return main.secondInt = true;
        } else {
            try{
            main.arr[2] = romanDecimal.convertRomanToDecimal(main.words[2]);
            if (main.arr[2] < 1 || main.arr[2] > 3999) {
                System.out.println("Неверное значение римского числа");
                System.exit(0);
            }
            System.out.println("второе число не Int " + main.words[2] + " - в десятичном виде - " + main.arr[2]);
            } catch (Exception e){
                System.out.println("Неверные значения ввода. Выход");
                System.exit(0);
            }
            return main.secondRom = true;
        }
    }

}
