/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManager;

import java.util.Scanner;

/**
 *
 * @author NGOC TY
 */
public class BorrowBooks extends MembershipCard{
    private int numberOfBook;
    private String borrowDate;
    private String bookName;
    public int getNumberOfBook() {
        return numberOfBook;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    @Override
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.printf("bookName: ");
        this.bookName=scan.nextLine();
        System.out.printf("numberOfBook: ");
        this.numberOfBook=scan.nextInt();
        System.out.printf("borrowDate: ");
        scan.nextLine();
        this.borrowDate=scan.nextLine();

    }

    @Override
    public String toString() {
        return "BorrowBooks{ " +super.toString() + ", bookName=" + bookName + "numberOfBook="+ numberOfBook + ", borrowDate=" + borrowDate  + '}';
    }

    
}
