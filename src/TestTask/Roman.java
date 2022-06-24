
package TestTask;

class Roman {
    public String calculations(String[] var) throws Exception{
        int a = TestTask.RomanNumeral.valueOf(var[0]).getNum();
        int b = TestTask.RomanNumeral.valueOf(var[2]).getNum();
        String operation = var[1];
        switch (operation) {
            case ("+"):
                int add = a + b;
                return RomanNumeral.values()[add - 1].toString();
            case ("-"):
                int sub = a - b;
                if ((a-b) < 1){
                    throw new Exception("//т.к. в римской системе нет отрицательных чисел");
                } else
                return RomanNumeral.values()[sub - 1].toString();
            case ("*"):
                int mul = a * b;
                return RomanNumeral.values()[mul - 1].toString();
            case ("/"):
                int div = a / b;
                return RomanNumeral.values()[div - 1].toString();
            default:
                throw  new Exception("//т.к. не верный символ операции");
        }


    }
}