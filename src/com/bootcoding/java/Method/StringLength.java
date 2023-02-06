package com.bootcoding.java.Method;

public class StringLength {
    public static void main(String[] args) {
        String str1 = "i love java";
        String str2 = "I love to code";
        boolean result = findTotalNumber(str1,str2);
        System.out.println(result);
    }
    public static boolean findTotalNumber(String s1, String s2){
        if(s1.equals(s2)){
            return(true);
        }
        return(false);
    }
}
