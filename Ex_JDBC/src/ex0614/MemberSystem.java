package ex0614;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberSystem {

	static Scanner sc = new Scanner(System.in);
	static Connection conn = null;
	static PreparedStatement psmt = null;
	static ResultSet rs = null;
	static String id;
	static String pw;
	static int age;
	static String sql;
	static int r1;
	static int r2;

	public static void main(String[] args) {

		// 각각 흩어져 있는 기능들을 통합적으로 합치기!

		// 5번이 선택되지 않는 한 기능을 반복적으로 선택할 수 있도록 만들기!
		while (true) {
			id = "";
			pw = "";
			age = 0;
			sql = "";
			r1 = 0;
			r2 = 0;
			resultInt = 0;
			resultBool = false;
			System.out.print("[1]회원가입 [2]로그인 [3]정보수정 [4]회원탈퇴 [5]종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 회원가입 기능 -> insert
				insert();
				if (resultInt > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패!");
				}
			} else if (choice == 2) {
				// 로그인 기능 -> select
				select();
				if (resultBool) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패!");
					continue;
				}
			} else if (choice == 3) {
				// 정보수정 기능 -> update
				select();
				if (resultBool) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패!");
					continue;
				}
				System.out.print("[1]비밀번호 수정 [2]나이 수정 >> ");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.print("변경할 비밀번호 >> ");
					pw = sc.next();
					r1 = update(pw, id);
				} else if (num == 2) {
					System.out.print("변경할 나이 >> ");
					int age = sc.nextInt();
					r2 = update(age, id);
				} else {
					continue;
				}
				if (r1 > 0) {
					System.out.println("비밀번호 변경 성공!");
				} else if (r2 > 0) {
					System.out.println("나이 수정 성공!");
				} else {
					System.out.println("수정 실패!");
				}

			} else if (choice == 4) {
				// 회원탈퇴 기능 -> delete
				select();
				if (resultBool) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패!");
					continue;
				}
				System.out.print("나이 >> ");
				age = sc.nextInt();
				delete(id, pw, age);
				if (resultInt > 0) {
					System.out.println("회원탈퇴 성공!");
				} else {
					System.out.println("회원탈퇴 실패!");
				}
			} else if (choice == 5) {
				// 프로그램 종료
				System.out.println("프로그램 종료");
				close();
				break;
			} else {
				System.out.println("잘못된 선택입니다..!");
			}
		} // while 끝

	}

	// 모든 메소드에서 사용할 수 있는 결과값 변수!
	static int resultInt = 0;
	static boolean resultBool = false;

	// 모든 기능들이 공통적으로 사용하는 getCon(), Close() 생성
	public static void getCon() {
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

	public static void close() {
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
	public static int insert() {
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

	public static void select() {
		System.out.println("아이디와 비밀번호를 확인하겠습니다.");
		System.out.print("아이디 >> ");
		id = sc.next();
		System.out.print("비밀번호 >> ");
		pw = sc.next();
		getCon();
		sql = "SELECT id, pw FROM MEMBER WHERE id=? AND pw=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			resultBool = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public static int update(String pw, String id) {

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

	public static int update(int age, String id) {
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

	public static int delete(String id, String pw, int age) {
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

}
