package com.bilisimegitim.personelnewtwo.test;

import com.bilisimegitim.personeltwo.dto.Personel;
import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {

        Personel p1 = new Personel();
        p1.setAd("Bogac");
        p1.setSoyad("Morkoyun");
        p1.setMaas(13000);

        Personel p2 = new Personel();
        p2.setAd("Taner");
        p2.setSoyad("Esen");
        p2.setMaas(6000);

        Personel p3 = new Personel();
        p3.setAd("Berna");
        p3.setSoyad("Akkaya");
        p3.setMaas(7000);
        
        
        ArrayList personelListe = new ArrayList();
        
        personelListe.add(p1);
        personelListe.add(p2);
        personelListe.add(p3);
        
        
        
        
        for (int i = 0; i < personelListe.size(); i++) {
            
            Personel p = new Personel();
            p = (Personel) personelListe.get(i);
            System.out.println(p.getAd());
            System.out.println(p.getSoyad());
            System.out.println(p.getMaas());
            
            
        }
        // Javaya sonradan eklenen generics sistemdir
       ArrayList<Personel> personelListe2 = new ArrayList<Personel>();
        
        personelListe2.add(p1);
        personelListe2.add(p2);
        personelListe2.add(p3);
        
        for (int i = 0; i < personelListe2.size(); i++) {
            
            Personel p = new Personel();
            p = personelListe2.get(i);
            System.out.println(p.getAd());
            System.out.println(p.getSoyad());
            System.out.println(p.getMaas());
        

    }

}}
