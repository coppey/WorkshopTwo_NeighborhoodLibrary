package com.pluralsight;

public class Book
{
    //data
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //constructor
    public Book(
            int id,
            String isbn,
            String title,
            boolean isCheckedOut,
            String checkedOutTo)
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }









    //setters and getters
    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "checkedOutTo='" + checkedOutTo + '\'' +
                ", id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                '}';
    }
}