package tests;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args){
        System.out.println(Locale.getDefault());

        ResourceBundle rb = ResourceBundle.getBundle("tests.MyConfig");
        System.out.println(rb.getString("name"));
        System.out.println(rb.getString("age"));

    }
}
