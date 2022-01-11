package Task_1;

import java.util.Locale;

public class NumbDoc {

    static String outNumb(String line) {

        line = line.substring(0, 4) + " " + line.substring(9, 13);
        return line;

    }


    static String resizeLetter(String str) {

        str = str.replace("U", "u").
                replace("b", "B").
                replace("N", "n").
                replace("T", "t").
                replace("o", "O").
                replace("X", "x").
                replace("q","Q").
                replace("c", "C");
        return str;

    }


    static String resizeFormat(String line) {

        line = (line.substring(5, 8) + "/" + line.substring(14, 17) + "/" +
                line.substring(19, 20) + "/" + line.substring(21)).toLowerCase();
        return line;
    }


    static String resizeFormatStrB(StringBuilder line) {
        return (line.substring(5, 8) + "/" + line.substring(14, 17) + "/" + line.substring(19, 20) + "/" + line.substring(21)).toUpperCase();
    }


    static String isHaveABC(String line) {

        line = line.toUpperCase();
        if (line.contains("ABC")) {
            return "Содержит ABC";
        } else {
            return "Не содержит ABC";
        }

    }


    static String isBegin(String line) {

        if (line.startsWith("555")) {
            return "Да, договор начинается с цифр 555";
        } else {
            return "Нет, договор не начинается с цифр 555";
        }

    }


    static String isEnd(String line) {

        if (line.endsWith("1a2b")) {
            return "Да, договор оканчивается на 1a2b";
        } else {
            return "Нет, договор не оканчивается на 1a2b";
        }

    }
}

