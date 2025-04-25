package com.pluralsight;

public class Books {
     int id;
     String isbn;
     String title;
     boolean isCheckedOut;
     String checkedOutTo;

    public Books(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    @Override
     public String toString() {
         String status = IsCheckedOut() ? "Checked out to: " + getCheckedOutTo() : "Available";
         return "Book ID: " + id + " | ISBN: " + isbn + " | Title: " + title + " | Status: " + status;
     }

    private boolean IsCheckedOut() {
        return isCheckedOut;
    }
}


