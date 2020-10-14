package ru.shurik16.testalgorithms;

public class StringAlgorithms {

    final static char[][] con = new char[][]{{'[', ']'}, {'(', ')'}, {'{', '}'}};

    public static boolean testString(String str) {

        int indexChar = 1;
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > indexChar) {
            for (char[] chars : con) {
                if (indexChar >= 0 && sb.charAt(indexChar) == chars[1]) {
                    if (sb.charAt(indexChar - 1) == chars[0]) {
                        sb.delete(indexChar - 1, indexChar + 1);
                        indexChar = indexChar - 2;
                    } else return false;
                }
            }

            System.out.println(sb + " index = " + indexChar);
            indexChar++;

        }

        return sb.length() == 0;

    }
}
