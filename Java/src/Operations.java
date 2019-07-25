public class Operations {
    static Main main = new Main();
    static int finishResult;
    static String finishResultRom;

    static int operationsDec() {
        int i = Integer.parseInt(main.words[0]);
        int j = Integer.parseInt(main.words[2]);

        switch (main.words[1]) {

            case ("+"): {
                finishResult = (i + j);
                resultTextDec();
                break;
            }
            case ("-"): {
                finishResult = (i - j);
                resultTextDec();
                break;
            }
            case ("/"): {
                finishResult = (i / j);
                resultTextDec();
                break;
            }
            case ("*"): {
                finishResult = (i * j);
                resultTextDec();
                break;
            }
            default: {
                System.out.println("оператор арифметической операции не верный!");
                System.exit(0);
                break;
            }
        }
        return finishResult;
    }
    static String operationsRom(){
        int result = 0;
        RomanDecimal romanDecimal = new RomanDecimal();

        switch(main.words[1])
        {
            case("+"): {
                result = (main.arr[0] + main.arr[2]);
                finishResultRom = romanDecimal.integerToRomanNumeral(result);
                resultTextRom();
                System.out.println("(" + result + ")");
                break;}
            case("-"): {
                result = (main.arr[0] - main.arr[2]);
                finishResultRom = romanDecimal.integerToRomanNumeral(result);
                resultTextRom();
                System.out.println("(" + result + ")");
                break;}
            case("/"): {
                result = (main.arr[0] / main.arr[2]);
                finishResultRom = romanDecimal.integerToRomanNumeral(result);
                resultTextRom();
                System.out.println("(" + result + ")");
                break;}
            case("*"): {
                result = (main.arr[0] * main.arr[2]);
                finishResultRom = romanDecimal.integerToRomanNumeral(result);
                resultTextRom();
                System.out.println("(" + result + ")");
                break;}
            default: {
                System.out.println("оператор арифметической операции не верный!");
                System.exit(0);
                break;
            }
        }
        return finishResultRom;
    }
    static void resultTextDec(){
        System.out.println("арифметическая операция: " + main.words[1]);
        System.out.println("результат: " + finishResult);
    }
    static void resultTextRom(){
        System.out.println("арифметическая операция: " + main.words[1]);
        System.out.print("результат: " + finishResultRom);
    }
}
