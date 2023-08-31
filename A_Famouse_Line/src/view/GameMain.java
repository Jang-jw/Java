package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.InfoDAO;
import model.InfoDTO;
import model.PlayerDAO;
import model.PlayerDTO;
import model.QuestionDAO;
import model.QuestionDTO;
import model.RankingDAO;
import model.StoreDAO;
import model.StoreDTO;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		MP3Player mp3 = new MP3Player(); // mp3 재생
		QuestionDAO quesDAO = new QuestionDAO(); // DB 쿼리문
		QuestionDTO dto = new QuestionDTO(); // 명대사 mp3 테이블
		PlayerDAO daoP = new PlayerDAO();
		PlayerDTO dtoP = new PlayerDTO();
		ArrayList<QuestionDTO> playList = new ArrayList<QuestionDTO>(); // 문제배열 ArrayList
		StoreDAO sdao = new StoreDAO();
		StoreDTO sdto = new StoreDTO();
		ArrayList<StoreDTO> StoreList = new ArrayList<StoreDTO>(); // 문제배열 ArrayList
		RankingDAO rdao = new RankingDAO();
		InfoDAO idao = new InfoDAO();

		int ranNum = 0;
		String id;
		String pw1;
		int pw2;
		int score = 5;
		int life = 2;

		boolean genreSelQuit = true; // --- 장르선태 while문 제어
		boolean StoreQuit = true; // --- 상점 while문 제어
		int logSel = 0; // ---로그인 선택
		boolean Login = true; // -- 로그인 성공 실패 메소드 반환값
		int menuSel = 0; // -- 메뉴 선택
		boolean mainQuit = true; // -- 가장 큰 while문 반복제어
		int genreSel = 0; // 장르를 선택한 변수

		System.out.println("전원 ON");

		while (mainQuit) {
			System.out.print("[1]로그인 \t [2]회원가입 \t [3]비밀번호 찾기 \t [4]종료 \t>>");
			logSel = sc.nextInt();

			if (logSel == 1) {
				// 로그인
				System.out.println("정보를 확인하겠습니다.");
				System.out.print("아이디 >> ");
				id = sc.next();
				System.out.print("비밀번호 >> ");
				pw1 = sc.next();
				dtoP = new PlayerDTO(id, pw1);
				if (daoP.login(id, pw1) > 0) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("회원 정보가 없습니다.");
					continue;
				}
			} else if (logSel == 2) {
				// 회원 가입
				System.out.println("필수사항을 입력해주세요.(아이디, 비밀번호, 2차 인증번호)");
				System.out.print("아이디 >> ");
				id = sc.next();
				System.out.print("비밀번호 >> ");
				pw1 = sc.next();
				System.out.print("2차 인증번호 >> ");
				pw2 = sc.nextInt();
				dtoP = new PlayerDTO(id, pw1, pw2);
				if (daoP.join(id, pw1, pw2) > 0) {
					System.out.println("회원가입 성공!");
					continue;
				} else {
					System.out.println("회원가입 실패!");
					continue;
				}

			} else if (logSel == 3) {
				// 비밀번호 찾기
				System.out.println("정보를 확인합니다.");
				System.out.print("아이디 >> ");
				id = sc.next();
				System.out.print("2차 인증번호 >> ");
				pw2 = sc.nextInt();
				daoP.findPw(id, pw2);
				continue;
			} else if (logSel == 4) {

				System.out.println("게임을 종료합니다.");
				break;
			} else {
				continue;
			}

			// --------------------------------------------------------------
			if (Login == true) {
				while (true) {
					System.out.print("[1]게임시작 [2]정보조회 [3]랭킹조회 [4]상점 [5]종료 >> ");
					menuSel = sc.nextInt();
					if (menuSel == 1) {
						// 게임시작
						genreSelQuit = true;
						while (genreSelQuit) {
							System.out.println("진행할 장르를 선택해주세요.");
							System.out.print("[1]영화 [2]드라마 [3]게임 >> "); // --------------------------------------수정

							System.out.print("[1]영화명대사 [2]드라마명대사 [3]게임명대사 >> "); // --------------------------수정
							genreSel = sc.nextInt();
							ArrayList<InfoDTO> itemList = idao.itemCheck(id);
							int iNum = 0;
							while (true) {
								System.out.print("힌트를 사용하시겠습니까? \n[1]예 [2]아니요 >> "); // ----------------------수정
								int ok = sc.nextInt();
								System.out.println();

								if (ok == 1) { // -----------------------------------------------------------------수정
									for (int i = 0; i < itemList.size(); i++) {
										String name = itemList.get(i).getItemName();
										System.out.println("[" + (i + 1) + "]" + name); // -------------------------포인트증가
																						// 추가
									}
									System.out.println();
									System.out.print("번호를 입력해 주세요 >> ");
									iNum = sc.nextInt();
									if (iNum <= itemList.size() && iNum >= 1) {
										idao.updateItem(id, itemList.get(iNum - 1).getItemName());
										break;
									}
									System.out.println("선택범위가 아닙니다.");
								} else {
									break;
								}
							}

							score = 5; // -- 획득 가능 점수
							if (iNum == 1) {
								score += 10;
							} else if (iNum == 2) {
								score += 20;
							} else if (iNum == 3) {
								score += 30;
							}

							if (genreSel >= 1 && genreSel <= 3) {
								playList = quesDAO.selectAll(quesDAO.genreSel(genreSel));

							} else {
								System.out.println("범위를 벗어난 선택입니다. 다시 입력해 주세요.");
								System.out.println();
								continue;
							}
							ranNum = ran.nextInt(playList.size());

							life = 2; // -- 문제 푸는 기회제공
							while (life > 0) {
								System.out.println(playList.get(ranNum).getExplication());

								mp3.play(playList.get(ranNum).getPath());

								sc.nextLine();
								System.out.print("정답 : ");
								String cor = sc.nextLine();

								if (quesDAO.isRight(playList, cor, ranNum) == 0) {
									System.out.println("획득 포인트 = " + score);
									sdao.setPoint(score, id);
									sdao.setRank(score, id);
									life = 0;
								} else {
									System.out.println("오답");
									life--;
									score--;
									if (life > 0)
										continue;
								}
								System.out.print("계속 하시겠습니까? Y or N >> ");
								String go = sc.next();
								if (go.equals("Y") && go.equals("y")) { // -----------------------수정
									continue;
								} else {
									genreSelQuit = false;
									continue;
								}

							}
						}

						// ------------------------------------------------

						// 해당 플레이어에게 랭킹과 포인트에 부여

						// ---------------------------------------------------
						// 출제했던 문제 지우기

					} else if (menuSel == 2) { // ------------------------------------------------------------------수정
						// 정보조회
						ArrayList<InfoDTO> playerList = idao.InfoCheck(id);
						ArrayList<InfoDTO> itemList = idao.itemCheck(id);
						System.out.println("ID: " + playerList.get(0).getPlayer_id() + "\t POINT : "
								+ playerList.get(0).getPoint() + "\t SCORE : " + playerList.get(0).getRanking());
						for (int i = 0; i < itemList.size(); i++) {
							System.out.print(
									itemList.get(i).getItemName() + "  " + itemList.get(i).getItemCnt() + "개 ||  ");
						}
						System.out.println();

					} else if (menuSel == 3) {
						// 랭킹조회
						rdao.RankingInfo();

					} else if (menuSel == 4) {
						// 상점
						StoreQuit = true;
						while (StoreQuit) {
							System.out.print("2차 비밀번호를 입력해주세요 >> ");
							int spw = sc.nextInt(); // -- 상점입장시 2차비번을 입력받을 변수
							if (sdao.pw2Check(id, spw)) {
								StoreList = sdao.selectAll();
								System.out.println();
								System.out.println("========================================================");
								System.out.println("1~3번 까지의 목록중에서 골라주세요~ 0을 누르면 나가집니다.");
								System.out.println("  아이템명\t   아이템가격(point)\t 아이템정보      ");
								for (int i = 0; i < StoreList.size(); i++) {
									System.out.println("[" + (i + 1) + "]" + StoreList.get(i).getItemID() + "\t"
											+ StoreList.get(i).getItemPrice() + "p\t\t"
											+ StoreList.get(i).getItemImfor());

									System.out.println();
									// 상점출력
								}
								System.out.println("========================================================");
								int itemNum;
								while (true) {

									System.out.print("구매할 아이템 번호를 입력하세요 >> ");
									itemNum = sc.nextInt();
									if (itemNum >= 1 && itemNum <= StoreList.size()) {

										System.out.print("수량을 입력해주세요. >> ");
										int cnt = sc.nextInt();

										sdao.inRecord(StoreList, id, cnt, itemNum);
										itemNum--;
										int minus = sdao.selectAll().get(itemNum).getItemPrice() * cnt;
										sdao.setPoint(-1 * minus, id);

										System.out.print("계속 이용하시겠습니까? Y or N >>  ");
										String conti = sc.next();
										if (conti.equals("Y") && conti.equals("y")) { // ---------------------------------수정
											continue;
										} else {
											StoreQuit = false;
											break;
										}

									} else if (itemNum == 0) {
										StoreQuit = false;
										break;
									}

									else {
										System.out.println("범위를 벗어난 선택입니다.");
										return;
									}
								}

							} else {
								System.out.println("2차 비번이 틀렸습니다.");
								continue;
							}

						}

					} else if (menuSel == 5) {
						// 종료

						mainQuit = false;
						break;
					} else {
						System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
						continue;
					}

				}
			} else if (Login == false) {
				continue;
			}

		}
		System.out.println("종료되었습니다");
	}

}
