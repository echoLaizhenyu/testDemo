package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tttt {
    public static String getMatcher(String regex, String source) {  
        String result = "";  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(source);  
        while (matcher.find()) {  
            result = matcher.group(2);
        }  
        return result.trim();  
    }  
    
    public static void main(String[] args) {
        String url = "最新章节 789章 jjjjj";
        String regex = "(最新章节)(.*?)(jjjjj)";
//        String regex = "(\\d{1,3}\\.){1,3}(\\d{1,3})";
        System.out.println(getMatcher(regex,url));
    }
}
