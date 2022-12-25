package com.patterns.singleton;

public class Database {
    private static Database instance; // là static để tạo ra dữ liệu tham chiếu đến đối tượng chung.
    // Mọi đối tượng tạo ra chỉ trỏ đến một đối tượng duy nhất

    private Database() {

    }

    public static Database getInstance() {
        if (instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public String query(String sql) {
        return sql;
    }
}
