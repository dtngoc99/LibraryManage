/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManager;

import Bookstore.Manage;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGOC TY
 */
public class Warehouse {
    ArrayList<Book> bookList =new ArrayList<>();
    ArrayList<BorrowBooks> borrowList=new ArrayList<>();//1
    ArrayList<PayBooks> payList=new ArrayList<>();//2
    private final static String linkWare="D:\\NetBean\\Java\\JavaApplication6\\src\\LibraryManager\\Book.txt";
    private final static String linkBorrow="D:\\NetBean\\Java\\JavaApplication6\\src\\LibraryManager\\Borrow.txt";
    private final static String linkPay="D:\\NetBean\\Java\\JavaApplication6\\src\\LibraryManager\\Pay.txt";
    public void readFileWareHouse() throws IOException, ClassNotFoundException{
        try {
            
            Scanner scan=new Scanner(Paths.get(linkWare),"UTF-8");
            String s;
            while(scan.hasNextLine()){
                Book bk=new Book();
                bk.setBookCode(scan.nextInt());
                bk.setAmount(scan.nextInt());
                bk.setPrice(scan.nextFloat());
                bk.setYearOfManufacture(scan.nextInt());
                s=scan.nextLine().trim();
                StringTokenizer token=new StringTokenizer(s,",");
                bk.setBookName(token.nextToken());
                bk.setAuthor(token.nextToken());
                bookList.add(bk);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error ReadFile");
            //Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void writeFileWareHouse() throws IOException{   
        
        try {
            FileOutputStream fos=new FileOutputStream(linkWare);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            for(Book bk:bookList){
                bw.write(bk.getBookCode()+" ");
                bw.write(bk.getAmount()+" ");
                bw.write(bk.getPrice()+" ");
                bw.write(bk.getYearOfManufacture()+" ");
                bw.write(bk.getBookName()+",");
                bw.write(bk.getAuthor()+"\n");
            }
            bw.close();
            osw.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void readFileBook(int select){
        String s;
        if(select==1){//borrow
            try {
                Scanner scan=new Scanner(Paths.get(linkBorrow),"UTF-8");
                while(scan.hasNextLine()){
                    BorrowBooks bo=new BorrowBooks();
                    bo.setMemberCode(scan.nextInt());
                    bo.setNumberOfBook(scan.nextInt());
                    s=scan.nextLine().trim();
                    StringTokenizer token=new StringTokenizer(s,",");
                    bo.setBookName(token.nextToken());
                    bo.setBorrowDate(token.nextToken());
                    borrowList.add(bo);
                }
                scan.close();
            } catch (IOException ex) {
                System.out.println("error 1 readFile");
                Logger.getLogger(Warehouse.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else if(select==2){//pay
            try {
                Scanner scan=new Scanner(Paths.get(linkPay),"UTF-8");
                while(scan.hasNextLine()){
                    PayBooks pa=new PayBooks();
                    pa.setMemberCode(scan.nextInt());
                    pa.setNumberOfBook(scan.nextInt());
                    s=scan.nextLine().trim();
                    StringTokenizer token=new StringTokenizer(s,",");
                    pa.setBookName(token.nextToken());
                    pa.setPayDate(token.nextToken());
                    payList.add(pa);
               }
                scan.close();
                
            } catch (IOException ex) {
                System.out.println("error 2 readFile");
                Logger.getLogger(Warehouse.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

       
    }
    public void writeFileBook(int select) throws IOException{
        if(select==1){//borrow
            FileOutputStream fos=new FileOutputStream(linkBorrow);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            for(BorrowBooks bo: borrowList){
                bw.write(bo.getMemberCode()+" ");
                bw.write(bo.getNumberOfBook()+" ");
                bw.write(bo.getBookName()+",");
                bw.write(bo.getBorrowDate()+"\n");
            }
            bw.close();
            osw.close();
            fos.close();
        }
        else if(select==2){//pay
            FileOutputStream fos=new FileOutputStream(linkPay);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            for(PayBooks pay: payList){
                bw.write(pay.getMemberCode()+" ");
                bw.write(pay.getNumberOfBook()+" ");
                bw.write(pay.getBookName()+",");
                bw.write(pay.getPayDate()+"\n");
            }
            bw.close();
            osw.close();
            fos.close();
        }
        
    }
}
