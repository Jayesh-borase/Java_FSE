package com.Day5.ResourceBundler;
import java.util.ResourceBundle;

public class Sample {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("msgs");

        System.out.println(bundle.getString("greeting"));
        System.out.println(bundle.getString("message"));
    }
}