package br.com.floresdev.fipe_table.application;

import java.util.Scanner;

public class UserInteraction {

    private static final Scanner SC = new Scanner(System.in);

    public String getCategory() {
        return SC.next();
    }

    public String getBrandCode() {
        return SC.next();
    }

    public String getBaseModelName() {
        return SC.nextLine();
    }

    public Integer getBaseModelCode() {
        return SC.nextInt();
    }

}
