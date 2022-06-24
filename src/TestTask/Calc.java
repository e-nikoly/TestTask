package TestTask;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }
    public static String calc(String input) throws Exception{
        String[] var = input.split(" ");
        String[] arabics = {"1","2","3","4","5","6","7","8","9", "10"};
        String[] romans = {"I","II","III","IV","V","VI","VII","VIII","IX", "X"};
        String[] operations = {"+", "-", "*", "/"};

        if ((var.length > 3)){
            throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - " +
                    "два операнда и один оператор (+, -, /, *)");
        } else if ((var.length < 3))
            throw  new Exception("//т.к. строка не является математической операцией");

        boolean aArabicBool = arabic(var[0], arabics);
        boolean bArabBool = arabic(var[2], arabics);
        boolean aRomanBool = roman(var[0], romans);
        boolean bRomanBool  = roman(var[2], romans);

        if (aArabicBool && bArabBool) {
            Arab arab = new Arab();
            return arab.calculations(var);
        } else if (aRomanBool && bRomanBool) {
            Roman roman = new Roman();
            return roman.calculations(var);
        } else if ((aArabicBool && bRomanBool) || (bArabBool && aRomanBool)) {
            throw new Exception("//т.к. используются одновременно разные системы счисления");
        } else
            throw new Exception("//введите число от 1 до 10 или I до X");
    }
    static boolean arabic(String var, String[] arabics){
        boolean arabicBool = false;
        for (String str: arabics) {
            if (var.equals(str)){
                arabicBool = true;
            }
        }
        return arabicBool;
    }
    static boolean roman(String var, String[] romans){
        boolean romanBool = false;
        for (String str: romans) {
            if (var.equals(str)){
                romanBool = true;
            }
        }
        return romanBool;
    }

}
