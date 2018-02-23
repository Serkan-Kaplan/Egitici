/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.PostgreSQL;

import DBConnections.allConnections;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Serkan
 */
public class Ana {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
       /* tblEgiticiCRUD egt=new tblEgiticiCRUD();
        Model.tblegitici megt=new Model.tblegitici();
        megt.setAd("serkan");
        megt.setSoyad("kaplan");
        megt.setAdres("ankara");
        megt.setIletisim("03125555555");
        megt.setBrans("body");
        megt.setCalismaSaatleri("08:00-20:00");
        egt.Kaydet(megt);*/
       
        /*tblEgiticiCRUD egt=new tblEgiticiCRUD();
        Model.tblegitici megt=new Model.tblegitici();
        megt.setAd("serkan_update");
        megt.setSoyad("kaplan_update");
        megt.setAdres("ankara_update");
        megt.setIletisim("03125555555_update");
        megt.setBrans("body_update");
        megt.setCalismaSaatleri("08:00-20:00_update");
        megt.setId(1);
        egt.Duzenle(megt);*/
        
        /*tblEgiticiCRUD egt=new tblEgiticiCRUD();
        egt.Sil(1);*/
        
        
        
        
        
        /*tblEgiticiCRUD egt=new tblEgiticiCRUD();
        for (Object item : egt.Listele()) {
            
            System.out.println("egitici id:"+ ((Model.tblegitici)item).getId());
            System.out.println("egitici ad:"+ ((Model.tblegitici)item).getAd());
            System.out.println("egitici soyad:"+ ((Model.tblegitici)item).getSoyad());
            System.out.println("egitici iletisim:"+ ((Model.tblegitici)item).getIletisim());
            System.out.println("egitici adres:"+ ((Model.tblegitici)item).getAdres());
            System.out.println("egitici brans:"+ ((Model.tblegitici)item).getBrans());
            System.out.println("egitici calismasaatleri:"+ ((Model.tblegitici)item).getCalismaSaatleri());
            System.out.println("---------------------------------------------------");*/
        
        
        tblEgiticiCRUD egt=new tblEgiticiCRUD();
        for (Object item : egt.Listele1()) {
            
            System.out.println("egitici id:"+ ((Model.tblegitici)item).getId());
            System.out.println("egitici ad:"+ ((Model.tblegitici)item).getAd());
            System.out.println("egitici soyad:"+ ((Model.tblegitici)item).getSoyad());
            System.out.println("egitici iletisim:"+ ((Model.tblegitici)item).getIletisim());
            System.out.println("egitici adres:"+ ((Model.tblegitici)item).getAdres());
            System.out.println("egitici brans:"+ ((Model.tblegitici)item).getBrans());
            System.out.println("egitici calismasaatleri:"+ ((Model.tblegitici)item).getCalismaSaatleri());
            System.out.println("---------------------------------------------------");
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
    
    }
    
}
