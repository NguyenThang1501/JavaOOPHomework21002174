package com.patterns.singleton;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        System.out.println(foo.query("SELECT..."));

        Database bar = Database.getInstance();
        System.out.println(bar.query("SELECT..."));
    }
}
