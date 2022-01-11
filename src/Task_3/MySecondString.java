package Task_3;

import java.util.Arrays;

public class MySecondString {

    static String findWord(String str) {
        char[] arrChar = str.toCharArray();
        String[] arrStr = str.split(" ");
        int[] arrSymb = new int[arrStr.length];

        int sameSymb = 0;
        char lastSymb = arrChar[0];
        int j = 0;

        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == ' ') {
                arrSymb[j] = sameSymb - 1;
                j++;
                sameSymb = 0;
                lastSymb = arrChar[i + 1];
            } else if (lastSymb == arrChar[i]) {
                sameSymb++;
            } else if (lastSymb != arrChar[i]) {
                lastSymb = arrChar[i];
            }

            if (i == arrChar.length - 1) {
                arrSymb[j] = sameSymb;
            }

        }

        sameSymb = maxFindSymb(arrSymb);

        return arrStr[sameSymb];
    }

        private static int maxFindSymb(int[] arr) {
            int max = arr[0];
            int ind = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    ind = i;
                }
            }
            return ind;
        }
}

