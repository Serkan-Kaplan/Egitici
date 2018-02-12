/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.PostgreSQL;

import DBConnections.allConnections;
import DBFramework.ICRUD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vektorel
 */
public class tblEgiticiCRUD implements ICRUD{
    
     allConnections baglanti = new allConnections();

    @Override
    public void Kaydet(Object o) {
        
        Model.tblegitici egitici;
        egitici=(Model.tblegitici)o;
        
        
         try {
             
             
             PreparedStatement  ifade = baglanti.baglan().prepareCall("insert into tblegitici(ad,soyad,adres,iletisim,brans,calismaSaatleri) values(?,?,?,?,?,?)");
         
             ifade.setString(1, egitici.getAd());
             ifade.setString(2,egitici.getSoyad());
             ifade.setString(3, egitici.getAdres());
             ifade.setString(4, egitici.getIletisim());
             ifade.setString(5, egitici.getBrans());
             ifade.setString(6, egitici.getCalismaSaatleri());
             System.out.println(ifade.toString());        
             ifade.executeUpdate();
             
             
             
             
             
             
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

    @Override
    public void Duzenle(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Sil(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> Listele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Bul(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
    
    
    
}
