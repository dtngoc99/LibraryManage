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
public class PayBooks extends MembershipCard{
    private int numberOfBook;
    private String payDate;
    private String bookName;
    public int getNumberOfBook() {
        return numberOfBook;
    }

    public String getPayDate() {
        return payDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
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
        System.out.printf("payDate: ");
        scan.nextLine();
        this.payDate=scan.nextLine();

    }

    @Override
    public String toString() {
        return "PayBooks{" +super.toString() + ", bookName=" + bookName+ "numberOfBook=" + numberOfBook + ", payDate=" + payDate  + '}';
    }


    
}
