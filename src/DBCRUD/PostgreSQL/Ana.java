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
        
        tblEgiticiCRUD egt=new tblEgiticiCRUD();
        egt.Sil(1);
        
        
        
    
    }
    
}
