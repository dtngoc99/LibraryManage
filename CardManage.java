/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManager;

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
public class CardManage {
    ArrayList<MembershipCard>  cardList=new ArrayList<>();
    final static String link="D:\\NetBean\\Java\\JavaApplication6\\src\\LibraryManager\\Card.txt";
    public void readFile() throws IOException{
        Scanner scan=new Scanner(Paths.get(link),"UTF-8");
        while(scan.hasNextLine()){
            MembershipCard mem=new MembershipCard();
            mem.setMemberCode(scan.nextInt());
            String s=scan.nextLine().trim();
            StringTokenizer token=new StringTokenizer(s,",");
            mem.setMemberName(token.nextToken());
            mem.setBirthday(token.nextToken());
            mem.setGender(token.nextToken());
            mem.setAddress(token.nextToken());
            mem.setPhoneNumber(token.nextToken());
            mem.setIdentityCard(token.nextToken());
            cardList.add(mem);
        }
        scan.close();
    }
    public void writeFile() throws IOException{
        try {
            FileOutputStream fos= new FileOutputStream(link);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            for(MembershipCard m: cardList){
                bw.write(m.getMemberCode()+" ");
                bw.write(m.getMemberName()+","+m.getBirthday()+","+m.getGender()+","+m.getAddress()+","+m.getPhoneNumber()+","+m.getIdentityCard()+"\n");
            }
            bw.close();
            osw.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CardManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
