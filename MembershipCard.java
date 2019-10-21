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
public class MembershipCard extends Member {
    private int memberCode;
    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }
    @Override
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.printf("memberCode: ");
        this.memberCode=scan.nextInt();
        super.input();
    }

    @Override
    public String toString() {
        return "MembershipCard{" + "memberCode=" + memberCode +"\n\t"+ super.toString()+'}';
    }
    
}
