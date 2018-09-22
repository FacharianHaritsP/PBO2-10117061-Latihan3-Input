/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author Fachrian Harits Pratama
 * Nama                 : Fachrian Harits Pratama
 * Kelas                : PBO2
 * NIM                  : 10117061
 * Deskripsi program    : Program ini memasukan value dan menampilkan hasil
 */
public class PBO210117061Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Masukan nama anda: ");
        Scanner satu = new Scanner (System.in);
        
        String nama = satu.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
