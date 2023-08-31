package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class MemberSystem {

	private static final MemberDTO MemberDTO = null;
	static Scanner sc = new Scanner(System.in);
	static MemberDAO dao = new MemberDAO();
	static private String id;
	static private String pw;
	static private int age;

	public static void main(String[] args) {

		// 각각 흩어져 있는 기능들을 통합적으로 합치기!

		// 5번이 선택되지 않는 한 기능을 반복적으로 선택할 수 있도록 만들기!
		while (true) {
			dao.id = "";
			dao.pw = "";
			dao.age = 0;
			dao.sql = "";
			dao.r1 = 0;
			dao.r2 = 0;
			dao.resultInt = 0;
			dao.resultBool = false;
			System.out.print("[1]회원가입 [2]로그인 [3]정보수정 [4]회원탈퇴 [5]종료 [6]회원전체 출력 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 회원가입 기능 -> insert
				dao.insert();
				MemberDTO rdto = dao.select();
				if (rdto != null) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패!");
				}
			} else if (choice == 2) {
				// 로그인 기능 -> select
				dao.select();
				if (dao.resultBool) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패!");
					continue;
				}
			} else if (choice == 3) {
				// 정보수정 기능 -> update
				dao.select();
				if (dao.resultBool) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패!");
					continue;
				}
				System.out.print("[1]비밀번호 수정 [2]나이 수정 >> ");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.print("변경할 비밀번호 >> ");
					String pw = sc.next();
					dao.update(pw, id);
				} else if (num == 2) {
					System.out.print("변경할 나이 >> ");
					int age = sc.nextInt();
					dao.update(age, id);
				} else {
					continue;
				}
				if (dao.r1 > 0) {
					System.out.println("비밀번호 변경 성공!");
				} else if (dao.r2 > 0) {
					System.out.println("나이 수정 성공!");
				} else {
					System.out.println("수정 실패!");
				}

			} else if (choice == 4) {
				// 회원탈퇴 기능 -> delete
				dao.select();

				// 메소드 호출시 필요한 데이터 전달!
				// 전달 데이터를 DTO 로 한 번 묶기
				MemberDTO dtoPw = new MemberDTO();
				dtoPw.setPw(pw);
				MemberDTO dtoAge = new MemberDTO();
				dtoPw.setAge(age);
				if (dao.resultBool) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패!");
					continue;
				}
				// 메소드 호출시 필요한 데이터 전달!
				// 전달 데이터를 DTO 로 한 번 묶기
				MemberDTO dto = new MemberDTO();
				dto.setAge(age);
				System.out.print("나이 >> ");
				int age = sc.nextInt();
				dao.delete(dao.id, dao.pw, age);
				if (dao.resultInt > 0) {
					System.out.println("회원탈퇴 성공!");
				} else {
					System.out.println("회원탈퇴 실패!");
				}
			} else if (choice == 5) {
				// 프로그램 종료
				System.out.println("프로그램 종료");
				dao.close();
				break;
			} else if (choice == 6) {
				// 회원 전체 출력
				ArrayList<MemberDTO> list = dao.print();

				// SQL 문을 뭐를 써야 하는가
				// SELECT ID , PW , AGE FROM MEMBER ;

				// DAO 에 메서드 정의
				// ( Member 테이블에서 회원 전체 목록을 조회하는 메서드 )
				// --> SQL 문 실행 / 결과 반환

				// 받아온 회원 목록 데이터를 출력
				// 아이디 비밀번호 나이
				// ==============
				// test 123 19
				System.out.println("아이디 \t 비밀번호 \t 나이");
				/*
				 * //// for (int i = 0; i < list.size(); i++) { ////
				 * System.out.println("===================="); ////
				 * System.out.println(list.get(i).getId() + "\t" + list.get(i).getPw() + "\t" +
				 * list.get(i).getAge()); //// } // // // for-each 문 ( 배열과 함께 쓰는 for 문 )
				 */
				// fro-each 문 ( 배열과 함께 쓴는 for 문 )
				// : 배열 안네 있는 요소를 하나씩 뽑아서
				// : 좌측에 있는 공간 ( 변수 ) 에 담아준다!
				// : 배열의 크기만큼 반복하는 구조
				for (MemberDTO m : list) {
					System.out.println("====================");
					System.out.print(m.getId() + "\t");
					System.out.print(m.getPw() + "\t");
					System.out.println(m.getAge());
				}
				list.get(0);
			} else {
				System.out.println("잘못된 선택입니다..!");
			}
		} // while 끝

	}

}
