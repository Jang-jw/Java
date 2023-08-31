package view;

import java.util.Scanner;

import model.PlayerDAO;
import model.PlayerDTO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PlayerDAO dao = new PlayerDAO();
		PlayerDTO dto = new PlayerDTO();
		String id;
		String pw1;
		int pw2;

		while (true) {
			System.out.print("[1]로그인 \t [2]회원가입 \t [3]비밀번호 찾기 \t [4]종료 ");
			int loginJoin = sc.nextInt();
			if (loginJoin == 1) {
				System.out.println("정보를 확인하겠습니다.");
				System.out.print("아이디 >> ");
				id = sc.next();
				System.out.print("비밀번호 >> ");
				pw1 = sc.next();
				dto = new PlayerDTO(id, pw1);
				if (dao.login(dto) > 0) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("회원 정보가 없습니다.");
					continue;
				}
			} else if (loginJoin == 2) {
				System.out.println("필수사항을 입력해주세요.(아이디, 비밀번호, 2차 인증번호)");
				System.out.print("아이디 >> ");
				id = sc.next();
				System.out.print("비밀번호 >> ");
				pw1 = sc.next();
				System.out.print("2차 인증번호 >> ");
				pw2 = sc.nextInt();
				dto = new PlayerDTO(id, pw1, pw2);
				if (dao.join(dto) > 0) {
					System.out.println("회원가입 성공!");
					continue;
				} else {
					System.out.println("회원가입 실패!");
					continue;
				}
			} else if (loginJoin == 3) {
				System.out.println("정보를 확인합니다.");
				System.out.print("아이디 >> ");
				id = sc.next();
				System.out.print("2차 인증번호 >> ");
				pw2 = sc.nextInt();
				dto = new PlayerDTO(id, pw2);
				if (dao.findPw(dto) > 0) {
					System.out.println("비밀변호 변경 완료!");
					continue;
				} else {
					System.out.println("비밀번호 변경 실패!");
					continue;
				}
			} else if (loginJoin == 4) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				continue;
			}
			while (true) {
				System.out.print("[1]게임시작 [2]정보조회 [3]랭킹조회 [4]상점 [5]입출금시스템 [6]로그아웃 >> ");
				int choice = sc.nextInt();
				if (choice == 3) {
					System.out.println("랭킹을 조회합니다.");
					dao.RankingInfo();
				} else if (choice == 6) {
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					continue;
				}
			}

		}
	}
}
