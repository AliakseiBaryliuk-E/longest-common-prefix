package org.example;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(args, Comparator.comparing(String::length));

        if(args.length == 0) {

            return "";

        }

        for (int i = 1; i < args.length; i++) {

            args[i] = args[i].substring(0, args[0].length());

        }

        while (!args[0].isEmpty()) {

            if (Arrays.stream(args).skip(1).allMatch(s -> args[0].equals(s))) {

                return args[0];

            }
            int length = args[0].length();
            length--;

            for (int i = 0; i < args.length; i++) {

                args[i] = args[i].substring(0, length);

            }

        }

        return "";
    }
}
