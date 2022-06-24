package TestTask;

class Arab {

    public String calculations(String[] var) throws Exception {
        int a = Integer.valueOf(var[0]);
        int b = Integer.valueOf(var[2]);
        String operation = var[1];
        String out;

        switch (operation) {
            case ("+"):
                return String.valueOf(a+b);
            case ("-"):
                return String.valueOf(a-b);
            case ("*"):
                return String.valueOf(a*b);
            case ("/"):
                return String.valueOf(a/b);
            default:
                throw  new Exception("//т.к. не верный символ операции");
        }

    }
}
