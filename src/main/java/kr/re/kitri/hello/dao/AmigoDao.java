package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
}