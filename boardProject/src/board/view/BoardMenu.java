package board.view;

import java.util.*;

import board.controller.BoardManager;

public class BoardMenu {
	private Scanner sc = new Scanner(System.in);
	
	public BoardMenu() {}
	
	public void mainMenu() {
		int num;
		BoardManager bm = new BoardManager();
		do {
			System.out.println("\n****** 게시글 서비스 프로그램 ******\n");
			System.out.println("1. 게시글 쓰기");
			System.out.println("2. 게시글 전체 보기");
			System.out.println("3. 게시글 한개 보기");
			System.out.println("4. 게시글 제목 수정");
			System.out.println("5. 게시글 내용 수정");
			System.out.println("6. 게시글 삭제");
			System.out.println("7. 게시글 검색");
			System.out.println("8. 파일에 저장하기");
			System.out.println("9. 정렬하기");
			System.out.println("10. 끝내기");
			System.out.print("메뉴 선택 :");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : bm.writeBoard(); break;  
			case 2 : bm.dispalyAllList(); break;
			case 3 : bm.displayBoard(); break;
			case 4 : bm.modifyTitle(); break;
			case 5 : bm.modifyContent(); break;
			case 6 : bm.deleteBoard(); break;
			case 7 : bm.searchBoard(); break;
			case 8 : bm.saveListFile(); break;
			case 9 : sortSubMenu(); break;
			case 10 : System.out.println("게시글 서비스 프로그램을 종료합니다."); return;
			default : System.out.println("번호를 잘못 입력하셨습니다.");				
			}
		}while(num != 9);
	}
	public void sortSubMenu() {
		int num;
		BoardManager bm = new BoardManager();
		do {
			System.out.println("\n****** 게시글 정렬 메뉴 ******\n");
			System.out.println("1. 글번호순 오름차순정렬");
			System.out.println("2. 글번호순 내림차순정렬");
			System.out.println("3. 작성날짜순 오름차순정렬");
			System.out.println("4. 작성날짜순 내림차순정렬");
			System.out.println("5. 글제목순 오름차순정렬");
			System.out.println("6. 글제목순 내림차순정렬");
			System.out.println("7. 이전 메뉴로 이동");
			System.out.print("메뉴 선택 :");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : bm.sortList(1, false); bm.dispalyAllList(); break;
			case 2 : bm.sortList(1, true); bm.dispalyAllList(); break;
			case 3 : bm.sortList(2, false); bm.dispalyAllList(); break;
			case 4 : bm.sortList(2, true); bm.dispalyAllList(); break;
			case 5 : bm.sortList(3, false); bm.dispalyAllList(); break;
			case 6 : bm.sortList(3, true); bm.dispalyAllList(); break;
			case 7 : System.out.println("이전 메뉴로 이동합니다."); mainMenu(); return;
			default : System.out.println("번호를 잘못 입력하셨습니다."); break;	
			}
		}while(num != 7);
	}
}
