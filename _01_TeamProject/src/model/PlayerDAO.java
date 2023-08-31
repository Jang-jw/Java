package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PlayerDAO {

	Scanner sc = new Scanner(System.in);
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	private String sql;
	public int resultInt;

	public void RankingInfo() {
		getCon();
		try {
			sql = "SELECT * FROM (SELECT PLAYER_ID , RANKING , POINT FROM PLAYER ORDER BY RANKING DESC) WHERE ROWNUM <= 10";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int cnt = 0;
			while (rs.next()) {
				cnt++;
				System.out.println("순위 : " + cnt + "\t\t 아이디 : " + rs.getString(1) + "\t\t 랭킹 : " + rs.getInt(2)
						+ "\t\t 포인트 : " + rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-cgi.smhrd.com:1524:xe";
			String db_id = "cgi_7_0619_3";
			String db_pw = "smhrd3";
			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (conn != null) {
			System.out.println("DB 연결 성공!");
		} else {
			System.out.println("DB 연결 실패!");
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int login(PlayerDTO dto) {
		getCon();
		try {
			sql = "SELECT player_id, pw1 FROM PLAYER WHERE player_id=? AND pw1=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getPlayer_id());
			psmt.setString(2, dto.getPw1());
			rs = psmt.executeQuery();
			if (rs.next()) {
				resultInt = 1;
			} else {
				resultInt = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return resultInt;
	}

	public int join(PlayerDTO dto) {
		getCon();
		try {
			sql = "INSERT INTO PLAYER VALUES (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getPlayer_id());
			psmt.setString(2, dto.getPw1());
			psmt.setInt(3, dto.getPw2());
			psmt.setInt(4, 0);
			psmt.setInt(5, 0);
			resultInt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return resultInt;
	}

	public int findPw(PlayerDTO dto) {
		getCon();
		try {
			sql = "SELECT player_id, pw2 FROM PLAYER WHERE player_id=? AND pw2=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getPlayer_id());
			psmt.setInt(2, dto.getPw2());
			rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.println("비밀번호를 초기화 합니다.");
				System.out.print("새로운 비밀번호 >> ");
				String pw1 = sc.next();
				try {
					sql = "UPDATE PLAYER SET pw1=? WHERE player_id=?";
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, pw1);
					psmt.setString(2, dto.getPlayer_id());
					resultInt = psmt.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					close();
				}
			} else {
				System.out.println("정보가 맞지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return resultInt;
	}

}
