/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Scanner;
/**
 *
 * @author Aby
 */
public class TugasPraktikum1 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String[] siswa = {"Adit","Aby","Hafiz","Derik","Dear","Karin"};
        String x,y = "";
        System.out.print("Mencari Siapa? ");
        x = baca.nextLine();
        for(int a = 0; a < siswa.length; a++)
        {
            if(x.equals(siswa[a]))
            {
        }else {
                y = siswa[a];
            }
    }
        if(x.equals(y))
        {
            System.out.println("DATA Ditemukan");
        }
        else
        {
            System.out.println("Data Tidak Ditemukan");
        }
}
}
