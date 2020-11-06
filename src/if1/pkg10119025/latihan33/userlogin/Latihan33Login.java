/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan33Login {
    private static String usName;
    private static String passWord;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = new User();
        System.out.print("Masukkan Username = ");
        usName = scan.next();
        System.out.print("Masukkan Password = ");
        passWord = scan.next();
        user.pengecekanLogin(usName, passWord);
    }
}