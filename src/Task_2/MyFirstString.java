package Task_2;

public class MyFirstString {

    static String shortWord(String str) {

       String[] arrayWord1 = arrayWord2(str);

        int indMin = 0;
        int indMax = 0;
        int minimum = arrayWord1[0].length();
        int maximum = 0;

        for (int i = 0; i < arrayWord1.length; i ++){
            if (arrayWord1[i].length() > minimum){
                maximum = arrayWord1[i].length();
                indMax = i;
            } else if (arrayWord1[i].length() == minimum) {
                minimum = arrayWord1[i].length();
                indMin = i;
            } else  {
                indMax = indMin;
                maximum = minimum;
                minimum = arrayWord1[i].length();
                indMin = i;
            }
        }
        return "Коротчайшее слово: " + arrayWord1[indMin] + "\n" + "Длиннейшее слово: " + arrayWord1[indMax];
    }

    private static String[] arrayWord2(String str) {

        char[] arrayStr = str.trim().toCharArray();

        int j = 0;
        for (char item : arrayStr) {
            if (item == ' ') {
                j += 1;
            }
        }

        String[] word2 = new String[j + 1];
        String word1 = "";
        int ind = 0;

        for (int i = 0; i < word2.length; i++) {
            for (int k = ind; k < arrayStr.length; k++) {
                if (arrayStr[k] != ' ') {
                    word1 += arrayStr[k];
                    if (k == arrayStr.length - 1) {
                        word2[i] = word1;
                    }
                } else {
                    ind = k + 1;
                    word2[i] = word1;
                    word1 = "";
                    break;
                }
            }
        }
        return word2;
    }
}
