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
public class Book {
    private int bookCode;
    private String bookName;
    private float price;
    private int amount;
    private int yearOfManufacture;
    private String author;
    public int getBookCode() {
        return bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.printf("bookCode: ");
        this.bookCode=scan.nextInt();
        System.out.printf("bookName: ");
        scan.nextLine();
        this.bookName=scan.nextLine();
        System.out.printf("price: ");
        this.price=scan.nextFloat();
        System.out.printf("amount: ");
        this.amount=scan.nextInt();
        System.out.printf("yearOfManufacture: ");
        this.yearOfManufacture=scan.nextInt();
        System.out.printf("author: ");
        scan.nextLine();
        this.author=scan.nextLine();
    }
    @Override
    public String toString() {
        return "Book{" + "bookCode=" + bookCode + ", bookName=" + bookName + ", price=" + price + ", amount=" + amount + ", yearOfManufacture=" + yearOfManufacture + ", author=" + author + '}';
    }
    
}
