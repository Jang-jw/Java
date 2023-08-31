package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberDAO {
	// DAO : Data Access Object
	// : 데이터에 접근하는 객체 ( DB 에 접근하는 객체 )
	// DB 에 접근해서 SQL 쿼리를 실행하는 코드 ( JDBC ) 를
	// 정의 ( 메소드 ) 해놓은 클래스
	// 하나의 테이블당 하나씩

	// 각 메소드는 SQL 문을 실행하고
	// 실행한 결과를 리턴

	// 모든 메소드에서 사용할 수 있는 결과값 변수!
	Scanner sc = new Scanner(System.in);
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	public String sql;
	public String id;
	public String pw;
	public int age;
	public int r1 = 0;
	public int r2 = 0;
	public int resultInt = 0;
	public boolean resultBool = false;

	// 모든 기능들이 공통적으로 사용하는 getCon(), Close() 생성
	public void getCon() {
		// 동적 드라이버 로딩
		// 데이터베이스 연결 권한 체크!
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
		} catch (Exception e) {
			System.out.println("getCon() 오류");
			e.printStackTrace();
		}
	}

	public void close() {
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

	// 각 기능에 대한 메소드 구조 생성!
	public int insert() {
		System.out.print("아이디 >> ");
		id = sc.next();
		System.out.print("비밀번호 >> ");
		pw = sc.next();
		System.out.print("나이 >> ");
		age = sc.nextInt();
		getCon();
		try {
			sql = "INSERT INTO MEMBER VALUES (?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setInt(3, age);
			resultInt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return resultInt;
	}

	public MemberDTO select() {
		System.out.println("아이디와 비밀번호를 확인하겠습니다.");
		System.out.print("아이디 >> ");
		id = sc.next();
		System.out.print("비밀번호 >> ");
		pw = sc.next();
		getCon();
		sql = "SELECT id, pw FROM MEMBER WHERE id=? AND pw=?";
		MemberDTO rdto = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			// resultBool = rs.next();
			// rs 에 있는 조회 결과를 옮겨 담기
			// 만약에 rs 안에 데이터가 있다면~
			if (rs.next()) {
				String rid = rs.getString(1);
				String rpw = rs.getString(2);
				int rage = rs.getInt(3);

				// 하나로 묶어서 반환
				rdto = new MemberDTO(rid, rpw, rage);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return rdto;
	}

	public int update(String pw, String id) {

		// 정보수정 기능 -> update pw
		getCon();
		try {
			sql = "UPDATE MEMBER SET pw=? WHERE id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setString(2, id);
			r1 = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return r1;
	}

	public int update(int age, String id) {
		// 정보수정 기능 -> update age
		getCon();
		try {
			sql = "UPDATE MEMBER SET age=? WHERE id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, age);
			psmt.setString(2, id);
			r2 = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return r2;
	}

	public int delete(String id, String pw, int age) {
		getCon();
		try {
			sql = "DELETE FROM MEMBER WHERE id=? AND pw=? AND age=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setInt(3, age);
			resultInt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return resultInt;
	}

	public ArrayList<MemberDTO> print() {
		getCon();
		// 행이 여러개가 나오니 결과 dto 가 여러개 생성됨
		// --> 묶어줄 필요가 생김
		// 갯수가 매번 바뀌기 때문에 가변배열 ( ArrayList ) 로 묶어주면 된다.
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			// SQL 문 정의
			sql = "SELECT id, pw, age FROM MEMBER";

			// 실행 준비
			psmt = conn.prepareStatement(sql);

			// 실행
			rs = psmt.executeQuery();

			// 실행결과 만들기
			// rs 에 있는 조회 결과를 옮겨 담기
			while (rs.next()) {
				// 각 컬럼의 데이터 꺼내기
				String rid = rs.getString(1);
				String rpw = rs.getString(2);
				int rage = rs.getInt(3);
				MemberDTO rdto = new MemberDTO(rid, rpw, rage);

				list.add(rdto);
			}
			// 하나로 묶어서 반환
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;

	}

}
