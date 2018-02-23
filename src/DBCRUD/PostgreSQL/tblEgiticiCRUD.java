/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.PostgreSQL;

import DBConnections.allConnections;
import DBFramework.ICRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
          Model.tblegitici egitici;
        egitici=(Model.tblegitici)o;
        
        
         try {
             
             
             PreparedStatement  ifade = baglanti.baglan().prepareCall("update tblegitici set ad=?,soyad=?,adres=?,iletisim=?,brans=?,calismaSaatleri=? where id=?");
         
             ifade.setString(1, egitici.getAd());
             ifade.setString(2,egitici.getSoyad());
             ifade.setString(3, egitici.getAdres());
             ifade.setString(4, egitici.getIletisim());
             ifade.setString(5, egitici.getBrans());
             ifade.setString(6, egitici.getCalismaSaatleri());
             ifade.setInt(7, egitici.getId());
             System.out.println(ifade.toString());        
             ifade.executeUpdate();
             
             
             
             
             
             
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

    @Override
    public void Sil(long id) {
    
         try {
             PreparedStatement  ifade = baglanti.baglan().prepareCall("delete from tblegitici where id=?");
             ifade.setInt(1, (int)id);
             ifade.executeUpdate();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         }
             
       
       
    }

    @Override
    public List<Object> Listele() {
         
        
             ArrayList<Object> egiticilistesi= new ArrayList<>();
             ResultSet rs;
             Model.tblegitici item;
              try {
             PreparedStatement  ifade = baglanti.baglan().prepareCall("select * from tblegitici");
             rs= ifade.executeQuery();
             while(rs.next()){
                 item = new Model.tblegitici();
                 item.setId(rs.getInt("id"));
                 item.setAd(rs.getString("ad"));
                 item.setSoyad(rs.getString("soyad"));
                 item.setAdres(rs.getString("adres"));
                 item.setIletisim(rs.getString("iletisim"));
                 item.setBrans(rs.getString("brans"));
                 item.setCalismaSaatleri(rs.getString("calismasaatleri"));
                 
                 
                 egiticilistesi.add(item);
                 
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         }
          return egiticilistesi;   
    }
             
    
    
    public List<Model.tblegitici> Listele1() {
         
        int i=0;
             ArrayList<Model.tblegitici> egiticilistesi= new ArrayList<>();
             ResultSet rs;
             
              try {
             PreparedStatement  ifade = baglanti.baglan().prepareCall("select * from tblegitici");
             rs= ifade.executeQuery();
             while(rs.next()){
                 
                 egiticilistesi=new ArrayList<>();
                 egiticilistesi.get(i).setId(rs.getInt("id"));
                 egiticilistesi.get(i).setAd(rs.getString("ad"));
                 egiticilistesi.get(i).setSoyad(rs.getString("soyad"));
                 egiticilistesi.get(i).setIletisim(rs.getString("iletisim"));
                 egiticilistesi.get(i).setAdres(rs.getString("adres"));
                 egiticilistesi.get(i).setBrans(rs.getString("brans"));
                 egiticilistesi.get(i).setCalismaSaatleri(rs.getString("calismasaatleri"));
                 i=i+1;
                 return egiticilistesi;
                 
               
                 
                 
                
                 
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(tblEgiticiCRUD.class.getName()).log(Level.SEVERE, null, ex);
         }
          return egiticilistesi;   
    }
             
    
    
    
    
    
             @Override
             public Object Bul(long id) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }    
    
 
    
    
    
    
}
