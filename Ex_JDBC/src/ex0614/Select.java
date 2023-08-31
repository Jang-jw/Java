package ex0614;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) {

		// 회원 전체 목록을 조회하기

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

			// SQL 문 실행 준비
			String sql = "SELECT * FROM MEMBER";
			psmt = conn.prepareStatement(sql);

			// 실행
			// DML : psmt.executeUpdate()
			// --> int 로 몇 행 변경이 일어났는가?
			// SELECT : psmt.executeQuery()
			// --> ResultSet 객체에 조회 결과를 담아서 리턴
			rs = psmt.executeQuery();

			// 조회결과 가공하기
			// (1) 커서 내리기
			// 커서를 한 칸 내리고 도착한 행에
			// 데이터가 있는지 없는지를 리턴
			// 데이터가 있으면 true / 없으면 false
			// boolean result = rs.next();
			while (rs.next()) { // while 반목문으로 모두 출력
				// (2) 데이터 꺼내기
				// rs.get 자료형(int or String);
				String id = rs.getString(1);
				String pw = rs.getString(2);

				// 컬럼 이름을 기준으로 데이터 꺼내기
				int age = rs.getInt("age");
				System.out.println(id + "\t" + pw + "\t" + age);
				System.out.println("===================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
	}

}
