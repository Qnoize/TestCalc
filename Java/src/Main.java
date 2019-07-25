import java.util.*;
import java.lang.*;

public class Main{
    static String[] words;
    public static int array[] = new int[3];
    static boolean firstInt, secondInt;
    static boolean firstRom, secondRom;
// Main class
    public static void main(String[] args){
        Operations operationsRom = new Operations();
        Operations operationsDec = new Operations();
        IntCount intCount = new IntCount();
        boolean workProgram = true;

        while (workProgram) {
            InputOperands.inputS();
            words = InputOperands.getArray();

            if(!InputOperands.matchOperands()) {
                InputOperands.definitionNumFirst();
                InputOperands.definitionNumSecond();
                if(((firstInt && secondRom) || (firstRom && secondInt))){
                    System.out.println("Ошибка: не верный формат ввода.(типы чисел должны совпадать)");
                    System.exit(0);
                } else {
                    if (firstInt && secondInt) {
                        try{
                        if (intCount.intCount()) {
                            operationsDec.operationsDec();
                        }
                        } catch (Exception e){
                            System.out.println("Превышен диапозон Int)");
                            System.exit(0);
                        }
                    }
                    if (firstRom && secondRom) {
                        operationsRom.operationsRom();
                    }
                }
                firstInt = false; secondInt = false; firstRom = false; secondRom = false;
                System.out.println("Продолжить работу(1-да, 0-нет): ");
                Scanner in = new Scanner(System.in);
                try{
                 int x = in.nextInt();
                    if(x == 0) workProgram = false; else if (x == 1) workProgram = true; else {
                        System.out.println("Неверный ввод - выход из программы");
                        workProgram = false;
                    }
                } catch (Exception e){
                    System.out.println("Неверный ввод - выход из программы");
                    workProgram = false;
                }
            }
        }
    }
}
