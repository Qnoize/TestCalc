import org.apache.commons.lang3.StringUtils;
import java.util.HashMap;

public class RomanDecimal {
    private HashMap<Character, Integer> map;
    public RomanDecimal() {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    private int getRomanNumeralValue(char ch) {
        if (map.containsKey(ch)) {
            return map.get(ch);
        }
        else {
            throw new RuntimeException("Римская цифровая строка содержит недопустимые символы " + ch);
        }
    }
    public int convertRomanToDecimal(final String pRomanNumeral) {
        if (StringUtils.isBlank(pRomanNumeral)) {
            throw new RuntimeException("Римская цифровая строка либо null либо empty");
        }
        else {
            int index = pRomanNumeral.length() - 1;
            int result = getRomanNumeralValue(pRomanNumeral.charAt(index));

            for (int i = index - 1; i >= 0; i--) {
                if (getRomanNumeralValue(pRomanNumeral.charAt(i)) >= getRomanNumeralValue(pRomanNumeral.charAt(i + 1))) {
                    result = result + getRomanNumeralValue(pRomanNumeral.charAt(i));
                }
                else {
                    result = result - getRomanNumeralValue(pRomanNumeral.charAt(i));
                }
            }
            return result;
        }
    }
    public void main(String... args){
        System.out.println(new RomanDecimal().convertRomanToDecimal("XCIX"));
    }
    public String integerToRomanNumeral(int input) {
        if (input < 1 || input > 3999)
            return "Неверное значение римского числа";
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;
        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}