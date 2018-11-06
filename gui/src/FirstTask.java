public class FirstTask {
    /*
    Write Number in Expanded Form
    You will be given a number and you will need to return it as a string in Expanded Form. For example:
    expanded(12); # Should return "10 + 2"
    expanded(42); # Should return "40 + 2"
    expanded(70304); # Should return "70000 + 300 + 4"
    NOTE: All numbers will be whole numbers greater than 0.
    */
    public static String outData = "";

    private static boolean checkInitData(String initData) {
        String digit = "0123456789";
        Boolean check = true;
        if (initData.equals("")) {
            outData = "Ввод пуст"; //проверка на пустой ввод
        } else {
            for (int i = 0; i < initData.length(); i++){   // проверка на ввод положительного числа
                if ( digit.contains(String.valueOf(initData.charAt(i))) ) {}
                else {
                    check = false;
                    outData = "Введенные данные не являются положительным числом";
                    break;
                }
            }
        }
        return check;
    }

    public static void MainFirstTask() {
        if (checkInitData(Main.initData)) {
            for (int i = 0; i < Main.initData.length(); i++) {
                if (Main.initData.charAt(i) == '0') {
                } else {
                    String zero = "";
                    for (int t = 0; t < (Main.initData.length() - i - 1); t++) {
                        zero = zero + 0; // "строка-дополнение нулями" до конца
                    }
                    if (i == 0) {
                        outData = "" + Main.initData.charAt(i) + zero;
                    } else {
                        outData = outData + " + " + Main.initData.charAt(i) + zero;
                    }
                }
            }
        }
    }
}