import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			// 1. 드라이버 동적 로딩 -> Class.forNmae() 사용
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결 -> connection 객체 사용
			// : db_url, db_user, db_pw 입력
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "hr";
			String db_pw = "12345";

			// -> DriverManage.getConnectiron() 활용
			conn = DriverManager.getConnection(db_url, db_user, db_pw);

			// 데이터베이스 연결 확인하기
			if (conn != null) {
				System.out.println("DB 연결 성공!");
			} else {
				System.out.println("DB 연결 실패!");
			}

			// 3 전송하고자 하는 sql 문장 생성 하기
			// : 어떤 내용으로 수정 할 것인지 수정 값 입력받기 ( 비밀번호 바꾸기 )
			// + test 라는 아이디를 가지고 있는 회원에 대한 비밀번호 수정!
			// : 생성된 sql 문장 DB 로 전달
			// -> PreparedStatement 객체 사용
			// -> 사용자로 부터 입력받은 수정값은? 을 사용하여 DB 에 전달
			// 해당 sql 문 실행하기 -> psmt.executepdeat{}
			// : 실행 결과에 대한 결과 값 저장하기 -> 성공 여부 파악!
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 아이디 >> ");
			String id = sc.next();
			System.out.print("비밀번호 >> ");
			String pw = sc.next();

			String sql = "update member set pw=? where id=?";

			// 연결된 DB 에 sql 문장 전달!
			psmt = conn.prepareStatement(sql);

			// 실제 ? 에 연결되어야 하는 갑들 지정하기!
			// 1. ? -> String -> setString()
			psmt.setString(1, pw);
			psmt.setString(2, id);

			int result = psmt.executeUpdate();

			if (result > 0) {
				System.out.println("비밀번호 변경 성공!");
			} else {
				System.out.println("비밀번호 변경 실패!");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 4. 다 사용된 객체들 역순으로 닫아주기! -> colose() 사용
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
