package ex0614;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {

		// id, pw 를 입력받아서
		// 해당하는 사용자가 있는지 없는지를 알아보는 것

		// 1. id, pw 입력받기

		// 2. JDBC 코드를 이용해서
		// 테이블에 해당하는 사용자가 있는지 조회

		// 3. 있다면 id 님 환영합니다~~~
		// 없다면 '아이디나 비밀번호가 잘못되었습니다.' 출력

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "12345";
			conn = DriverManager.getConnection(url, db_id, db_pw);

			if (conn != null) {
				System.out.println("DB 연결 성공!");
			} else {
				System.out.println("DB 연결 실패!");
			}
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 >> ");
			String id = sc.next();
			System.out.print("비밀번호 >> ");
			String pw = sc.next();

			// SQL 문 실행 준비
			String sql = "SELECT * FROM MEMBER WHERE id=? and pw=?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				// 로그인 성공
				String rid = rs.getString(1);
				String rpw = rs.getString(2);
				int rage = rs.getInt(3);
				System.out.println(rid + "님 환영합니다~~~!!");
			} else {
				System.out.println("아이디나 비밀번호가 잘못되었습니다.");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
