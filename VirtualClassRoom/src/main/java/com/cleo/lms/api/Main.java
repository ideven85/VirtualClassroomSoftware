package com.cleo.lms.api;

import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
       var c = List.of("1","2");
        System.out.println(Pattern.quote("abcd").replace("b","D"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]+","Deven123"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]+", "JA2Uk2"));
        String s = "1";

       
    }
}
