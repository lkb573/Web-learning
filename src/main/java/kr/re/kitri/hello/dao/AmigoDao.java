package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.security.acl.AclImpl;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class AmigoDao {

    @Autowired
    private DataSource dataSource;


    public void insertAimgo(Amigo amigo) {

        try {
            Connection conn = dataSource.getConnection();

            String query = "INSERT INTO amigo (name, phone_num, email) " +
                    "VALUES (?, ?, ?);";

            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, amigo.getName());
            pstmt.setString(2, amigo.getPhoneNum());
            pstmt.setString(3, amigo.geteMail());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<Amigo> selectAllAimgos() {
        String query = "SELECT amigo_id, name, phone_num, email from amigo";

        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            List<Amigo> list = new ArrayList<>();
            
            Amigo amigo;
            while (rs.next()){
                amigo = new Amigo();
                amigo.setAmigoId(rs.getInt(1));
                amigo.setName(rs.getString(2));
                amigo.setPhoneNum(rs.getString(3));
                amigo.seteMail(rs.getString(4));
                
                list.add(amigo);
            }

            conn.close();

            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    public Amigo selectAmigoByName(String name) {

        String query = "SELECT amigo_id, name, phone_num, email\n" +
                "from amigo\n" +
                "WHERE name = ?";

        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Amigo amigo = new Amigo();
            amigo.setAmigoId(rs.getInt(1));
            amigo.setName(rs.getString(2));
            amigo.setPhoneNum(rs.getString(3));
            amigo.seteMail(rs.getString(4));

            conn.close();

            return amigo;

        } catch (SQLException e) {
            e.printStackTrace();
            return new Amigo();
        }


    }
}