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
public class Member {
    private String memberName;
    private String birthday;
    private String gender;
    private String address;
    private String phoneNumber;
    private String identityCard;
    
    public String getMemberName() {
        return memberName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.printf("memberName: ");
        this.memberName=scan.nextLine();
        System.out.printf("birthday: ");
        this.birthday=scan.nextLine();
        System.out.printf("gender: ");
        this.gender=scan.nextLine();
        System.out.printf("phoneNumber :");
        this.phoneNumber=scan.nextLine();
        System.out.printf("address: ");
        this.address=scan.nextLine();
        System.out.printf("identityCard: ");
        this.identityCard=scan.nextLine();
    }

    @Override
    public String toString() {
        return "Member{" + "memberName=" + memberName + ", birthday=" + birthday + ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + ", identityCard=" + identityCard+ '}';
    }
    
}
