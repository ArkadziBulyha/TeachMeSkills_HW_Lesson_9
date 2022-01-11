package Task_4;

public class Palindrom {

    static boolean Pal(String[] arrStr, int digit) {

        String str = arrStr[digit];
        StringBuilder strbuild = new StringBuilder(str);
        StringBuilder strbuild1 = new StringBuilder(str);

        strbuild.reverse();
        if (strbuild.toString().equals(strbuild1.toString())) {
            return true;
        } else {
            return false;
        }

    }
}
