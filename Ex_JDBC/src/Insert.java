import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {

		// try 문에서도 사용하고
		// finally 문에서도 사용하기 위한
		// 전역변수
		Connection conn = null;
		PreparedStatement psmt = null;

		// JDBC 의 작동 순서
		// 1. 드라이버 로딩
		// 사전작업) ojdbc6.jar 파일 연결하기 (프로젝트 파일)

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 1.
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "hr";
			String db_pw = "12345";

			// 2. 데이터베이스 연결 -> Connection 객체 필요!
			conn = DriverManager.getConnection(db_url, db_user, db_pw);

			// 데이터베이스 연결 확인하기
			if (conn != null) {
				System.out.println("DB 연결 성공!");
			} else {
				System.out.println("DB 연결 실패!");
			}

			// 3. Query 전송 -> preparedStatement
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 >> ");
			String id = sc.next();
			System.out.print("비밀번호 >> ");
			String pw = sc.next();
			System.out.print("나이 >> ");
			int age = sc.nextInt();

			String sql = "insert into Member values(?,?,?)";

			// 연결된 DB 에 sql 문장 전달!
			psmt = conn.prepareStatement(sql);

			// 실제 ? 에 연결되어야 하는 갑들 지정하기!
			// 1. ? -> String -> setString()
			psmt.setString(1, id);
			// 2. ? -> String -> setString()
			psmt.setString(2, pw);
			// 3. ? -> int -> setString()
			psmt.setInt(3, age);

			// 4. 결과 처리
			// sql 실행하기!
			// DB 데이터 변경 --> DML : ~~~ 행이 변경되었습니다.
			// executeUpdate() --> DML 을 쓸때만 사용
			// 몇 행이 변경이 일어났는가?
			int result = psmt.executeUpdate(); // 중요한 내용

			if (result > 0) {
				System.out.println("회원 가입 성공!");
			} else {
				System.out.println("회원 가입 실패!");
			}
		} catch (ClassNotFoundException e) {
			// 1. 프로젝트에 ojdbc6.jar 가 없는 경우
			// 2. Class.forName() 의 경로가 오타가 났을 경우
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace(); // catch 문에서 반드시 작성해야 한다. ( 오류 설명 )
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 5. 자원 반납 -> catch 문이 끝난 이후에 가장 마지막으로 진행!
		finally {
			// 에러가 발행하던지 아니면, 발생하지 않더라도
			// 마지막에 꼭 실행되어야 하는 부분!
			// 자원을 반납하는 순서 -> 사용한 객체들의 역순으로 닫아주기!
			// 생성의 순서 1. conn -> 2. psmt
			// 반납의 순서 2. psmt -> 2. conn

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
