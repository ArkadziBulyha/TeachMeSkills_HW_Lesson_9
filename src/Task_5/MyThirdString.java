package Task_5;

public class MyThirdString {
    static String getNewString(String str) {

        StringBuilder strbuild = new StringBuilder();
        char[] arrChar = str.toCharArray();

        for (char  symb: arrChar) {
            strbuild.append(String.valueOf(symb).concat(String.valueOf(symb)));
        }
        return strbuild.toString();

    }
}
