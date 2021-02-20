/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119043.ferminaufalakbar.pkg5;

/**
 *
 * @author FERMI
 * UAS
 * Nama     : Fermi Naufal Akbar
 * NIM      : 10119043
 * Kelas    : IF2
 * Tanggal  : 20-02-2021
 * No Soal  : 5
 */
public class UASIF210119043FERMINAUFALAKBAR5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelMahasiswa mhs = new ModelMahasiswa("10110269","Rizki Adam Kurniawan");
        System.out.println("Nim Mahasiswa " + mhs.getNim());
        System.out.println("Nama Mahasiswa " + mhs.getNama());
    }
    
}
