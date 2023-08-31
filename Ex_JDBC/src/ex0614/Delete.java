package ex0614;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {

		// 사용자의 아이디와 비밀번호를 입력받아서
		// 해당하는 사용자 정보를 DB 에서 삭제

		// 1. 사용자 아이디, 비밀번호 입력받기

		// 2. JDBC 코드를 사용해서 Delete 문 실행
		// 1) Driver 동적로딩
		// 2) DB 랑 연결
		// jdbc:oracle:thin: -> 프로토콜
		// @localhost -> ip 주소 ( 특정 하나의 컴퓨터를 지정 )
		// :1521 -> port 번호 ( 어떤 문으로 들어가야 해당 프로그램이 나오는지 )
		// :xe -> 데이터베이스 이름

		// 3. 실행결과에 따라 삭제 성공 or 삭제 실패

		Connection conn = null;
		PreparedStatement psmt = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "hr";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url, db_user, db_pw);

			if (conn != null) {
				System.out.println("DB 연결 성공!");
			} else {
				System.out.println("DB 연결 실패!");
			}
			Scanner sc = new Scanner(System.in);
			System.out.print("삭제할 아이디 >> ");
			String id = sc.next();
			System.out.print("비밀번호 >> ");
			String pw = sc.next();

			String sql = "DELECT FROM MEMBER WHERE ID=? AND PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			result = psmt.executeUpdate();

			if (result > 0) {
				System.out.println("아이디 삭제 성공!");
			} else {
				System.out.println("아이디 삭제 실패!");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
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
