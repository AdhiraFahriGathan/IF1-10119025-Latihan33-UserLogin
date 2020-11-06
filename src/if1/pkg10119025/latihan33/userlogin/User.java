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
public class User {
    private final static String username = "gathan";
    private final static String password = "wonderful";
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword){
        return statusAkun = parUserName.equals(username) && parPassword.equals(password);
    }

    private void hasilLogin(boolean status, String parUserName){
        String hasil = status ? "******HALLO ".concat(parUserName)
                .concat("******\nSelamat Datang di Aplikasi ini")
                : "Ooops, Username atau Password anda salah";
        System.out.println(hasil);
    }

    public void pengecekanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}

