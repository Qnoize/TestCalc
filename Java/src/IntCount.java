public class IntCount {
    static Boolean intCount(){
        Main main = new Main();
        int range1 = -2147483648, range2 = 2147483647;
        int i = Integer.parseInt(main.words[0]);
        int j = Integer.parseInt(main.words[2]);

        if(((main.words[0]+"").indexOf(".") > 0))
        {
            System.out.println("введёное первое число не целое"); return false;
        }
        else if(((main.words[2]+"").indexOf(".") > 0))
        {
            System.out.println("введёное второе число не целое"); return false;
        } else if ((i < range1 && i >  range2) && (j < range1 && j >  range2) ){
            return false;
        } else {
            return true;
        }
    }
}
