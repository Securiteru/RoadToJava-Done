package com.Securiter;

public class BookBorrowed {

    private String title;
    private String author;
    private boolean isBorrowed;

    private String getId(){
        return title+ " " + author;
    }

    public boolean isSameBook(BookBorrowed b){
        if(b.getId().equals(this.getId())) {
            return true;
        }else{
            return false;
        }
    }

    public BookBorrowed(String title, String author){
        this.title=title;
        this.author=author;
    }

    public void borrowBook(){
        isBorrowed=true;
    }

    public void returnBook(){
        isBorrowed=false;
    }

    public boolean isBookBorrowed(){
        return isBorrowed;
    }


}
