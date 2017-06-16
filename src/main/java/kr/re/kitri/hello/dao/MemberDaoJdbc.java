package kr.re.kitri.hello.dao;


import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class MemberDaoJdbc {

    @Autowired
    private DataSource dataSource;

    public void updatePoint(int memberId) {

        String query = "UPDATE member SET point = point + 10\n" +
                "WHERE member_seq = ?";

        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, memberId);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void signupMember(Member member) {

        try {
            //connection 확보
            Connection conn = dataSource.getConnection();

            //query create
            String query = "INSERT INTO member (userid, password, email, join_date)\n" +
                            "VALUES (?, ?, ?, now())";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, member.getUserId());
            pstmt.setString(2, member.getPassword());
            pstmt.setString(3, member.getEmail());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}