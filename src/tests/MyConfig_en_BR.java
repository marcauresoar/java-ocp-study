package tests;


import java.util.ListResourceBundle;

public class MyConfig_en_BR extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            { "name", "Custom" },
            { "age", "88" }
        };
    }
}
