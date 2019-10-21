/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManager;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGOC TY
 */
public class LibraryManage {
    CardManage card=new CardManage();
    Warehouse ware=new Warehouse();

    public void menu() throws ClassNotFoundException{
        
        try {
            card.readFile();
            ware.readFileWareHouse();
            ware.readFileBook(1);
            ware.readFileBook(2);
        } catch (IOException ex) {
            Logger.getLogger(LibraryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(true){
            int select=0;
            Boolean check=false;
            System.out.println("\t0.Break;");
            System.out.println("\t1.BorrowBooks");
            System.out.println("\t2.PayBooks");
            System.out.println("\t3.BookSearch");
            System.out.println("\t4.AddCard");
            System.out.println("\t5.AddBook");
            System.out.println("\t6.Find Borrowed Books By Member");
            Scanner scan=new Scanner(System.in);
            System.out.printf("Selection: ");
            select=scan.nextInt();
            int memberCode=0;
            switch(select){
                case 1:
                    System.out.printf("memberCode: ");
                    scan.nextLine();
                    memberCode=scan.nextInt();
                    for(MembershipCard m: card.cardList){
                        if(memberCode==m.getMemberCode())
                        {
                            check=true;
                            System.out.println(m.toString());
                            BorrowBooks bo=new BorrowBooks();
                            bo.input();
                            bo.setMemberCode(memberCode);
                            ware.borrowList.add(bo);
                            break;
                        }
                    }
                    if(check==false){
                        System.out.println("Not Exists");
                    }
                    break;
                case 2:
                    System.out.printf("memberCode: ");
                    scan.nextLine();
                    memberCode=scan.nextInt();
                    for(MembershipCard m: card.cardList){
                        if(memberCode==m.getMemberCode())
                        {
                            check=true;
                            System.out.println(m.toString());
                            PayBooks pay=new PayBooks();
                            pay.setMemberCode(memberCode);
                            pay.input();
                            ware.payList.add(pay);
                            break;
                        }
                    }
                    if(check==false){
                        System.out.println("Not Exists");
                    }
                    break;
                case 3:
                    System.out.printf("bookName: ");
                    scan.nextLine();
                    String bookName=scan.nextLine();
                    for(Book b:ware.bookList){
                        if(bookName.equals(b.getBookName())){
                            check=true;
                            System.out.println(b.toString());
                            break;
                        }
                    }
                    if(check==false){
                        System.out.println("Not Exists");
                    }
                    break;
                case 4:
                    MembershipCard ca=new MembershipCard();
                    ca.input();
                    card.cardList.add(ca);
                    break;
                case 5:
                    Book b =new Book();
                    b.input();
                    ware.bookList.add(b);
                    break;
                case 6:
                    System.out.printf("memberCode: ");
                    memberCode=scan.nextInt();
                    for(BorrowBooks bo: ware.borrowList){
                        if(memberCode==bo.getMemberCode()){
                            check=true;
                            System.out.print("BookName: "+bo.getBookName());
                            System.out.printf("\tnumberOfBook: "+bo.getNumberOfBook());
                            System.out.printf("\tborrowDate: "+bo.getBorrowDate()+"\n");
                        }
                    }
                    if(check==false){
                        System.out.println("Not Exists");
                    }
                    break;
                default:
                    {
                        try {
                            card.writeFile();
                            ware.writeFileWareHouse();
                            ware.writeFileBook(1);
                            ware.writeFileBook(2);
                        } catch (IOException ex) {
                            Logger.getLogger(LibraryManage.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    return;
            }
        }
        
    }
}
