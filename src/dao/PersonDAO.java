/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Person;

/**
 *
 * @author bienvenidos
 */
public class PersonDAO {
    public int insert_friend(Person pojo) {
        Connection con = null;
        PreparedStatement st = null;
        int id = 0;
        try {
            con = Conexion.getConnection();
            st = con.prepareStatement("call insert_person (?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, pojo.getName());
//            st.setBinaryStream(5, null);
            st.setBinaryStream(2, new FileInputStream(
                    new File(pojo.getImg())), 
                    (int) new File(pojo.getImg()).length());
//            st.setBinaryStream(5, new FileInputStream(new File(pojo.getImage())),
//                    (int) new File(pojo.getImage()).length());
            id = st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println("ID inserted "+id);
            }
        } catch (Exception e) {
            System.out.println("Error while inserting a person " + e);
        } finally {
            Conexion.close(con);
            Conexion.close(st);
        }
        return id;
    }
    
    public static Person selectFriend(int id) {
        Connection con = null;
        PreparedStatement st = null;
        Person pojo = new Person();
        try {
            con = Conexion.getConnection();
            st = con.prepareStatement("CALL select_peson(?)");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                pojo = inflaPOJO(rs);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar amigo " + e);
        } finally {
            Conexion.close(con);
            Conexion.close(st);
        }
        return pojo;
    }
    
    private static Person inflaPOJO(ResultSet rs) {

       Person pojo = new Person();
        try {
            pojo.setId(rs.getInt("id"));
            pojo.setName(rs.getString("nombre"));
            pojo.setImgB(rs.getBlob("imagen"));
            //pojo.setImage(rs.getBlob("image"));
        } catch (SQLException ex) {
            System.out.println("Error al inflar pojo " + ex);
        }
        return pojo;
    }
    
}
