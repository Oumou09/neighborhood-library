package com.pluralsight;

import java.util.Scanner;

public class Books {
    private String name;
    private int id;
    private String isbn;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Books(String name, int id, String isbn, boolean isCheckedOut, String checkedOutTo) {
        this.name = name;
        this.id = id;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    @Override
    public String toString() {
        return "Books" + name + '\'' + id + isbn + '\'' + ", isCheckedOut=" + isCheckedOut + ", checkedOutTo='" + checkedOutTo + '\'';
    }
}
